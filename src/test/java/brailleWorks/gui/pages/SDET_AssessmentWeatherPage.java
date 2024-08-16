package brailleWorks.gui.pages;

import brailleWorks.gui.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SDET_AssessmentWeatherPage {

    public SDET_AssessmentWeatherPage() {// DO NOT FORGET THIS STEP
        PageFactory.initElements(Driver.getDriver(),this); // creating constructor so page can be accessed outside of class
    }

    @FindBy(xpath = "//a[@href='weather']")
    public WebElement weatherLink;

    @FindBy(xpath = "//h1[@tabindex='-1']")
    public WebElement weatherBodyTitle;

    @FindBy(xpath = "/html/body/div[1]/main/article/button")
    public WebElement downloadButton;

    @FindBy(xpath = "/html/body/div[1]/main/article/input")
    public WebElement fileInput;

    @FindBy(xpath = "/html/body/div[1]/main/article/table/thead/tr/th[1]")
    public WebElement tableDateColumn;

    @FindBy(xpath = "/html/body/div[1]/main/article/table/thead/tr/th[2]")
    public WebElement tableTempCColumn;

    @FindBy(xpath = "/html/body/div[1]/main/article/table/thead/tr/th[3]")
    public WebElement tableTempFColumn;

    @FindBy(xpath = "/html/body/div[1]/main/article/table/thead/tr/th[4]")
    public WebElement tableSummaryColumn;
}
