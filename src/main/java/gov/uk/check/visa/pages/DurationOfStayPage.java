package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DurationOfStayPage extends Utility {
/*DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
  'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select moreOrLess stay) and
  'void clickNextStepButton()'*/


    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/label[1]")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/label[1]")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    List<WebElement> planingToStay;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton1;

    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    List<WebElement> planingToWorkInAnyfield;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement messageForVisa;

    public void selectLengthOfStay(String moreOrLess) {
        List<WebElement> list = planingToStay;

        for (WebElement element : list) {
            if (element.getText().equals(moreOrLess)) {
                element.click();
                break;
            }

        }
    }

   /* public void selectLengthOfStay(String moreOrLess) {
        String textLessThanSixMonth=lessThanSixMonths.getText();
        String textMoreThanSixMonth=moreThanSixMonths.getText();
        if (textLessThanSixMonth.equals(moreOrLess)) {
            lessThanSixMonths.click();
            System.out.println("6 months or less is selected");

        } else if (textMoreThanSixMonth.equals(moreOrLess)) {
            moreThanSixMonths.click();
            System.out.println("longer than 6 months is selected");

        } else {
            System.out.println("not valid");
        }
    }*/

    /*public void selectLengthOfStay1(String moreOrLess){
         final String s=moreOrLess;
         final String S1=lessThanSixMonths.toString();
        final String S2=moreThanSixMonths.toString();
         switch (s){
             case S1:
                 lessThanSixMonths.click();
                 break;
             case S2:
                 moreThanSixMonths.click();
                 break;

             default:
                 System.out.println("Invalid value");

         }
     }*/
    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
    }

    public void selectPlaningToWorkInAnyfield(String text) {
        List<WebElement> list = planingToWorkInAnyfield;
        for (WebElement e : list) {
            if (e.getText().equals(text)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnNextStepButton1() {
        clickOnElement(nextStepButton1);
    }

    public boolean verifymessageForVisa(String text) {
        String message = getTextFromElement(messageForVisa);
        if (message.equals(text)) {
            return true;
        }
        return false;
    }


}
