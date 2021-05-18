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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://bumdes-digital.dev.ddb.id/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_BUMDES DIGITAL/div_Login_a-decoration__right'))

WebUI.setText(findTestObject('Object Repository/Page_BUMDES DIGITAL/input_Selamat Datang_valueNik'), 'nuraidadwiyanti@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_BUMDES DIGITAL/input_Selamat Datang_valuePin'), 'Nuraidadwiyanti1')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BUMDES DIGITAL/button_Login'))

WebUI.waitForPageLoad(5)

WebUI.verifyTextPresent('Selamat Datang', true, FailureHandling.OPTIONAL)

