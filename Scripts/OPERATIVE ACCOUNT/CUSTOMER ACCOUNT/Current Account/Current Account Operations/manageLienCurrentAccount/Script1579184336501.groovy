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

int max = 99

int min = 11

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_icon-app/span_Operative Account'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_Operative Account  ICON APP/button_Closed Accounts_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_Operative Account  ICON APP/div_Product Type            SAVINGS'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_Operative Account  ICON APP/li_CURRENT'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_Operative Account  ICON APP/button_Search Account'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_Operative Account  ICON APP/button_SINGLE_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/a_Manage Lien'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/button_New Lien'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/div_'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/li_COLLATERAL TO ADVANCES'))

WebUI.setText(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/input_Lien Amount_ant-input ant-input'), 
    String.valueOf(randomNum) + '0000')

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/input_Lien Expiry Date_ant-calendar-picker-input ant-input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/a_Jan_ant-calendar-next-year-btn'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/div_19'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/button_Add1'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/Page_Operative Account  ICON APP/button_Add Lien'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

