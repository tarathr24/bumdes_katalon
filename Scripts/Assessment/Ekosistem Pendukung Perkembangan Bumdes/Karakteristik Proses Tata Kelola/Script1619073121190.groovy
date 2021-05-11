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

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/button_detail'))

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/button_lanjutkan_asseesment'))

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/button_lihat_halaman_karakteristik_proses_tata_kelola'))

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_3'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/input_soal_4'), '500000000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/input_soal_5'))

WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/input_soal_5'), '200000000')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_6'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_7'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/soal_8'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Proses Tata Kelola/button_selanjutnya'))