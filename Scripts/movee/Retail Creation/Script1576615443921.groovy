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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.5.46:9090/sso/sso/login/')

WebUI.setText(findTestObject('Object Repository/Retail CRM by Josh/input_WELCOME BACK_username'), 'josh')

WebUI.setEncryptedText(findTestObject('Object Repository/Retail CRM by Josh/input_WELCOME BACK_password'), '3iF79iufxPg=')

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Login'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_Applications_item__icon'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_Build No_aside__toggler'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/span_CRM'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_Retail'))

WebUI.delay(1.5)

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_New Customer'))

WebUI.setText(findTestObject('Retail CRM by Josh/input_First Name_ant-input'), 'RUKAYAT')

WebUI.setText(findTestObject('Retail CRM by Josh/input_Middle Name_ant-input'), 'HALIMAT')

WebUI.setText(findTestObject('Retail CRM by Josh/input_Last Name_ant-input'), 'ALABI')

WebUI.setText(findTestObject('Retail CRM by Josh/input_Phone Number_ant-input'), '080 5412 4171')

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/input_Date of Birth_ant-calendar-picker-inp_58b197'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_2019'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/span_2010-2019'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_1990-1999'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_1990-1999'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/td_1993'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_Dec'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_Mar'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_2'))

WebUI.setText(findTestObject('Retail CRM by Josh/input_Bank Verification Number_ant-input ant-input'), '22315421354')

WebUI.setText(findTestObject('Retail CRM by Josh/input_Identification Number_ant-input'), '22341548232')

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Perform Dedup Check'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Proceed to Create Customer'))

not_run: WebUI.setText(findTestObject('Object Repository/Retail CRM by Josh/input_Bank Verification Number_ant-input ant-input_1'), 
    '0')

not_run: WebUI.setText(findTestObject('Object Repository/Retail CRM by Josh/input_Bank Verification Number_ant-input ant-input_1_2'), 
    '22341548232')

WebUI.selectOptionByIndex(findTestObject('Retail CRM by Josh/div_'), '4', FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/marital_div'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/li_S - SINGLE'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/div_id_type'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/li_I001 - DRIVERS LICENCE'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/input_Identification Issue Date_ant-calenda_437efa'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_2019'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_2010'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/a_Dec'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/td_Jun'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_8'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/div_Nationality'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/li_NIGERIA'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/div_Gender'))

WebUI.click(findTestObject('Retail CRM by Josh/spyed stuff/li_FEMALE'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_1200 - GENERAL COMMERCE'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_1205 - HEAVY DUTY MACHINERY'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_COMM - COMMERCIAL'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_FMCG - FMCG'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/svg'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Search'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Select'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_KYC Indicator'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_HIGH'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_COMPLETE'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/svg_1'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Search'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Select'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_MAILING_ADDRESS'))

WebUI.setText(findTestObject('Object Repository/Retail CRM by Josh/input_First Name_ant-input'), 'MAFO LANE')

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_NIGERIA'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_ONDO'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_AKURE'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Add          Address'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/path'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Search'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Select'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_NEXT_OF_KIN'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/div_'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/li_SISTER'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Add            Contact'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Next'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Submit'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/span_Pending Authorization'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_ACTIVE_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/path_1'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Search Request'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_ACTIVE_ant-btn ant-btn-primary'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/svg_1_2'))

WebUI.click(findTestObject('Object Repository/Retail CRM by Josh/button_Cancel'))

WebUI.closeBrowser()

