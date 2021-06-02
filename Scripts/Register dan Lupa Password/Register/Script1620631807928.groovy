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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://bumdes-digital.bbri.io/')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_daftar_disini'))

WebUI.setText(findTestObject('Object Repository/Register/input_email'), 'auliashafira270@gmail.com')

WebUI.setText(findTestObject('Object Repository/Register/input_nohp'), '085891262594')

WebUI.setText(findTestObject('Object Repository/Register/input_katasandi'), 'Auliashafira270')

WebUI.setText(findTestObject('Object Repository/Register/input_konfirmasi_katasandi'), 'Auliashafira270')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_daftar'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_lanjutkan'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_verif_email'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_kirim'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Register/button_ok'))

