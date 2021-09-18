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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://account.midtrans.com/register')

WebUI.setText(findTestObject('Sign Up_Midtrans/Fill_BusinessName'), 'Caca')

WebUI.setText(findTestObject('Sign Up_Midtrans/Fill_FullName'), 'CacaKim')

WebUI.setText(findTestObject('Sign Up_Midtrans/Fill_BusinessEmail'), 'ckbol00@gmail.com')

WebUI.setText(findTestObject('Sign Up_Midtrans/Fill_BusinessPhoneNumber'), '087654888493')

WebUI.setEncryptedText(findTestObject('Sign Up_Midtrans/Fill_Password'), 'QavN1FNsfHHmZzHLq64cUg==')

WebUI.setEncryptedText(findTestObject('Sign Up_Midtrans/Fill_ConfirmPassword'), 'QavN1FNsfHHmZzHLq64cUg==')

WebUI.click(findTestObject('Sign Up_Midtrans/button_Register'))

WebUI.delay(5)

String url = WebUI.getUrl()

WebUI.verifyEqual(url, 'https://account.midtrans.com/login?complete=1')

