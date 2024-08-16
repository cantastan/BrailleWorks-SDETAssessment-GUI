@smoke
Feature: SDET Assessment Home Verification
  Agile Story: As a user , when i am on the SDET_Assessment Home page
  I should see be able to see "Hello, world! Welcome to your new app.",
  and when i click the "About" link I should be redirected to a different
  page and or tab

  Background: For all scenarios user is on the SDET_Assessment URL home page
    Given user is on the SDET_Assessment Home page

  Scenario: Gain access to SDET_Assessment URL
    Then user should see title is Home
    And user should see Hello, world! Welcome to your new app. on webpage body

  Scenario: About link click and redirect functionality
    And user clicks on About link
    When user is redirected to About links url
    Then user should see new url Title