Feature: Pagination of Doctor Teams page
Scenario: Validating the first Page of Doctor Team
Given User is on Dietician Website
When User lands on Teams page
Then User sees Doctor's name on Doctor team page

Scenario: Validating the next page(>) button on the first page of Team
Given User is on first page of Team
When User clicks on next button(>)  
Then User should be directed to next Doctor on Team Page

Scenario: Validating next(>)button on the last page of Team
Given User is on Team page
When User lands on last page of Team
Then Next button should be disabled

Scenario: Validating the previous (<) button on first page of Team
Given User is on Dietician Website
When User lands on first page of Team
Then Previous button(<)should be disabled

Scenario: Validating the previous button (<)  when there are previous pages to display
Given User is on second page of Team
When User clicks on previous button(<)
Then User should be directed to previous page of Team
