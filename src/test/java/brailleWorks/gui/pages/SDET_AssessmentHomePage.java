package brailleWorks.gui.pages;

import brailleWorks.gui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDET_AssessmentHomePage {

    public SDET_AssessmentHomePage() {
        PageFactory.initElements(Driver.getDriver(),this); // creating constructor so page can be accessed outside of class
    }

    @FindBy(xpath = "/html/body/div[1]/main/article")// this element contained a text() so you can access text by .getText function
    public WebElement bodyText;

    @FindBy(xpath = "/html/body/div[1]/main/article/h1")
    public WebElement bodyGreeting;

    @FindBy(xpath = "/html/body/div[1]/main/div/a")
    public WebElement aboutLink;
}
