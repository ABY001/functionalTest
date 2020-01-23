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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/newSpy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/a_User Profile'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Manage User'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/input_Employee ID_ant-input'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/svg'))

//WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/svg'))
WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/input_User ID_ant-input'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/svg1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Search1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Select1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/input_Authorizer ID_ant-input'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/svg2'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Search2'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Select2'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/div_Business Group'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/li_ACCT - ACCT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/div_Work Class'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/li_100 - DEFAULT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Can Post To Own Account_ant-switch'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Transaction Posting_ant-switch'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/div_Multiple Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Search3'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/input_Reset_ant-checkbox-input'))

WebUI.delay(2)

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Confirm Selected'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/manageUserOR/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

