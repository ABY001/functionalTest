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

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/a_Business Group'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Manage Business Group'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/div_'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/li_ACCOUNT DEPARTMENT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/div_Multiple Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/input_Reset_ant-checkbox-input'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Confirm Selected'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Add Limit'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/div_Currency Code'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/li_NIGERIAN NAIRA'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Add Limits'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/manageBusinessGroupOR/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

