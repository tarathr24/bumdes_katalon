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

//WebUI.callTestCase(findTestCase('Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_profil'))

WebUI.click(findTestObject('Profil/Ubah Keamanan/button_ubah_keamanan'))

WebUI.click(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_katasandi_lama'))

WebUI.setText(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_katasandi_lama'), 'Ashrisasongk0')

WebUI.click(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_katasandi_baru'))

WebUI.setText(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_katasandi_baru'), 'Ashrisasongko1')

WebUI.click(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_confirm_katasandi'))

WebUI.setText(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_confirm_katasandi'), 'Ashrisasongko1')

WebUI.click(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_simpan'))

WebUI.click(findTestObject('Object Repository/Profil/Ubah Keamanan/Ubah Kata Sandi/btn_ok'))

