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
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.uploadFile(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/img_upload'), 'D:\\docker.png')

rand_number = RandStr.randomNumeric(5)

WebUI.setText(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/input_nama_unit_usaha'), 'Jasa Sewa' + rand_number )

WebUI.setText(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/input_tahun_mulai_usaha'), '2020')

WebUI.setText(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/input_nama_pengurus'), 'Deo Prasetyo')

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_jabatan_pengurus'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_jabatan_pengurus_owner'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_sifat_kepemilikan'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_sifat_kepemilikan_swakelola'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_bidang_usaha'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/dropdown_bidang_usaha_jasa'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/checkbox_sektor_usaha'))

WebUI.click(findTestObject('Unit Usaha/Tambah Unit Usaha/Info Unit Usaha/button_selanjutnya'))