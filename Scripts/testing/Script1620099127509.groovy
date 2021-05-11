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

import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'), '1')
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'), '4')
//WebUI.sendKeys(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.1_input'), Keys.chord(Keys.ARROW_DOWN,Keys.ENTER))

//WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.2_input'))

//WebUI.sendKeys(findTestObject('Object Repository/Assessment/Ekosistem Pendukung perkembangan Bumdes/Karakteristik Masyarakat/soal_7.2_input'), Keys.chord(Keys.ENTER))
