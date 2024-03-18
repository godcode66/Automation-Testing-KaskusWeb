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

WebUI.navigateToUrl('https://www.kaskus.co.id/')

WebUI.setText(findTestObject('Object Repository/Pencarian Komunitas/Thread Detail/Page_KASKUS - Berbagi Hobi, Berkomunitas/input_Komunitas Populer_search'), 
    'jual beli sepeda')

WebUI.click(findTestObject('Object Repository/Pencarian Komunitas/Thread Detail/Page_KASKUS - Berbagi Hobi, Berkomunitas/i_Komunitas Populer_icon_icon__yxYJh h-5 w-_059cf0'))

WebUI.click(findTestObject('Object Repository/Pencarian Komunitas/Thread Detail/Page_Hasil Pencarian jual beli sepeda  KASKUS/a_Remaja Pencuri Sepeda Motor Ditangkap saa_57820b'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

