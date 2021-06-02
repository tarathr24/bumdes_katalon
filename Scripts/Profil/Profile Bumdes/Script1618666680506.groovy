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

WebUI.uploadFile(findTestObject('Object Repository/Profil/Profile Bumdes/img_upload'), '/mnt/img/docker.png')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_nama_direktur'), 'Setiawan Akbar')

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_jabatan'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_jabatan_pengurus'))

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_nomor_telepon_direktur'), '081288050084')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_nama_bumdes'), 'Jasa Sewa')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_tahun_berdiri'), '2020')

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_bulan_berdiri'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_bulan_berdiri_juni'))

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_jumlah_karyawan_tetap'), '1000')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_jumlah_karyawan_tetap_desa_lokal'), '500')

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_provinsi'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_provinsi_jatim'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_kota_kabupaten'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_kota_kabupaten_kediri'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_kecamatan'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/dropdown_kecamatan_papar'))

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_kodepos'), '16412')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_alamat'), 'Grand Depok City')

WebUI.setText(findTestObject('Object Repository/Profil/Profile Bumdes/input_nomor_registrasi'), '1901061002')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/button_simpan'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/checkbox_confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/button_simpan_confirm'))

WebUI.click(findTestObject('Object Repository/Profil/Profile Bumdes/button_ok'))