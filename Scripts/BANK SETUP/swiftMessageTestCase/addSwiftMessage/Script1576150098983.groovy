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

int max = 9

int min = 1

int max2 = 99

int min2 = 10

int num = max - min

int num2 = max2 - min2

randomNum = (max + (new Random().nextInt() % num))

randomNum1 = (max + (new Random().nextInt() % num))

randomNum2 = (max2 + (new Random().nextInt() % num2))

randomNum3 = (max2 + (new Random().nextInt() % num2))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/countryOR/addAndDeleteCIty/Page_icon-app/a_Branch_aside__toggler'))

WebUI.click(findTestObject('BANK_SETUP_OR/spyORRR/Page_icon-app/span_Bank Setup'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/a_Swift Message'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/button_Add Payment System'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/newSpy/SMspy/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/li_RTGS'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/newSpy/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/li_RTGS_MESSAGE_OUTGOING - RTGS MESSAGE OUTGOING'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/newSpy/spy/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/newSpy/spy/Page_icon-app/li_DEFAULT - DEFAULT'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/newSpy/spy/Page_icon-app/li_DEFAULT'))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/input_Event_ant-input'), 'EVENT')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/div5/Page_icon-app/div_'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/li_NGN'))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/input_Minimum Amount_ant-input ant-input'), 
    String.valueOf(randomNum) + '00')

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/input_Maximum amount_ant-input ant-input_1'), 
    String.valueOf(randomNum1) + '0,000')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/button_Add Swift Tag'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/div_Swift Tag Details'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/button_Add Swift Tag'))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/input_Tag_ant-input'), String.valueOf(randomNum2))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/spy/Page_icon-app/input_Description_ant-input'), 
    'A TAG DESCRIPTION')

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/input_Max No of Lines_ant-input ant-input_1_2'), 
    String.valueOf(randomNum2))

WebUI.setText(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/input_Max number of characters per line_ant_ee7646_1_2'), 
    String.valueOf(randomNum3) + '0')

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/Page_icon-app/button_Add Swift Tag'))

WebUI.click(findTestObject('BANK_SETUP_OR/swiftMessageOR/addSwiftMessage/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

