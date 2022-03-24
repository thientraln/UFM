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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://shopee.vn/')

WebUI.setText(findTestObject('Object Repository/Page_Shopee Vit Nam  Mua v Bn Trn ng Dng Di_fbcf77/input_ng Nhp_shopee-searchbar-input__input'), 
    'tai nghe')

WebUI.click(findTestObject('Object Repository/Page_Shopee Vit Nam  Mua v Bn Trn ng Dng Di_fbcf77/button_ng Nhp_btn btn-solid-primary btn--s _eb3780'))

WebUI.click(findTestObject('Object Repository/Page_tai nghe gi tt Thng 2, 2022  Mua ngay _1ba4f2/div_Bn chy'))

WebUI.click(findTestObject('Object Repository/Page_tai nghe gi tt Thng 2, 2022  Mua ngay _1ba4f2/i'))

WebUI.click(findTestObject('Object Repository/Page_tai nghe gi tt Thng 2, 2022  Mua ngay _1ba4f2/button_2'))

WebUI.closeBrowser()

