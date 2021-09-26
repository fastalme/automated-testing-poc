Feature: Funcionalidad de búsqueda de productos
  Scenario: Búsqueda en search tool
    Given Abre el web browser Chrome y direcciona a la aplicación
    When Ingreso el nombre del producto a buscar:
      |value|
      |blouse|
      |shoes|
      |hat|
    Then Visualizo resultado de la búsqueda
    And Cierro el web browser
