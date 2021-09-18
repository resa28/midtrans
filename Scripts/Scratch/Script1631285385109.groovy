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

WebUI.click(findTestObject('Landing Page/Button_BUY NOW'))

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Amount'), '50000')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Name'), 'taehyungkim')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Email'), 'taehyungkim@gmail.com')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_PhoneNo'), '081256738712')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_City'), 'padang')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Address'), 'padang,sumatera barat')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Postalcode'), '27361')

WebUI.click(findTestObject('Landing Page/modalSlideOrder/Button_CHECKOUT'))

WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Continue'))

WebUI.click(findTestObject('Landing Page/PopUp Checkout/Click_CreditDebit Card'))

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_cardnumber'), '4811 1111 1111 1114')

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_ExpiredDate'), '01 / 25')

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_CVV'), '123')

WebUI.check(findTestObject('Landing Page/PopUp Checkout/optionPromo 1'))

