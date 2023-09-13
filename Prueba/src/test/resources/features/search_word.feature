# elkin.palacios.qa@gmail.com


Feature: as quality analyst
  I want to try word search method
  to confirm correct operation

  @search
  Scenario: search title main
    Given  actor enters the page
    Then I see the word 'Bienvenidos a Wikipedia,'

  @searchSistema
  Scenario: search title sistema
    Given  actor enters the page
    When I send the word "Sistema"
    Then I see the title 'Sistema'

  @searchAnalisis
  Scenario: search title analisis ceem
    Given  actor enters the page
    When I send the word "Sistema"
    Then I see the title 'Sistema'
    And see the word 'Análisis CEEM'

  @createCount
  Scenario: create count Wikipedia
    Given  actor enters the page
    When to send information for the create count
    Then I see the alert 'Completa este campo'


  @changeVersion
  Scenario: change version between mobile and desktop
    Given  actor enters the page
    When search of the button mobile version
    Then I see the option 'Escritorio'

  @compareHistory
  Scenario: change version between mobile and desktop
    Given  actor enters the page
    When search of the button history
    Then I see the message 'Etiqueta: Sin referencias'
