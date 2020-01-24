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

randomNum1 = (max + (new Random().nextInt() % num))

randomNum2 = (max + (new Random().nextInt() % num))

WebUI.callTestCase(findTestCase('LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('USER_MANAGEMENT_OR/userProfileOR/spy/Page_icon-app/a_Build No_aside__toggler'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/spy/Page_icon-app/span_User Management'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/a_Employees'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/button_Manage Employee'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/li_Add Employee'))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Employee ID_ant-input'), String.valueOf(
        randomNum))

//GlobalVariable. newEmployee = 'LBT' + randomNum
//WebUI.delay(4)
WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_First Name_ant-input'), 'FADIPE' + String.valueOf(
        randomNum))

//WebUI.delay(5)
WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Middle Name_ant-input'), 'ABIOLA' + String.valueOf(
        randomNum1))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Last Name_ant-input'), 'OLUWAFEMI' + String.valueOf(
        randomNum2))

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Initials_ant-input'), 'S.F.')

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Short Name_ant-input'), 'ABBY')

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Email Address_ant-input'), ('ABIOLA' + 
    String.valueOf(randomNum1)) + '@EXAMPLE.COM')

WebUI.setText(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/input_Phone Number_ant-input'), ('081' + String.valueOf(
        randomNum1)) + String.valueOf(randomNum))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/div_1'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/li_FULL'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/div_2'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/li_BANK MANAGER - DESIGNATION'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/svg'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/button_Search'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/button_Select'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/div_3'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/li_CAF DEPARTMENT'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/button_Can post teller transaction_ant-switch'))

WebUI.click(findTestObject('USER_MANAGEMENT_OR/employeesOR/Page_icon-app/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.delay(2)

WebUI.closeBrowser()

