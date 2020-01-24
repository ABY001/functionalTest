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

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_icon-app/span_Operative Account'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Create Account1'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/div_Select Product Type'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_CURRENT'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/svg'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/button_Search'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/button_Select'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/svg1'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Search2nd'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Select2nd'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_2'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/li_PAST DUE OVERDRAFT AC - 15300'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_3'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_NGN'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/button_Open Account'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_sbuu'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_DEFAULT (System Business Unit Code)'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_acc_type'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_SINGLE'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_Currency Limits'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_Related Party'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_relate'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_ADM - ADMINISTRATOR'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/svg_custom'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Search_cus'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Selectmm'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Add Party'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/div_Mandate'))

WebUI.setText(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/input_Mandate Name_ant-input'), 
    'CURRENT ' + 'FADIPE ABIOLA' + String.valueOf(randomNum))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/div_rel'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/Page_Operative Account  ICON APP/li_DEFAULT'))

WebUI.setText(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/input_Allowed Max Amount_ant-input ant-input'), 
    '1')

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/createCurrentAccount/spy/Page_Operative Account  ICON APP/button_Create Account'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

