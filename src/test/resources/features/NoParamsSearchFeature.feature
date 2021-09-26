Feature: Funcionalidad de búsqueda de productos
  Scenario: Búsqueda de blusas en search tool
    Given Abre el web browser Chrome y direcciona a la aplicación
    When Ingreso el nombre del producto a buscar blouse
    Then Visualizo resultado de la búsqueda
    And Cierro el web browser

  Scenario: Búsqueda de zapatos en search tool
    Given Abre el web browser Chrome y direcciona a la aplicación
    When Ingreso el nombre del producto a buscar shoes
    Then Visualizo resultado de la búsqueda
    And Cierro el web browser
