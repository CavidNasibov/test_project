@BIT_Contact
Feature: Boston Ivy Tech - Contact
  This feature verifies all items on "Contact" page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: User is going to verify all elements on "Contact" page
    Given User clicks on Contact
    Given User verifies primary-menu options
      | Home       |
      | About      |
      | Services   |
      | Boot Camps |
      | Contact    |
    Then User verifies head title of page "Contact"
    Then User verifies heading titles
      | WE'RE READY, LET'S TALK. |
      | CONTACT INFO             |
    Then User verifies contact head titles
      | CONTACT US|
      | ADDRESS  |
      | EMAIL US |
      | CALL US  |
    #Then User verifies contact informations
      #| 827 Main Street, Woburn, MA 01801 |
      #| info@bostonivytech.com            |
      #| (857) 209-4939                    |
    Then User verifies head titles of registration table
      | Your Name (required)  |
      | Your Email (required) |
      | Subject               |
      | Your Message          |
    #And User verifies footer section
      #| 827 Main Street, Woburn, MA 01940  \|  Phone: (857) 209-4939  \|  Email: info@bostonivytech.com |
      #| Copyright © 2020 Boston Ivy Tec                                                                 |
