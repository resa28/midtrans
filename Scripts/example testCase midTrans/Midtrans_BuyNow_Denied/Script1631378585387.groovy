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

failed_message = 'Transaction failed'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.midtrans.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Landing Page/Button_BUY NOW'))

WebUI.delay(2)

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Amount'), '50000')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Name'), 'taehyungkim')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Email'), 'taehyungkim@gmail.com')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_PhoneNo'), '081256738712')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_City'), 'padang')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Address'), 'padang,sumatera barat')

WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Postalcode'), '27361')

WebUI.click(findTestObject('Landing Page/modalSlideOrder/Button_CHECKOUT'))

WebUI.delay(2)

WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Continue'))

WebUI.click(findTestObject('Landing Page/PopUp Checkout/Click_CreditDebit Card'))

WebUI.delay(2)

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_cardnumber'), '4911 1111 1111 1113')

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_ExpiredDate'), '01 / 25')

WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_CVV'), '123')

WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Pay Now'))

WebUI.setEncryptedText(findTestObject('Landing Page/PopUp Checkout/Fill_Passwordtransaksi'), '4tAN/DuJV7Y=')

WebUI.delay(2)

WebUI.click(findTestObject('Landing Page/PopUp Checkout/button_OK'))

try {
    if (WebUI.verifyElementNotPresent(findTestObject('Landing Page/PopUp Checkout/failed_label'), 2)) {
        //System.out.println('Success')
        //WebUI.click(findTestObject('Landing Page/PopUp Checkout/a_Use Another Payment Options'))
    }
}
catch (Exception e) {
    //WebUI.closeBrowser()
} 

WebUI.verifyElementText(findTestObject('Landing Page/PopUp Checkout/Decline_errorMessage'), 'Your card got declined by the bank')

