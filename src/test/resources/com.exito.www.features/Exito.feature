@TiendaExito
Feature: Ingresar a la pagina de exito y seleccionar aleatoriamente cinco productos y su cantidad

  Scenario: Ingresar a la pagina de exito y seleccionar productos y cantidades
    Given Que me encuentro en la pagina de exito
    When Elijo una categoria y subcategoria
    And Elijo cinco productos aleatorios con cantidades aleatorias
    Then Realizo las validaciones de nombre precio cantidad de productos y numero de productos en el carrito