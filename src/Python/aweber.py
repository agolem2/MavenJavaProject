import unittest
from selenium import webdriver
from selenium.webdriver.chrome.webdriver import WebDriver
 
class AweberTest(unittest.TestCase):
 
    @classmethod
    def setUpClass(cls):
        cls.driver = webdriver.Chrome('/Users/miloonken/dev/chromedriver')
 
    def test_title(self):
        self.driver.get('https://www.aweber.com')
        self.assertEqual(
            self.driver.title,
            'Email Marketing | AWeber')
        
        #This outputs the content :)
        
    @classmethod
    def tearDownClass(cls):
        cls.driver.quit()