package com.exito.www.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeleccionarProductosPageObject extends PageObject {
    By btnAgregar = By.xpath("//div[contains(@class,'vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box ')]");
    By lblNombreProducto = By.xpath("//div[contains(@class,'quick-purchase-modal-container exito-vtex-components-4-x-quickPurchaseModalContainer')]//span[contains(@class,'vtex-store-components-3-x-productBrand ')]");
    By lblPrecioProducto = By.xpath("(//div[contains(@class,'quick-purchase-modal-container exito-vtex-components-4-x-quickPurchaseModalContainer')]//span[contains(@class,'exito-vtex-components-4-x-currencyContainer')])[2]");
    By btnCompraRapida = By.xpath("//div[contains(@class,'vtex-flex-layout-0-x-flexColChild pb0')]//span[contains(@class,'w-100 h-100')]");
    By btnMasCantidad = By.xpath("//span[contains(@class,'product-details-exito-vtex-components-buy-button-manager-more')]");
    By lblCantidadP = By.xpath("//div[contains(@class,'quick-purchase-modal-container exito-vtex-components-4-x-quickPurchaseModalContainer')]//div[contains(@class,'exito-vtex-components-4-x-stepperContainerQty')]");
    By btnCerrar = By.xpath("//div//span[contains(@class,'exito-vtex-components-4-x-defaultModalClose')]");
    By btnCarrito = By.xpath("//*[contains(@class,'exito-header-3-x-minicartQuantity')]");

    public By getBtnAgregar() {
        return btnAgregar;
    }

    public By getLblNombreProducto() {
        return lblNombreProducto;
    }

    public By getLblPrecioProducto() {
        return lblPrecioProducto;
    }

    public By getBtnCompraRapida() {
        return btnCompraRapida;
    }

    public By getBtnMasCantidad() {
        return btnMasCantidad;
    }

    public By getLblCantidadP() {
        return lblCantidadP;
    }

    public By getBtnCerrar() {
        return btnCerrar;
    }

    public By getBtnCarrito() {
        return btnCarrito;
    }
}
