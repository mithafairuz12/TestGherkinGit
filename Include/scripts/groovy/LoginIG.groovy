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



class LoginIG {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User access Instagram page")
	def User_access_Instagram_page() {
		WebUI.openBrowser("https://www.instagram.com/?hl=en")
		//println "User access Login Facebook page"
	}

	@When("User fill (.*) valid username")
	def User_fill_xy_valid_username(String xy) {
		WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_Phone number, username, or email_username'), xy)
	}
		
	@And("User fill (.*) with invalid password")
	def User_fill_passw_with_invalid_password(String passw) {
		WebUI.setText(findTestObject('Object Repository/Page_Instagram/input_Password_password'), passw)
		//println pass
	}
	
	@And("User click Login ig button")
	def User_click_Login_ig_button() {
		WebUI.click(findTestObject('Object Repository/Page_Instagram/button_Log In'))
		//println "User click Login button"
	}
	
	@Then ("User failed to login")
	def User_failed_to_login() {
		WebUI.click(findTestObject('Object Repository/Page_Instagram/p_Sorry, your password was incorrect. Pleas_47a749'))
		//println "User has been successfully login"
	}
	
	@And("User close browser")
	def User_close_browser() {
		WebUI.closeBrowser()
		//println "User click Login button"
	}
}