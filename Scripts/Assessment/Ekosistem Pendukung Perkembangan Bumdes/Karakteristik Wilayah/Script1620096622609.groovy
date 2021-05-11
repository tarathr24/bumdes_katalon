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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_assessment'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/button_detail'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/button_lanjutkan_asseesment'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/button_lihat_halaman_karakteristik_wilayah'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_1.1_checkbox'))

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_1.2_checkbox'))
	
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_2_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_3_input'))
WebUI.clearText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_3_input'))
WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_3_input'), '15')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_4_input'))
WebUI.clearText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_4_input'))
WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_4_input'), '15')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_5.1_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_5.2_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_5.3_radio'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_6_input'))
WebUI.clearText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_6_input'))
WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/soal_6_input'), '120')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Wilayah/button_selanjutnya'))
