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



class LandingPage {



	@When("click button sign up")
	def ClickButtonSignUp() {
		WebUI.waitForElementClickable(findTestObject('Sign Up_Midtrans/Button_SignUp'), 3)
		WebUI.click(findTestObject('Sign Up_Midtrans/Button_SignUp'))
	}

	@Then("system direct to page register")
	def systemDirectToPageRegister() {
		WebUI.switchToWindowIndex(1)
		String Actual = WebUI.getUrl()
		System.out.println(Actual)
		String Expected = 'https://account.midtrans.com/registers'

		WebUI.verifyMatch(Actual, Expected, false)
	}

	@Then("verify all text page register")
	def VerifyAllTextPageRegister() {
		WebUI.verifyTextPresent('BUSINESS NAME', false)

		WebUI.verifyTextPresent('FULL NAME', false)

		WebUI.verifyTextPresent('BUSINESS EMAIL', false)

		WebUI.verifyTextPresent('BUSINESS PHONE NUMBER', false)

		WebUI.verifyTextPresent('PASSWORD', false)

		WebUI.verifyTextPresent('CONFIRM PASSWORD', false)

		WebUI.scrollToElement(findTestObject('Sign Up_Midtrans/button_Register'), 5)

		WebUI.verifyElementInViewport(findTestObject('Sign Up_Midtrans/button_Register'), 30)
	}
}