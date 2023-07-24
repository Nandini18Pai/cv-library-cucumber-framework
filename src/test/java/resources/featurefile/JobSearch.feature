Feature: verify JobSearch Test result

@Smoke
  Scenario Outline: Verify JobSearchResultUsingDifferentDataSet
    Given I am homepage
    When I accept the cookies
    And I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I should able to see the result "<result>"

    Examples:
      | jobTitle          | location               | distance | salaryMin | salaryMax | salaryType | jobType   | result                                            |
      | Tester            | Milton, Highland       | 2        | 30000     | 50000     | Per annum  | Permanent | Permanent Tester jobs in Milton                   |
      | Software Tester   | London                 | 35       | 30000     | 50000     | Per annum  | Permanent | Permanent Software Tester jobs in London          |
      | Quality Assurance | Milton Keynes          | 5        | 45000     | 65000     | Per annum  | Permanent | Permanent Quality Assurance jobs in Milton Keynes |
      | Software Engineer | Watford, Hertfordshire | 5        | 5000      | 6500      | Per month  | Contract  | Contract Software Engineer jobs in Watford        |
      | Tester            | Birmingham             | 7        | 4000      | 5000      | Per month  | Temporary | Temporary Tester jobs in Birmingham               |