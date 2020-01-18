@BIT_BootCamps
Feature: Boston Ivy Tech - Boot Camps
  This feature verifies all items on "Boot Camps" page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: User is going to verify all elements on "Services" page
    Given User clicks on Boot Camps
    #Given User verifies primary-menu options
      #| Home       |
      #| About      |
      #| Services   |
      #| Boot Camps |
      #| Contact    |
    #Then User verifies head title of page "OUR BOOT CAMP"
    #Then User verifies headlines of page
      #| NO IT BACKGROUND IS REQUIRED |
      #| WE TEACH                     |
      #| CLASSES                      |
      #| ONSITE AND ONLINE            |
    #Then User verifies headline explenations
      #| If you would like to switch your career, this is the time. We had students from all backgrounds, Dental assistants, teachers, drivers, pharmacists, etc. Don’t miss a chance to land in your dream job. Register here |
      #| We offer both onsite and remote classes. Recordings of the classes will be available for all students.                                                                                                  |
    
    #Then User check description of applications
      #| Java is at the heart of our digital lifestyle. It's the platform for launching careers, exploring human-to-digital interfaces, architecting the world's best applications, and unlocking innovation everywhere—from garages to global organizations.                                                                                                          |
      #| If you want to create robust, browser-based regression automation suites and tests, scale and distribute scripts across many environments, then you want to use Selenium WebDriver, a collection of language specific bindings to drive a browser - the way it is meant to be driven.                                                                        |
      #| JUnit 5 is the next generation of JUnit. The goal is to create an up-to-date foundation for developer-side testing on the JVM. This includes focusing on Java 8 and above, as well as enabling many different styles of testing. JUnit 5 is the result of JUnit Lambda and its crowdfunding campaign on Indiegogo.                                            |
      #| Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, reporting and documentation from a central piece of information.                                                                                                                              |
      #| Postman is free to download and use for teams of any size. Make any kind of API call—REST, SOAP, or just plain HTTP—and easily inspect even the largest responses. Postman also has built-in support for popular data formats, including OpenAPI, GraphQL, and RAML.                                                                                          |
      #| Testing and validating REST services in Java is harder than in dynamic languages such as Ruby and Groovy. REST Assured brings the simplicity of using these languages into the Java domain. REST Assured is a Java DSL for simplifying testing of REST based services built on top of HTTP Builder.                                                           |
      #| Cucumber's open-source and commercial collaboration tools combine with world-class Behavior Driven Development (BDD) training to take your engineering teams' performance to another level.                                                                                                                                                                   |
      #| Karate is the only open-source tool to combine API test-automation, mocks and performance-testing into a single, unified framework. The BDD syntax popularized by Cucumber is language-neutral, and easy for even non-programmers.                                                                                                                            |
      #| The Apache POI Project's mission is to create and maintain Java APIs for manipulating various file formats based upon the Office Open XML standards (OOXML) and Microsoft's OLE 2 Compound Document format (OLE2). In short, you can read and write MS Excel files using Java.                                                                                |
      #| Software Development Life Cycle (SDLC) is a process used by the software industry to design, develop and test high quality softwares. The SDLC aims to produce a high-quality software that meets or exceeds customer expectations, reaches completion within times and cost estimates.                                                                       |
      #| SoapUI is the world's leading Functional Testing tool for SOAP and REST testing. With its easy-to-use graphical interface, and enterprise-class features, SoapUI allows you to easily and rapidly create and execute automated functional, regression, and load tests. In a single test environment, SoapUI provides complete test coverage...                |
      #| Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency. Git is easy to learn and has a tiny footprint with lightning fast performance. It outclasses SCM tools like Subversion, CVS, Perforce, and ClearCase with features like cheap local branching... |
   
   
   
    And User verifies footer section
      | 827 Main Street, Woburn, MA 01940  \|  Phone: (857) 209-4939  \|  Email: info@bostonivytech.com |
      | Copyright © 2020 Boston Ivy Tec                                                                 |
