Feature: Register in Ionix App
  I, as a content user of the App
  I want to register in the application
  To upload my content

  @regression
  Scenario Outline: register in the application Ionix App Success
    When the user registers with the following data '<username>' '<password>' '<email>'
    Then the register is successful

    Examples:
      | username    | password  | email            |
      | userTest001 | 1234Tabc* |                  |
      | userTest002 | 1234Tabc* | test@test001.com |

  @smoke
  Scenario Outline: register in the application Ionix App Success
    When the user registers with the following data '<username>' '<password>' '<email>'
    Then the register is successful

    Examples:
      | username    | password  | email    |
      | userTe      | 1234Tabc* |          |
      | userTest002 | 1234Tabc* | test.com |
