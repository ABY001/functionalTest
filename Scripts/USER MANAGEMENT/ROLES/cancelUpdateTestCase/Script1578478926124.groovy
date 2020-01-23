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

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/businessGroupOR/newSpy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/a_Roles'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/div_Pending Authorizations'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/button_No data_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/i_Initiating Branch_anticon anticon-loading'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/div_ROLE_CREATE_APPROVAL'))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/input_Create role approval_ant-select-search__field'), 
    'update')

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/li_Update role approval'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/button_Search Request'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/button_update_table__btn ant-btn ant-btn-primary'))

not_run: WebUI.click(findTestObject('USER_MANAGEMENT_OR/rolesOR/approveUpdateRolesOR/Page_icon-app/button_Cancel'))

WebUI.delay(2)

WebUI.closeBrowser()

