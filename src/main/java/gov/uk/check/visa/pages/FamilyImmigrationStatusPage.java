package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    /*FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
  (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'*/

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement yes;


    @CacheLookup
    @FindBy(id = "response-1")
    WebElement no;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectImmigrationStatus(String status){

    }


}
