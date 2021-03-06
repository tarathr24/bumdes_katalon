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

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_laporan_keuangan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/card_unit_usaha'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_filter_tanggal'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_reset_filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_urutkan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_terlama'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_lihat'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Detail Laporan/button_close'))

