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

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/Page_Icon Login/input_WELCOME BACK_username'), 'abby')

WebUI.setEncryptedText(findTestObject('USER_MANAGEMENT_OR/Page_Icon Login/input_WELCOME BACK_password'), 
    '3iF79iufxPg=')

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_Icon Login/button_Login'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/div_Applications_item__icon'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/a_User Profile'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Manage User'))

WebUI.sendKeys(findTestObject('USER_MANAGEMENT_OR/spy/input_Employee ID_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Select'))

WebUI.sendKeys(findTestObject('USER_MANAGEMENT_OR/spy/input_User ID_ant-input'), Keys.Chord(Keys.ENTER))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Select'))

WebUI.sendKeys(findTestObject('USER_MANAGEMENT_OR/spy/input_Authorizer ID_ant-input'), Keys.Chord(Keys.ENTER))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Select'))

not_run: WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/svg'))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/input_Max Inactive Days_ant-input ant-input_927f8b'), 
    '30')

not_run: WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/div_Business Group'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_CONTROL - CONTROL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/div_Work Class'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_500 - MANAGER'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/div_'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_093 - DOCEMO'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_094 - NAVY TOWNMAMMY MKT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_095 - OGBAWEMPCO ROAD'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_096 - OKOTAAGO PALACEWAY'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_097 - OSHODIOLUPESI HOUSE'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_098 - VISLAND SAKA TINUBU'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_091 - ONIKANCITY MALL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/li_143 - VISLAND-5'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/Page_icon-app/button_Submit'))

WebUI.closeBrowser()

