@BIT_Services
Feature: Boston Ivy Tech - Service
  This feature verifies all items on "Services" page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: User is going to verify all elements on "Services" page
    Given User clicks on Services
    Given User verifies primary-menu options
      | Home       |
      | About      |
      | Services   |
      | Boot Camps |
      | Contact    |
    Then User verifies head title of page OUR SERVICES
    Then User verifies headlines of page like QA Engineer Boot Camps,Software Testing and Onsite Trainings
      | QA Engineer Boot Camps |
      | Software Testing       |
      | Onsite Trainings       |
    Then User check article of QA Engineer Boot Camps,Software Testing and Onsite Trainings
      | We provide Boot Camps for individuals who would like to:                              |
      | We provide full software testing to Small Businesses and Startups.                    |
      | Our experienced team will come to your company and train your staff on the following: |
