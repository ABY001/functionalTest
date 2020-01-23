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
import org.openqa.selenium.Keys as Keys
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/a_Next Number'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/button_Add Next Number'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/Page_icon-app/li_TOP_UP - TOP UP'))

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/input_Next Number Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/Page_icon-app/li_Customer'))

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy2/Page_icon-app/input_Next Number Description_ant-input'), 
    'NEXT NUMBER DESCRIPTION FOR ' + String.valueOf(randomNum))

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/input_Number Length_ant-input ant-input'), 
    '6' )

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy3/Page_icon-app/input_Running Serial (eg 9999)_ant-input ant-input'), 
    '88888')

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/button_Add Number Items'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy2/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/Page_icon-app/li_Suffix'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy3/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/Page_icon-app/li_General Ledger Code'))

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy3/Page_icon-app/input_Start Character_ant-input ant-input'), 
    '3' )

WebUI.setText(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy3/Page_icon-app/input_End Character_ant-input ant-input'), 
    '3' )

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/addNextNumberFOR/spy/spy3/Page_icon-app/button_Add Number Item'))

WebUI.click(findTestObject('BANK_SETUP_OR/NextNumberOR/addNextNumberOR/Page_icon-app/button_Submit'))

WebUI.delay(3)

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

