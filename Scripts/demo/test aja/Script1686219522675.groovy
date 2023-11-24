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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://acq-skeleton-uat.apps.ocp4dev.muf.co.id/#/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_Mandiri Utama Finance/input_Sign in to manage, track and check yo_bae5ef'), 
    '17008031')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mandiri Utama Finance/input_NIK_mat-input-1'), 'lnBUteI2ioQ=')

WebUI.click(findTestObject('Object Repository/Page_Mandiri Utama Finance/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Mandiri Utama Finance/span_NEW ENTRY'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_PILIH DEBITUR'))

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input_CUSTOMER PERSONAL - IDENTITAS_inp-ktp-debefm'), 
    '3175041609991120')

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-nama-debefm'), 'test kata')

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-no-hp1-debfm'), '082211223322')

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-tempat-lahir-debefm'), 
    'jakarta')

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-tgl-lhr-debefm'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/th_June 2023'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_Sa_fa fa-chevron-left'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/th_2022'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/th_Dec_prev'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/th_Dec_prev'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/th_Dec_prev'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_1995'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_Jan'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/td_1'))

WebUI.focus(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/div_NO KTP DEBITUR                         _c2e9a0'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-tgl-lhr-debefm'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/td_1'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_PILIH JENIS KELAMIN'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_PILIH STATUS PERKAWINAN'))

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_PILIH JENIS NASABAH'))

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/textarea_INFORMASI ALAMAT_inp-alamat-debefm'), 
    'jl dukuh')

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-rt-debefm'), '013')

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input__inp-rw-debefm'), '004')

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/span_PILIH KODE POS'))

WebUI.setText(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/input_Navbar Variants_select2-search__field'), 
    '13550')

WebUI.click(findTestObject('Object Repository/Page_NEW ENTRY  Mandiri Utama Finance/a_Next'))

