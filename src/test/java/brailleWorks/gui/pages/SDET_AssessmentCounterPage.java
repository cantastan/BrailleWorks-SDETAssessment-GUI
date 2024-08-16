package brailleWorks.gui.pages;

import brailleWorks.gui.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDET_AssessmentCounterPage {

    public SDET_AssessmentCounterPage () {   // DO NOT FORGET THIS STEP
        PageFactory.initElements(Driver.getDriver(),this); // creating constructor so page can be accessed outside of class
    }

    @FindBy(xpath = "//a[@class='nav-link']")
    public WebElement counterLinkTab;

    @FindBy(xpath = "//h1[@tabindex='-1']")
    public WebElement counterPageText;

    @FindBy(xpath = "/html/body/div[1]/main/article/button")
    public WebElement clickMeButton;

    @FindBy(xpath = "//p[@role='status']")//p[@role='status'] /html/body/div[1]/main/article/p/text()[2]
    public WebElement countChanging;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/nav/div[1]/a")
    public WebElement homeLink;

}
