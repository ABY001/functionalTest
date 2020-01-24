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

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/Page_icon-app/span_Operative Account'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/Page_Operative Account  ICON APP/div_Pending Verification'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/Page_Operative Account  ICON APP/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/Page_Operative Account  ICON APP/svg'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/editCASAaccount/Page_Operative Account  ICON APP/div_CREATE_CASA_ACCOUNT'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/addLienAndFreeze/Page_Operative Account  ICON APP/li_Add freeze'))

WebUI.click(findTestObject('Object Repository/OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/Page_Operative Account  ICON APP/button_Search Request'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/spy/Page_Operative Account  ICON APP/button_insert_table__btn ant-btn ant-btn-primary'))

WebUI.click(findTestObject('OPERATIVE_ACCOUNT_OR/CASA_Maker_Checker/addLienAndFreeze/Page_Operative Account  ICON APP/button_Approvefreeze'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

