package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
/*ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
  and  'void clickNextStepButton()'*/

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;


    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonForVisitList;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement visaText;

    public void selectReasonForVisit(String reason) {
        //List<WebElement> list = reasonForVisitList;
        System.out.println(reason);
        for (WebElement e : reasonForVisitList) {
            //System.out.println(e.getText());
          //  System.out.println(e.toString());
           // System.out.println(e);
            if (e.getText().equals(reason)) {
                e.click();
                break;
            }

        }

    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }

    public String verifyVisaText() {
        return getTextFromElement(visaText);
    }


}
