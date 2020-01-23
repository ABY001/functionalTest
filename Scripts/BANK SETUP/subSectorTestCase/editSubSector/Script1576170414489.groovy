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

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/Page_icon-app/a_Sub-sector'))

not_run: WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/Page_icon-app/button_Create Sub-Sector'))

not_run: WebUI.setText(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/input_Create Sub-Sector_ant-input'), 
    'SUBSEC100')

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/button_Create Sub-Sector_ant-btn ant-btn-primary ant-input-search-button'))

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/button_SUB SECTOR FOR SUBSEC100_table__btn ant-btn ant-btn-primary ant-dropdown-trigger'))

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/a_ Edit'))

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/div_002'))

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/li_003 - AGRICULTURAL SECTOR'))

WebUI.click(findTestObject('BANK_SETUP_OR/subSectorOR/editSubSector/Page_icon-app/button_Edit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

