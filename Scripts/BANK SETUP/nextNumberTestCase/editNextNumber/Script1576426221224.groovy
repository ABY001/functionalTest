import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/a_Next Number'))

not_run: WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/Page_icon-app/input_Add Next Number_ant-input'), 
    'xyz')

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/deleteNextNumberOR/Page_icon-app/button_Add Next Number_ant-btn ant-btn-prim_c0fd96'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/deleteNextNumberOR/Page_icon-app/button_NEXT NUMBER DESCRIPTION FOR XYZ_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/spys/Page_icon-app/a_ Edit'))

WebUI.clearText(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/input_Next Number Description_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/input_Next Number Description_ant-input'), 
    'THE FIRST NEXT NUMBER DESCRIPTION FOR ' + String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/a'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/div_SUFFIX'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/li_Prefix'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/div_GENERAL_LEDGER'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/li_Product Code'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/button_Edit Number Item'))

WebUI.delay(2)

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/editNextNumberOR/newSpy/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

