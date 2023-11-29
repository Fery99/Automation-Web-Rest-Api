@Login_or_no
Feature:Test Automation Web: login and how to shoping

  @web
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @web
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @web
  Scenario: All Item Displayed
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user click open menu button
#    When user click all items
    Then user is on All List Item

  @web
  Scenario: Display detailed of item selection
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    When  user click item selection
    Then  user is on page of item selection

  @web
  Scenario: Item selection can be add to chart
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And  user click item selection
    When  user is on page of item selection
    Then user click Add to chart

  @web
  Scenario: Checkout  and finish register for buy item
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    And user is on homepage
    And user inspec item on Page Chart
    And USer on Page Chart
    And user click Checkout
    And user is on Page checkot
    And user input Frist Name with "Fery"
    And user input Last Name  with "Sadewa"
    And user input Zip/Code with "53132"
    And  user click item Continue
    And user is on Page Checkout Overview
    When user click Finish
    Then user is on Page Checkout Complete
