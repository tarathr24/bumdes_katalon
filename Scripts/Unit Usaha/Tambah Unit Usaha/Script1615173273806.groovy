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
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_unit_usaha'))

WebUI.delay(2)

WebUI.verifyTextPresent('Tambah Unit Usaha', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_BUMDES DIGITAL/button_Tambah Unit Usaha'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Unit Usaha/Info Unit Usaha'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Unit Usaha/Persfektif Bisnis'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Unit Usaha/Karakteristik Bisnis Sektor Usaha'), [:], FailureHandling.STOP_ON_FAILURE)

