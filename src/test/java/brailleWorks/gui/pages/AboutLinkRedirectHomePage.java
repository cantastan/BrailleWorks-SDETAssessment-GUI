package brailleWorks.gui.pages;

import brailleWorks.gui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutLinkRedirectHomePage {

    public AboutLinkRedirectHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/head/title")
    public WebElement title;
}
