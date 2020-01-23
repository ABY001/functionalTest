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

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/a_User Profile'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Pending Authorizations_ant-btn ant-b_3a46fa'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/viewUserOR/Page_icon-app/button_ADALLL_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/a_Edit'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/div_Business GroupADALLL - ADALLL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/li_DAFAULT - DAFAULT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/div_Work Class300 - TELLER'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/li_500 - MANAGER'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Pending Authorizations_ant-btn ant-b_3a46fa'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/div_Multiple Select9990938 more'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Searchnew'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/input_Reset_ant-checkbox-input'))

WebUI.delay(2)

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Confirm Selected1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/editUserOR/Page_icon-app/button_Update1'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

