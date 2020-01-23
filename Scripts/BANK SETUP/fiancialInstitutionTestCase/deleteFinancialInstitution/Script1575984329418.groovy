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

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/addFinancialInstitution/Page_icon-app/a_Financial Institution'))

not_run: WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/deleteFinancialInstitution/spy/Page_icon-app/input_Add Institution_ant-input'), 
    'PEACEFUL')

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/viewFinancialnstitution/Page_icon-app/button_Add Institution_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/deleteFinancialInstitution/spy/Page_icon-app/button_PEACEFUL BANK_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/deleteFinancialInstitution/Page_icon-app/a_ Delete'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/deleteFinancialInstitution/spy/Page_icon-app/button_Yes'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

