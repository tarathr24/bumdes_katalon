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

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/button_lihat_halaman_karakteristik_bisnis_sektor_usaha'))

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_1.1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_1.2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_1.3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_1.4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_2.1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_2.2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_2.3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/soal_2.4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Bisnis Sektor Usaha/button_selanjutnya'))