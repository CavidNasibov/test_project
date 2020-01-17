@bostonIvyTech_HP
Feature: I want to verify almost everything on bostonIvyTech Home page

  Background: 
    Given User is on bostonIvyTech home page
    Then User  verifies  bostonIvyTech title "Boston Ivy Tech – Your Signature in IT"

  Scenario: I am on bostonIvyTech home page
    Given User verifies primary-menu options
      | Home       |
      | About      |
      | Services   |
      | Boot Camps |
      | Contact    |
    #Then User verifies all heading titles
      #| Online or In-Class                      |
      #| Join our Boot Camp                      |
      #| Our Services                            |
      #| Our Boot camps                          |
      #| What Does Software Engineer in Test Do? |
    #Then User verifies all elementor-icon-box-title
      #| QA Testing Boot Camps  |
      #| Software Testing       |
      #| Onsite Trainings       |
      #| Family Environment     |
      #| Knowledge              |
      #| Support                |
      #| No Background needed   |
      #| $90,000 Average Salary |
