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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

'notif required muncul karena username kosong'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), '')

'notif required muncul karena password kosong'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

'ss'
WebUI.delay(2)

WebUI.takeFullPageScreenshot()

'notif required muncul karena username kosong'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), '')

'pw benar\r\n'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'admin123')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.delay(2)

'ss'
WebUI.takeFullPageScreenshot()

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

'isi username'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

'notif required muncul karena password kosong'
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), '')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.delay(2)

'ss'
WebUI.takeFullPageScreenshot()

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Username_username'), Keys.chord(Keys.SHIFT, Keys.ARROW_UP))

WebUI.sendKeys(findTestObject('Page_OrangeHRM/input_Username_username'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

'output sesuai'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.verifyTextPresent('Dashboard', false)

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

