#ScriptName : Login.py
#---------------------
from selenium import webdriver

#Following are optional required
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException

baseurl = "http://www.google.com"
username = "admin"
password = "admin"

xpaths = { 'usernameTxtBox' : "//input[@name='username']",
           'passwordTxtBox' : "//input[@name='password']",
           'submitButton' :   "//input[@name='login']"
         }

from selenium import webdriver
from selenium.webdriver.firefox.webdriver import FirefoxProfile

profile = FirefoxProfile("/Users/miloonken/Library/Application Support/Firefox/Profiles/tdcsrsht.default")

mydriver = webdriver.Firefox(profile)

mydriver.get(baseurl)
mydriver.maximize_window()
