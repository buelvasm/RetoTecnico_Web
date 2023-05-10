package com.exito.www.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoDeCompraPageObject extends PageObject {

    By lblNombreProducto = By.xpath("//span[contains(text(),'Cabecero')]");
    By lblCantidadProducto = By.xpath("//span[@data-molecule-quantity-und-value='true']");

    public By getLblNombreProducto() {
        return lblNombreProducto;
    }

    public By getLblCantidadProducto() {
        return lblCantidadProducto;
    }
}
