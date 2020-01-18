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
    #Then User verifies head title of page "WE ARE"
    #Then User verifies headlines of page like About us and Background
    #| ABOUT US       |
    #| OUR BACKGROUND |
    #Then User check article of About and Background
    #| Boston Ivy Tech was founded by individuals who are passionate about Information Technology. Our team is experienced in Software Development and Quality Assurance. Not only our team is well-informed, but we care about our clients like our family. We believe that our client’s success is our success.Many of our students think of our team their friends. They share all obstacles with us and we try to help them overcome these obstacles. |
    #| Our boot camp instructors have both teaching and QA Engineer experience. These qualities allow us to create an individualized instruction for our students. We understand that not everyone has a coding or programming background. We pay close attention to our students’ learning ability and try to spend more time with those who struggle more. We are here to help you succeed.                                                             |
    And User verifies footer section
      | 827 Main Street, Woburn, MA 01940  \|  Phone: (857) 209-4939  \|  Email: info@bostonivytech.com |
      | Copyright © 2020 Boston Ivy Tec                                                                 |
