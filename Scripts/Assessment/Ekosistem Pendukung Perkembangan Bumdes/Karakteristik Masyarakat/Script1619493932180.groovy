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

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/button_lanjutkan_asseesment') )

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/button_lihat_karakteristik_masyarakat'))

WebUI.setText(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_1_input'), '120')

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_2_radio'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_3_1_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_3_2_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_3_3_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_3_4_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_3_5_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_4_1_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_4_2_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_4_3_checkbox'))

WebUI.click(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_5_radio'))

WebUI.setText(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_6_input'), '24')

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'))

WebUI.selectOptionByLabel(findTestObject('Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'), '1')

