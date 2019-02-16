Feature: Map - Rooms page

  Scenario: Room quotes

    Given user is on the login page
    When user logs in using "daldie7l@seattletimes.com" and "ruthannjohnes"
    Then user should be able to see quotes info for each room
      | ping pong | the more the better |
      | harvard   | the more the better |
      | yale      | the more the better |
      | stanford  | the more the better |
      | princeton | less is more        |
      | duke      | less is more        |
      | berkeley  | less is more        |



