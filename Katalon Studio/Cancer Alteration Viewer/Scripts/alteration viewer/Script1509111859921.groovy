import internal.GlobalVariable;

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://34.235.93.148/CancerCurationView/public/index/index')

WebUI.setText(findTestObject('Page_Cancer Curation Viewer/input_username'), 'osman.siddiqui@sema4genomics.com')

WebUI.setText(findTestObject('Page_Cancer Curation Viewer/input_password'), '12345678')

WebUI.click(findTestObject('Page_Cancer Curation Viewer/input_submit'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_tumorTypeselect'), 'Breast', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_geneselect'), 'ERBB2', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'amplification', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Mutation Information'))

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/a_OncoKB Guideline'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_tumorTypeselect'), 'Colorectal', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_geneselect'), 'AKT1', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'p.E17K', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_tumorTypeselect'), 'Dedifferentiated Liposarcoma', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_geneselect'), 'CDK4', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'amplification', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/a_Help'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_tumorTypeselect'), 'NSCLC', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_geneselect'), 'ALK', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'p.C1156Y', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'p.G1269A', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer/select_mutationselect'), 'p.S1206Y', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Narrative'))

WebUI.click(findTestObject('Page_Cancer Alteration Viewer/button_Log out'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.235.93.148/CancerCurationView/public/index/index')

WebUI.click(findTestObject('Page_Cancer Curation Viewer (1)/div_form'))

WebUI.setText(findTestObject('Page_Cancer Curation Viewer (1)/input_username'), 'osman.siddiqui@sema4genomics.com')

WebUI.setText(findTestObject('Page_Cancer Curation Viewer (1)/input_password'), '12345678')

WebUI.sendKeys(findTestObject('Page_Cancer Curation Viewer (1)/input_password'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer (1)/select_tumorTypeselect'), 'Breast', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer (1)/select_geneselect'), 'ERBB2', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer (1)/select_mutationselect'), '', true)

WebUI.selectOptionByValue(findTestObject('Page_Cancer Alteration Viewer (1)/select_mutationselect'), 'amplification', true)

WebUI.click(findTestObject('Page_Cancer Alteration Viewer (1)/button_Narrative'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.setText(findTestObject('Page_Cancer Curation Viewer (2)/input_username'), 'osman.siddiqui@sema4genomics.com')

WebUI.setText(findTestObject('Page_Cancer Curation Viewer (2)/input_password'), '12345678')

WebUI.click(findTestObject('Page_Cancer Curation Viewer (2)/input_submit'))

WebUI.closeBrowser()

