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

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_assessment'))

//WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/button_mulai'))

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/button_detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/button_lanjutkan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_1_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_2_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_3_button'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_4_checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_7_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_6.1_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_6.2_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_6.3_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_6.4_radio'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.1_input'),
	'70')

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.2_input'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.2_input'),
	'80')

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.3_input'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.3_input'),
	'90')

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.4_input'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/soal_5.4_input'),
	'100')

WebUI.click(findTestObject('Object Repository/Assessment/Indikator Keberhasilan Bumdes/Perspektif Sosial/button_selanjutnya'))

