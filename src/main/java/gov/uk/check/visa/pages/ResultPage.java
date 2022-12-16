package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ResultPage extends Utility {
    //ResultPage - resultMessage locator and
    // create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Check if you need a UK visa')]")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement visaText;

    public boolean confirmResultMessage(String expectedMessage){

    String textFromElement = getTextFromElement(visaText);
    if(textFromElement.equals(expectedMessage)){
        return true;

    }
    return false;
}



}
