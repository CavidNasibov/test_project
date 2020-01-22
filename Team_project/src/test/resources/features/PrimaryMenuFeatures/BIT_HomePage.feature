@BIT_HP
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
    Then User verifies all head titles
      | online or in-class                      |
      | join our boot camp                      |
      | our services                            |
      | our boot camps                          |
      | what does software engineer in test do? |
    Then User verifies all icon-box-title
      | Join us for the Open   |
      | QA Testing Boot Camps  |
      | Software Testing       |
      | Onsite Trainings       |
      | Family Environment     |
      | Knowledge              |
      | Support                |
      | No Background needed   |
      | $90,000 Average Salary |
    Then User verifies all elementor-testimonial-contents
      | Boston Ivy Tech is a great place.                                                    |
      | All instructors treated everyone the same way.                                       |
      | I have a full time day job and looking for a career switch.                          |
      | The teaching process in Boston Ivy Tech is very professional, detailed and thorough. |
      | I am very thankful to you for your help and support.                                 |
    Then User verifies all icon-box-descriptions
      | We hold 5 Month long QA Testing boot camps. We teach Java programming and popular testing tools.                              |
      | Our highly trained Software Engineers in Test will test your product and provide your team with detailed reports.             |
      | We offer onsite trainings for your QA teams. Our trainers are Software Engineers in Test who are in the industry.             |
      | Our instructors go above an beyond to help our students. We are available 24/7 to answer your questions.                      |
      | Our instructors work in the field and have ample of experience. We teach modern tools used in the industry.                   |
      | We support all of our students until they feel comfortable by helping our students during their initial months of employment. |
      | You don't need to have a software developer or programming background to register to our Boot Camp.                           |
      | Average salary for QA Engineer in the USA is around $90,000. Full time positions offer benefit packages.                      |
    And User verifies footer sections
      | 827 Main Street, Woburn, MA 01940 \| Phone: (857) 209-4939 \| Email: info@bostonivytech.com |
      | Boston Ivy Tech                                                                             |
