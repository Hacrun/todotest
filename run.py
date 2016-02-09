#coding:utf-8
import os
import os.path
import sys

devices_id = sys.argv[1]
print "=================================="+devices_id
pre_execute_str = "adb -s" + devices_id
#remove previous data
os.system(pre_execute_str + " shell rm -rf sdcard/report.xml")
filename = 'report.xml'
if os.path.exists(filename):
    os.remove(filename)

#uninstall APP and test APP
os.system(pre_execute_str + " uninstall com.example.todolist")
os.system(pre_execute_str + " uninstall com.example.todolist.test")

#build test APP
os.system("ant clean debug")

#install APP and test APP
os.system(pre_execute_str + " install ../todolist/bin/todolist-debug.apk")
os.system("adb install bin/todolistTest-debug.apk")

#start test
os.system(pre_execute_str + " shell am instrument -w -e reportDir sdcard -e reportFile report.xml com.example.todolist.test/.Runner.Runner1")

#pull test report
os.system(pre_execute_str + " pull sdcard/report.xml ./report.xml")
