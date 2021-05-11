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

WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_dashboard'))

WebUI.verifyTextPresent('Selamat Datang Tara!', true)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_profil'))

WebUI.verifyTextPresent('Profile', true)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_unit_usaha'))

WebUI.verifyTextPresent('Unit Usaha', true)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_assessment'))

WebUI.verifyTextPresent('Assesment', true)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_laporan_keuangan'))

WebUI.verifyTextPresent('Laporan Keuangan', true)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_konten_edukasi'))

WebUI.verifyTextPresent('Konten Edukasi', true)

