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

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/addFinancialInstitution/Page_icon-app/a_Financial Institution'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/viewFinancialnstitution/Page_icon-app/button_Add Institution_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/deleteFinancialInstitution/spy/Page_icon-app/button_PEACEFUL BANK_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/a_ Edit'))

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/input_Bank Name_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/input_Bank Name_ant-input'), 
    'UNION BANK')

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Branch Code_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Branch Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Bank Address_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Bank Address_ant-input'), 
    'IJAPO')

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/newSpys/Page_icon-app/li_34 - EKITI'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/newSpys/Page_icon-app/div_7386'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/newSpys/Page_icon-app/li_0017 - ADO-EKITI'))

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Zip Code_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_Zip Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_MICR Bank Code_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/input_MICR Bank Code_ant-input'), 
    String.valueOf(randomNum))

WebUI.clearText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/input_Business Identifier Code (BIC)_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/input_Business Identifier Code (BIC)_ant-input'), 
    String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/latestSpy/Page_icon-app/button_Add Payment System'))

WebUI.click(findTestObject('BANK_SETUP_OR/financialInstitutionOR/editFinancialInstitution/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

