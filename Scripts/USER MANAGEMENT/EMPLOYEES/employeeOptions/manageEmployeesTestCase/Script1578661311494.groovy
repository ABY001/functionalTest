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

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/spy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/a_Employees'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Manage Employee'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/li_Manage Employee'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Employee ID_ant-btn ant-btn-primary _f45817'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/div_'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/li_FULL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/div_1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/li_AM - ASSISTANT MANAGER'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Search1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Select1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/div_2'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/li_CAF DEPARTMENT'))

not_run: WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/Page_icon-app/button_Employee ID_ant-btn ant-btn-primary _f45817'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/newSpy/Page_icon-app/button_Can post teller transaction_ant-switch'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/manageEmployeeOR/newSpy/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

