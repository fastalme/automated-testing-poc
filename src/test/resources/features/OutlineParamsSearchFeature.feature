Feature: Funcionalidad de búsqueda de productos
  Scenario Outline: Búsqueda en search tool
    Given Abre el web browser Chrome y direcciona a la aplicación
    When Ingreso el nombre del producto a buscar "<value>"
    Then Visualizo resultado de la búsqueda
    And Cierro el web browser

    Examples:
      |value|
      |blouse|
      |shoes|
      |hat|
