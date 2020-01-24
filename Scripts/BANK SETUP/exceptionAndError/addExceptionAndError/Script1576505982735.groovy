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
import java.util.Random as Random

int max = 9999

int min = 101

int num = max - min

randomNum = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/Page_icon-app/a_Exception and Error'))

WebUI.click(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/Page_icon-app/button_Add Exception and Error'))

WebUI.setText(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/spy/Page_icon-app/input_Code_ant-input'), String.valueOf(randomNum))

WebUI.setText(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/spy/Page_icon-app/input_Code Description_ant-input'), 'EXCEPTION TEST' + String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/Page_icon-app/li_ERROR'))

WebUI.setText(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/spy/Page_icon-app/input_Message_ant-input'), 'EXCEPTION ERROR MESSAGE FOR EXCEPTION' + String.valueOf(randomNum))

WebUI.click(findTestObject('BANK_SETUP_OR/exceptionAndErrorOR/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

