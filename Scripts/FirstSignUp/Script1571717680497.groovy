import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\Downloads\\MaterialLoginExample.apk', true)

Mobile.tap(findTestObject('FirstPage/android.widget.TextView0 - No account yet Create one (1)'), 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (2)'), 'cuk', 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (3)'), 'jan', 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (4)'), 'qwe@gmail.com', 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (5)'), '08215678901', 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (6)'), '123456', 0)

Mobile.setText(findTestObject('FirstPage/android.widget.EditText0 (7)'), '123456', 0)

Mobile.tap(findTestObject('FirstPage/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.closeApplication()

