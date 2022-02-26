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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cermati.com/gabung-v2?')

int Number = new Random().nextInt((10000 - 1) + 1) + 100

String Email1 = 'cermati_test+' + Number

String Email = Email1 + '@outlook.com'

GlobalVariable.Email = Email

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__email', [(GlobalVariable.Email) : GlobalVariable.Email]), GlobalVariable.Email)

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/button_Dont Allow'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__password'), 
    'Xq+Grj40a3e0nkYhGIsjqg==')

WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_Daftar ke Cermati.comEmail Kata Sandi K_39e489'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__confirmPassword'), 
    'Xq+Grj40a3e0nkYhGIsjqg==')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__firstName'), 'Ori')

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__lastName'), 'Widianto')

int Number1 = new Random().nextInt((999999999 - 10) + 1) + 10

String Phone = '08126782' + Number

GlobalVariable.Phone = Phone

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__mobilePhone', 
    [(GlobalVariable.Phone) : GlobalVariable.Phone]),GlobalVariable.Phone)

WebUI.setText(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/input__residenceCity'), 
    'Jakarta')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/div_KOTA JAKARTA SELATAN'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Bandingkan Kartu Kredit, Pinjaman, Tab_5f1b86/button_Daftar Akun'))
WebUI.delay(10)
WebUI.closeBrowser()

