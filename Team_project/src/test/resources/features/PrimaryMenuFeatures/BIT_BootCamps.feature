@BIT_BootCamps
Feature: Boston Ivy Tech - Boot Camps
  This feature verifies all items on "Boot Camps" page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: User is going to verify all elements on "Services" page
    Given User clicks on Boot Camps
    Given User verifies primary-menu options
      | Home       |
      | About      |
      | Services   |
      | Boot Camps |
      | Contact    |
    Then User verifies head title of page OUR BOOT CAMP
    Then User verifies headlines of page
      | NO IT BACKGROUND IS REQUIRED |
      | WE TEACH                     |
      | CLASSES                      |
      | ONSITE AND ONLINE            |
    Then User verifies headline explenations
      | If you would like to switch your career, |
      | We offer both onsite and remote classes. |
    Then User check description of applications
      | Java is at the heart of our digital lifestyle.                                               |
      | If you want to create robust,                                                                |
      | JUnit 5 is the next generation of JUnit.                                                     |
      | Apache Maven is a software project management and comprehension tool.                        |
      | Postman is free to download and use for teams of any size.                                   |
      | Testing and validating REST services                                                         |
      | Cucumber's open-source and commercial collaboration tools                                    |
      | Karate is the only open-source tool to combine API test-automation,                          |
      | The Apache POI Project's mission is to create and maintain Java APIs                         |
      | Software Development Life Cycle (SDLC) is a process used by the software industry to design, |
      | SoapUI is the world's leading Functional Testing tool for SOAP and REST testing.             |
      | Git is a free and open source distributed version control system                             |
      |                                                                                              |
