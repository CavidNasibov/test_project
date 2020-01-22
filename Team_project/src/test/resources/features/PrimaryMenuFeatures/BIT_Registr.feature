@BIT_Reg
Feature: Boston Ivy Tech - Registration
  The purpose of this feature is to register with Boston Ivy Tech.

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario Outline: User is going to sign up (Positive scenarious)
    Given User click on Register button
    Then User types firstname <firstName>
    Then User types middlename <midName>
    Then User types lastname <lastName>
    Then User chooses gender <gender>
    Then User types email <email>
    Then User types phone number <phoneNumber>
    Then User choose work status <decision1>
    Then User choose past experience <decision2>
    Then User click submit button
    Then User verifies response sending message"Form has been submitted successfully."

    Examples: 
      | firstName | midName | lastName   | gender   | email                | phoneNumber  | decision1 | decision2 |
      | "Zahid"   | "Zed"   | "Ukalayev" | "Male"   | "Ukalayev@gmail.com" | "9876543210" | "yes"     | "yes"     |
      | "Zahid"   | ""      | "Ukalayev" | "Female" | "Ukalayev@gmail.com" | ""           | "no"      | "yes"     |
      | "Zahid"   | ""      | "Ukalayev" | "Other"  | "Ukalayev@gmail.com" | ""           | "yes"     | "no"      |
