import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class popUpPaymentStep {

	@Given("navigate go to demo midtrans")
	def NavigaDemoMidtrans() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://demo.midtrans.com/')

		WebUI.maximizeWindow()
	}

	@When("click button buy now")
	def ClickBuyNowButton() {
		WebUI.click(findTestObject('Landing Page/Button_BUY NOW'))
	}

	@Then("system direct to page buy now form")
	def SystemToFormPopUp() {
		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Amount'), '50000')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Name'), 'taehyungkim')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Email'), 'taehyungkim@gmail.com')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_PhoneNo'), '081256738712')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_City'), 'padang')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Address'), 'padang,sumatera barat')

		WebUI.setText(findTestObject('Landing Page/modalSlideOrder/Fill_Postalcode'), '27361')
	}

	@And("user click button checkout")
	def UserCheckout() {
		WebUI.click(findTestObject('Landing Page/modalSlideOrder/Button_CHECKOUT'))
	}

	@And("user click button continue")
	def UserContinue() {
		WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Continue'))
	}

	@When("choose credit card payment method")
	def ChoosesACreditCardForPayment() {
		WebUI.click(findTestObject('Landing Page/PopUp Checkout/Click_CreditDebit Card'))
	}

	@Then("system direct to credit card form")
	def SystemDirectToCreditCardForm() {
		WebUI.verifyElementText(findTestObject('Landing Page/PopUp Checkout/Form_Creditcart'), 'Credit/Debit Card')
	}

	@And("user click button paynow")
	def UserClickButtonPaynow() {
		WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Pay Now'))
	}

	@Then("user fill otp number for discount ten percent")
	def UserFillOtpNumber() {
		WebUI.setEncryptedText(findTestObject('Landing Page/PopUp Checkout/Fill_Passwordtransaksi'), '4tAN/DuJV7Y=')
	}

	@And("user choose button ok")
	def UserChooseButtonOk() {
		WebUI.click(findTestObject('Landing Page/PopUp Checkout/button_OK'))
	}

	@Then("check failed alert")
	def CheckFailedAlert() {
		if(WebUI.verifyElementNotPresent(findTestObject('Landing Page/PopUp Checkout/failed_label'), 2)) {
			System.out.println('Success')
		}
	}

	@And("check discount checkbox ten percent")
	def checkCheckboxTenPercent() {
		WebUI.check(findTestObject('Landing Page/PopUp Checkout/optionPromo 2'))
	}

	@And("check discount checkbox ten rupiah")
	def checkCheckboxTenRupiah() {
		WebUI.check(findTestObject('Landing Page/PopUp Checkout/Check_on'))
	}

	@And("system display error message")
	def SystemDisplayErrorMessage() {
		WebUI.verifyElementText(findTestObject('Landing Page/PopUp Checkout/Decline_errorMessage'), 'Your card got declined by the bank')
	}

	@And("uncheck All discount checkbox")
	def UncheckallCheckbox() {
		WebUI.uncheck(findTestObject('Landing Page/PopUp Checkout/optionPromo 2'))
		WebUI.uncheck(findTestObject('Landing Page/PopUp Checkout/optionPromo 1'))
	}

	@And("user fill otp number")
	def UserFillPassNumber() {
		WebUI.setEncryptedText(findTestObject('Landing Page/PopUp Checkout/Fill_Passwordtransaksi'), '4tAN/DuJV7Y=')
	}

	@Given("user fill cc form")
	def UserFillCCForm() {
		WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_cardnumber'), '4811 1111 1111 1114')

		WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_ExpiredDate'), '01 / 25')

		WebUI.setText(findTestObject('Landing Page/PopUp Checkout/Fill_CVV'), '123')
	}

	@And("user click button paynow full payment")
	def userClickButtonPaynow() {
		WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Pay Now'))
	}
	
	@Then("system display otp page")
	def SystemDisplayOTPPage() {
		WebUI.verifyElementText(findTestObject('Landing Page/PopUp Checkout/IssuingBank'), 'Issuing Bank')
	}

	//	@And("uncheck discount checkbox ten percent")
	//	def uncheckCheckboxTenPercent() {
	//		WebUI.uncheck(findTestObject('Landing Page/PopUp Checkout/Check_off'))
	//
	//		@And("uncheck all discount checkbox")
	//		def uncheckAllDiscountCheckbox() {
	//			WebUI.uncheck(findTestObject('Landing Page/PopUp Checkout/Check_off'))
	//		}
	//
	//		@And("user click button paynow full payment")
	//		def userClickButtonPaynow() {
	//			WebUI.click(findTestObject('Landing Page/PopUp Checkout/Button_Pay Now'))
	//		}
	//	}
}