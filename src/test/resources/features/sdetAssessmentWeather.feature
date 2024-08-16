@smoke
Feature: SDET Assessment Weather Verification
  Agile Story: As a user, when i am on the SDET_Assessment Home page
  I should be able to click on the Weather link and page title should be Weather,
  and i should see Weather in large letters on page. I should be able to verify
  that the Choose File and Download Forecast Data buttons are working and they are
  downloading and uploading file contents. I should be able to see four columns labeled
  Date, TempC, TempF, and Summary.

  Scenario: Gain access to SDET_Assessment Weather URL
    When user click on Weather link tab button
    Then user should see title is Weather
    And user should see Weather in large front in body of page

  Scenario: Verify Choose file and Download Forecast Data
    When user clicks on Download Forecast Data
    When user clicks on Choose File and uploads file
    Then  user should be able to see atleast one set of data

    Scenario: Verify Date, TempC, TempF, and Summary are displayed
      And User should see column for Date
      And User should see column for TempC
      And User should see column for TempF
      And User should see column for Summary
