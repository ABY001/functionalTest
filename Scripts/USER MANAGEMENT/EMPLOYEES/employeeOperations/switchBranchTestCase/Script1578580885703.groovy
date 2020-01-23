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

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/a_Employees'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/Page_icon-app/button_Pending Authorizations_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/button_Search Employee'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/Page_icon-app/button_CASHIER_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/a_Change Branch'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/div_'))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/input_Operational Branch_ant-select-search__field'), 
    '999')

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/li_999 - HBC HEAD OFFICE'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/employeeOperations/switchBranchOR/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

