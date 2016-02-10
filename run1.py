#coding:utf-8
import os
import os.path
import glob

#remove previous data
os.system("adb shell rm -rf sdcard/report*.xml")
for infile in glob.glob(os.path.join(".", 'report*.xml') ):  
	os.remove(infile)  
if os.path.exists("total.txt"):
	os.remove("total.txt")
os.system("adb shell rm -rf sdcard/crash.xml")

#uninstall APP and test APP
os.system("adb uninstall com.example.todolist")
os.system("adb uninstall com.example.todolist.test")

#build test APP
os.system("ant clean debug")

#install APP and test APP
os.system("adb install ../todolist/bin/todolist-debug.apk")
os.system("adb install bin/todolistTest-debug.apk")

#start test
re_run = True
count = 0
re_generate_tests = False
while re_run:
	exe_str = "adb shell am instrument -w -e reportDir sdcard -e reportFile report_" + str(count) + ".xml  -e isNeedReGenerate " + str(re_generate_tests) + " com.example.todolist.test/.Runner.Runner1"
	os.system(exe_str)
	os.system("adb pull sdcard/report_"+str(count)+".xml report_"+str(count)+".xml")
	os.system("adb pull sdcard/crash.txt .")
	if os.path.exists("crash.txt"):
		print("crash happen")
		f1 = open('crash.txt','r')    
		name = f1.readline()
		f1.close()
		f2 = open('total.txt','a')  
		f2.write(name)
		f2.write("\n")
		f2.close()
		os.remove("crash.txt")
		re_generate_tests = True
		count+=1
	else:
		re_run = False

def check(filename,text):
	datafile = open(filename)
	found = False 
	for line in datafile:
		if text in line:
			return True
	return False

for infile in glob.glob(os.path.join(".", 'report*.xml')):  
	if not check(infile,"</testsuites>"):
		f=open(infile,'a')
		f.write("</testsuites>")
		f.close()
