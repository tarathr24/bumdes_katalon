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

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_konten_edukasi'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_konten_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_tentang_konten'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_video'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_video_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_video_play'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_modul'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_modul_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_modul_download'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_webinar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Konten Edukasi/button_webinar_play'))

WebUI.switchToWindowIndex(0)




