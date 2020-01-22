@BIT_WeTeach
Feature: Boston Ivy Tech - We Teach
  This feature goals is to look all apps inside of Boot Camp primary menu which Boston Ivy Tech provide.

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario Outline: User is going to sign up (Positive scenarious)
    Given User clicks on Boot Camps
    Then User clicks on application <App>
    Then User verifies title of webpage Java <Validation(Title)>

    Examples: 
      | App                                                     | Validation(Title)                                                |
      | "https://www.java.com/en/"                              | "Java \| Oracle"                                                 |
      | "https://selenium.dev"                                  | "SeleniumHQ Browser Automation"                                  |
      | "https://junit.org/junit5/"                             | "JUnit 5"                                                        |
      | "https://maven.apache.org"                              | "Maven "                                                         |
      | "https://www.getpostman.com"                            | "Postman \| The Collaboration Platform for API Development"      |
      | "http://rest-assured.io"                                | "REST Assured"                                                   |
      | "https://cucumber.io"                                   | "Cucumber \| Tools & techniques that elevate teams to greatness" |
      | "https://github.com/intuit/karate"                      | "intuit/karate: Test Automation Made Simple"                     |
      | "https://poi.apache.org"                                | "Apache POI - the Java API for Microsoft Documents"              |
      | "https://www.tutorialspoint.com/sdlc/sdlc_overview.htm" | "SDLC - Overview - Tutorialspoint"                               |
      | "https://www.soapui.org"                                | "The World's Most Popular API Testing Tool \| SoapUI"            |
      | "https://git-scm.com"                                   | "Git"                                                            |
