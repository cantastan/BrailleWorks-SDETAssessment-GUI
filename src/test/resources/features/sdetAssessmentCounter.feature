@smoke
Feature: SDET Assessment Counter Verification
  Agile Story: As a user, when i am on the SDET_Assessment Home page
  I should be able to click on the Counter link and page title should
  be Counter, and i should see Counter in large letters on page. When
  I click the click me button i should see the Current count: number change

  Scenario: Gain access to SDET_Assessment counter URL
    When user click on Counter link tab button
    Then user should see title is Counter
    And user should see Counter in large front in body of page

  Scenario: Click on click me button
    When user clicks on the click me button
    Then user should see Current count changing

  Scenario: Leaves and Returns to site counter resets
    When user navigates away from Counter URL
    And user navigates back to Counter URL
    Then user should see counter reset back