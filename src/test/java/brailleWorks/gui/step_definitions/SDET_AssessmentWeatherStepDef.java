package brailleWorks.gui.step_definitions;

import brailleWorks.gui.pages.SDET_AssessmentWeatherPage;
import brailleWorks.gui.utilities.BrowserUtilities;
import brailleWorks.gui.utilities.ConfigurationReader;
import brailleWorks.gui.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SDET_AssessmentWeatherStepDef {
    SDET_AssessmentWeatherPage SDET_AssessmentWeatherPage = new SDET_AssessmentWeatherPage();
    Actions actions = new Actions(Driver.getDriver());


    @When("user click on Weather link tab button")
    public void user_click_on_weather_link_tab_button() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sdetAssessmentHomeUrl"));// you could start directly on the weatherUrl but i wanted to use different classes
        actions.click(Driver.getDriver().findElement(By.xpath("//a[@href='weather']"))).perform(); //trying different classes/libraries
        BrowserUtilities.sleep(2);// this will slow browser down so the verifyTitle method can work in next test case
    }

    @Then("user should see title is Weather")
    public void user_should_see_title_is_weather() {
        BrowserUtilities.verifyTitle("Weather");
    }

    @Then("user should see Weather in large front in body of page")
    public void user_should_see_weather_in_large_front_in_body_of_page() {
        SDET_AssessmentWeatherPage.weatherBodyTitle.isDisplayed();
        System.out.println("SDET_AssessmentWeatherPage.weatherBodyTitle.getText() = " + SDET_AssessmentWeatherPage.weatherBodyTitle.getText());
    }

    @When("user clicks on Download Forecast Data")
    public void user_clicks_on_download_forecast_data() {
        SDET_AssessmentWeatherPage.downloadButton.click();
    }

    @When("user clicks on Choose File and uploads file")
    public void user_clicks_on_choose_file() {
        WebElement fileInput = Driver.getDriver().findElement(By.xpath("/html/body/div[1]/main/article/input"));
        String filePath = "C:\\Users\\biltn\\Downloads\\forecast (3).json";
        fileInput.sendKeys(filePath);
    }

    @Then("user should be able to see atleast one set of data")
    public void user_should_be_able_to_see_atleast_one_set_of_data() {
        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/main/article/table/tbody/tr[1]")).isDisplayed();
        System.out.println("Webtable first dataset = " + Driver.getDriver().findElement(By.xpath("/html/body/div[1]/main/article/table/tbody/tr[1]")).getText());
    }

    @Given("User should see column for Date")
    public void user_should_see_column_for_date() {
        SDET_AssessmentWeatherPage.tableDateColumn.isDisplayed();
        System.out.println("SDET_AssessmentWeatherPage.tableDateColumn.getText() = " + SDET_AssessmentWeatherPage.tableDateColumn.getText());
    }
    @Given("User should see column for TempC")
    public void user_should_see_column_for_temp_c() {
        SDET_AssessmentWeatherPage.tableTempCColumn.isDisplayed();
        System.out.println("SDET_AssessmentWeatherPage.tableTempCColumn.getText() = " + SDET_AssessmentWeatherPage.tableTempCColumn.getText());
    }
    @Given("User should see column for TempF")
    public void user_should_see_column_for_temp_f() {
        SDET_AssessmentWeatherPage.tableTempFColumn.isDisplayed();
        System.out.println("SDET_AssessmentWeatherPage.tableTempFColumn.getText() = " + SDET_AssessmentWeatherPage.tableTempFColumn.getText());
    }
    @Given("User should see column for Summary")
    public void user_should_see_column_for_summary() {
        SDET_AssessmentWeatherPage.tableSummaryColumn.isDisplayed();
        System.out.println("SDET_AssessmentWeatherPage.tableSummaryColumn.getText() = " + SDET_AssessmentWeatherPage.tableSummaryColumn.getText());
    }

}
