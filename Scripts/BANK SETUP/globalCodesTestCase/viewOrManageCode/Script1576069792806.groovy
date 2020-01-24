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

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/addCode/Page_icon-app/a_Global Codes'))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/addCode/Page_icon-app/button_Add Code Type_ant-btn ant-btn-primar_d7fd9c'))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/addCode/Page_icon-app/li_8'))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/new/Page_icon-app/button_JUST A SINGLE_table__btn ant-btn ant-btn-primary ant-tooltip-open'))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/new/Page_icon-app/button_Add Code_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/manageButton/Page_icon-app/button_AFORE_table__btn ant-btn ant-btn-primary ant-tooltip-open'))

WebUI.clearText(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/Page_icon-app/input_Extra Information_ant-input'))

WebUI.setText(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/Page_icon-app/input_Extra Information_ant-input'), 'EXTRA INFO FOR CODE' + String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/globalCodesOR/deleteCode/manageButton/Page_icon-app/button_Update'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

