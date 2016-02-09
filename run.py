#coding:utf-8
import os
import os.path

#remove previous data
os.system("adb shell rm -rf sdcard/report.xml")
filename = 'report.xml'
if os.path.exists(filename):
    os.remove(filename)

#uninstall APP and test APP
os.system("adb uninstall com.example.todolist")
os.system("adb uninstall com.example.todolist.test")

#build test APP
os.system("ant clean debug")

#install APP and test APP
os.system("adb install ../todolist/bin/todolist-debug.apk")
os.system("adb install bin/todolistTest-debug.apk")

#start test test
os.system("adb shell am instrument -w -e reportDir sdcard -e reportFile report.xml com.example.todolist.test/.Runner.Runner1")

#pull test report
os.system("adb pull sdcard/report.xml ./report.xml")
