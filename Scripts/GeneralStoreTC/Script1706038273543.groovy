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

Mobile.startApplication('.\\AndroidApp\\General-Store.apk', true)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.Spinner'), 45)

Mobile.tap(findTestObject('Object Repository/android.widget.Spinner'), 0)

Mobile.scrollToText('Andorra')

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Andorra'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.Spinner'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.TextView - Andorra (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.widget.EditText - Enter name here'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter name here'), Name, 0)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.RadioButton - Male'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.RadioButton - Male'), 0)

Mobile.verifyElementChecked(findTestObject('Object Repository/android.widget.RadioButton - Male'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.Button - Lets  Shop'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Lets  Shop'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - Products'), 0)

Mobile.tap(findTestObject('Object Repository/android.support.v7.widget.RecyclerView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.LinearLayout'), 0)

String SelectedItem = Mobile.getText(findTestObject('android.widget.TextView - Air Jordan 4 Retro'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - ADD TO CART'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton'), 0)

String CartItem = Mobile.getText(findTestObject('android.widget.TextView - Air Jordan 4 Retro'), 0)

'Assert the added item in Cart as selected'
Mobile.verifyMatch(SelectedItem, CartItem, false)

Mobile.closeApplication()

