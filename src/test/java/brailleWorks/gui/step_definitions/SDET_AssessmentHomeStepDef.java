package brailleWorks.gui.step_definitions;

import brailleWorks.gui.pages.AboutLinkRedirectHomePage;
import brailleWorks.gui.pages.SDET_AssessmentCounterPage;
import brailleWorks.gui.pages.SDET_AssessmentHomePage;
import brailleWorks.gui.utilities.BrowserUtilities;
import brailleWorks.gui.utilities.ConfigurationReader;
import brailleWorks.gui.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SDET_AssessmentHomeStepDef {
    SDET_AssessmentHomePage SDET_AssessmentHomePage = new SDET_AssessmentHomePage();// gain access to locaters in this page class
    AboutLinkRedirectHomePage AboutLinkRedirectHomePage = new AboutLinkRedirectHomePage();// gain access to locaters in this page class

    @Given("user is on the SDET_Assessment Home page")
    public void user_is_on_the_sdet_assessment_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sdetAssessmentHomeUrl")); // this will gain access to URL using configuration.properties key=value
    }

    @Then("user should see title is Home")
    public void user_should_see_title_is_home() {
        System.out.println("SDET_AssessmentHomePage title = " + Driver.getDriver().getTitle());// just to see, can be removed
        BrowserUtilities.verifyTitle("Home"); // this will take expectedTitle input and check if it equals actual title if fails returns message
    }

    @Then("user should see Hello, world! Welcome to your new app. on webpage body")
    public void user_should_see_hello_world_welcome_to_your_new_app_on_webpage_body() {
        System.out.println("SDET_AssessmentHomePage.bodyGreeting = " + SDET_AssessmentHomePage.bodyGreeting.getText());//just to see
        System.out.println("SDET_AssessmentHomePage.bodyText.getText() = " + SDET_AssessmentHomePage.bodyText.getText());// just to see
        Assert.assertTrue(SDET_AssessmentHomePage.bodyGreeting.isDisplayed());// this will check if element is displayed true=passed false=failed
        Assert.assertTrue(SDET_AssessmentHomePage.bodyText.isDisplayed());// this will check if element is displayed you can also do equals method depending on requirements

    }

    @Given("user clicks on About link")
    public void user_clicks_on_about_link() {
        SDET_AssessmentHomePage.aboutLink.click();
        BrowserUtilities.sleep(2);// this will pause next step for given number of seconds allows for system/browser/selenium to catch up
    }

    @When("user is redirected to About links url")
    public void user_is_redirected_to_about_links_url() {
        BrowserUtilities.switchWindowAndVerify("https://learn.microsoft.com/en-us/aspnet/core/?view=aspnetcore-8.0","ASP.NET documentation | Microsoft Learn");// this will take two arguments one actual url and one is actual title as string then creating a Set<String> store all window handles inside, then using for each look iterating through all the window handles then if the window handle url matches the url you provided as an argument it will break/stop/exit the loop stopping the Driver at that exact window handle then performed assertions to verify if you are actually there or not by checking title against what you provided as an argument.
        System.out.println("AboutLinkRedirectHomePage title = " + Driver.getDriver().getTitle());// just to see
    }

    @Then("user should see new url Title")
    public void user_should_see_new_url_either_different_tab_or_page() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("ASP.NET documentation | Microsoft Learn"));
    }
}
