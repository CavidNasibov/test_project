@BIT_Contact_Click
Feature: Boston Ivy Tech - Contact
  This feature verifies all items on "Contact" page

  Background:
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario Outline: User is going to verify all elements on "Contact" page
    Given User click on Contact
    Then User types name <name>
    Then User fills email <email>
    Then User enters subject <subject>
    Then User sends message <message>
    Then User clicks send button
    Then User verifies response after sending message "Thank you for your message. We will get back you as soon as we can."

    Examples:
      | name    | email                  | subject | message             |
      | "Zahid" | "ukalayev84@gmail.com" | "hi"    | "I say hello"       |
      | "Javid" | "javid@gmail.com"      | "hi"    | "I am saying hello" |