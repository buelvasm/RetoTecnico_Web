package com.exito.www.stepDefinitions;

import com.exito.www.steps.SeleccionarProductosStep;
import com.exito.www.steps.TiendaExitoInicioStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.awt.*;

public class TiendaExitoStepDefinition {
    @Steps
    TiendaExitoInicioStep tiendaExitoInicioStep;
    @Steps
    SeleccionarProductosStep seleccionarProductosStep;

    @Given("Que me encuentro en la pagina de exito")
    public void queMeEncuentroEnLaPaginaDeExito() {
        tiendaExitoInicioStep.abrirWeb();
    }
    @When("Elijo una categoria y subcategoria")
    public void elijoUnaCategoriaYSubcategoria() {
        tiendaExitoInicioStep.clickBotonMenu();
        tiendaExitoInicioStep.clickDormitorio();
        tiendaExitoInicioStep.clickCabeceros();
    }
    @Given("^Elijo cinco productos aleatorios con cantidades aleatorias$")
    public void elijoCincoProductosAleatoriosConCantidadesAleatorias() throws AWTException {
        seleccionarProductosStep.listarProductos();
        seleccionarProductosStep.clickBotonCarrito();
    }

    @Then("Realizo las validaciones de nombre precio cantidad de productos y numero de productos en el carrito")
    public void realizoLasValidacionesDeNombrePrecioCantidadDeProductosYNumeroDeProductosEnElCarrito() throws AWTException {
        seleccionarProductosStep.validarNombre();
//        seleccionarProductosStep.validarCantidad();
    }

}
