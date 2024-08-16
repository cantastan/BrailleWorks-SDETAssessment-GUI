package brailleWorks.gui.step_definitions;

import brailleWorks.gui.pages.SDET_AssessmentCounterPage;
import brailleWorks.gui.utilities.BrowserUtilities;
import brailleWorks.gui.utilities.ConfigurationReader;
import brailleWorks.gui.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SDET_AssessmentCounterStepDef {
    SDET_AssessmentCounterPage SDET_AssessmentCounterPage = new SDET_AssessmentCounterPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user click on Counter link tab button")
    public void user_click_on_counter_link_tab_button() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sdetAssessmentHomeUrl"));// you could start directly on the counterUrl but i wanted to use different classes
        actions.click(Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"))).perform(); //trying different classes/libraries

    }
    @Then("user should see title is Counter")
    public void user_should_see_title_is_counter() {
        BrowserUtilities.verifyTitle("Counter");
    }
    @Then("user should see Counter in large front in body of page")
    public void user_should_see_counter_in_large_front_in_body_of_page() {
        System.out.println("SDET_AssessmentCounterPage.counterPageText.getText() = " + SDET_AssessmentCounterPage.counterPageText.getText());
        SDET_AssessmentCounterPage.counterPageText.isDisplayed();
    }

    @When("user clicks on the click me button")
    public void user_clicks_on_the_click_me_button() {
        SDET_AssessmentCounterPage.clickMeButton.click();
    }
    @Then("user should see Current count changing")
    public void user_should_see_current_count_changing() {
        String text = SDET_AssessmentCounterPage.countChanging.getText();
        System.out.println(text);
        Assert.assertEquals("Current count: 1", SDET_AssessmentCounterPage.countChanging.getText());
    }

    @When("user navigates away from Counter URL")
    public void user_navigates_away_from_counter_url() {
        SDET_AssessmentCounterPage.homeLink.click();
        BrowserUtilities.verifyTitle("Home");
    }
    @When("user navigates back to Counter URL")
    public void user_navigates_back_to_counter_url() {
        SDET_AssessmentCounterPage.counterLinkTab.click();
        BrowserUtilities.verifyTitle("Counter");
    }
    @Then("user should see counter reset back")
    public void user_should_see_counter_reset_back() {
        String text = SDET_AssessmentCounterPage.countChanging.getText();
        System.out.println(text);
        Assert.assertEquals("Current count: 0", SDET_AssessmentCounterPage.countChanging.getText());
    }
}