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

WebUI.click(findTestObject('Object Repository/Daftar Menu/btn_laporan_keuangan'))

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/button_buat_transaksi'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/button_buat_transaksi_popup'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/dropdown_unit_usaha'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/dropdown_unit_usaha_jasasewa'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_1_penyetoran_modal_awal'), '1000000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_2_pinjaman_ke_bank'), '500000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_3_harga_perolehan_bangunan'), '240000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_4_umur_aset_bangunan'), '120')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_5_harga_perolehan_kendaraan'), '18000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_6_umur_aset_kendaraan'), '60')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_7_membeli_persediaan_secara_utang_usaha'), '20000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_8_pembayaran_sewa_dibayar_dimuka_atas_lahan_yang_digunakan'), '24000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_9_masa_sewa'), '24')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_10_retur_pembelian_persediaan_yang_rusak'), '1000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_11_harga_perolehan_pembelian_mesin_baru'), '6000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_12_umur_aset_pembelian_mesin_baru'), '60')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_13_pembayaran_hutang'), '10000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_14_menerima_pendapatan_jasa_otomotif_secara_tunai'), '100000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_15_memberikan_jasa_perbaikan_mobil_secara_tunai'), '45000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_16_memberikan_jasa_perbaikan_mobil_dibayarkan_kemudian'), '5000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_17_pengeluaran_untuk_biaya_tenaga_kerja_harian'), '5000000')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/input_18_penyusutan_persediaan'), '100000')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/button_simpan_laporan'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Laporan Keuangan/Buat Transaksi/button_ok'))