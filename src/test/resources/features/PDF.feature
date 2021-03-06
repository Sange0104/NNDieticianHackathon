Feature: PDF file

  Scenario: Verify test report PDF file
    Given User IS ON 'View Patient Test Reports' page
    When user clicks on 'View PDF'
    Then PDF is opened in proper readable format

  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has patients details like patient ID, name, email, address, phone number,

  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF has doctor details like doc ID, doctor name, email address, clinic or facility name, doctors specialization

  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows list of conditions, preferences list, Co-morbidites

  Scenario: Verify content of PDF file
    Given User has clicked view PDF button
    When User is on PDF
    Then PDF shows diet menu for 7 days, any warning and comments mentioned by doctor.
