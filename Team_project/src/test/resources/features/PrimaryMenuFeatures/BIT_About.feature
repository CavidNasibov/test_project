@BIT_About
Feature: Boston Ivy Tech - About
  This feature verifies all items on "About" page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: User is going to verify all elements on "About" page
    Given User clicks on About
    Given User verifies primary-menu options
      | Home       |
      | About      |
      | Services   |
      | Boot Camps |
      | Contact    |
    Then User verifies head title of page WE ARE
    Then User verifies headlines of page like About us and Background
      | ABOUT US       |
      | OUR BACKGROUND |
    Then User check article of About and Background
      | Boston Ivy Tech was founded by individuals who are passionate about Information Technology. |
      | Our boot camp instructors have both teaching and QA Engineer experience.                    |
