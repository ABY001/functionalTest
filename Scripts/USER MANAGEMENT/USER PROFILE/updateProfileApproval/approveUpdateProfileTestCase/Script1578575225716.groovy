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

WebUI.callTestCase(findTestCase('LOGIN_APPROVE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CURRENT ACCOUNT/viewCurrentAccount/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/newSpy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/a_User Profile'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/div_Pending Authorizations'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/spy/Page_icon-app/div_PROFILE_CREATE_APPROVAL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/spy/Page_icon-app/li_Update profile approval'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/approveUserOR/Page_icon-app/button_Approve'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

