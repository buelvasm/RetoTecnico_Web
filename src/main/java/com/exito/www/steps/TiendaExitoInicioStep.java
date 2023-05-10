package com.exito.www.steps;

import com.exito.www.pageObject.TiendaExitoInicioPageObject;
import com.exito.www.utils.EsperaExplicita;
import com.exito.www.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

public class TiendaExitoInicioStep {
    TiendaExitoInicioPageObject tiendaExitoInicioPageObject;

    @Step
    public void abrirWeb() {
        tiendaExitoInicioPageObject.open();
    }

    @Step
    public void clickBotonMenu() {
        EsperaExplicita.esperaexplilicitaClick(tiendaExitoInicioPageObject.getDriver(), tiendaExitoInicioPageObject.getBtnMenu());
        tiendaExitoInicioPageObject.getDriver().findElement(tiendaExitoInicioPageObject.getBtnMenu()).click();
    }

    @Step
    public void clickDormitorio() {
        EsperaExplicita.esperaexplilicitaClick(tiendaExitoInicioPageObject.getDriver(), tiendaExitoInicioPageObject.getBtnDormitorio());
        tiendaExitoInicioPageObject.getDriver().findElement(tiendaExitoInicioPageObject.getBtnDormitorio()).click();
    }

    @Step
    public void clickCabeceros() {
        EsperaExplicita.esperaexplilicitaClick(tiendaExitoInicioPageObject.getDriver(), tiendaExitoInicioPageObject.getBtnCabeceros());
        tiendaExitoInicioPageObject.getDriver().findElement(tiendaExitoInicioPageObject.getBtnCabeceros()).click();
        EsperaImplicita.esperaImplicitaWeb(5);
    }
}
