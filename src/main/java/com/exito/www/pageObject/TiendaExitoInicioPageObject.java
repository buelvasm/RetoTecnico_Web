package com.exito.www.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.exito.com/")
public class TiendaExitoInicioPageObject extends PageObject {
    By btnMenu = By.id("Enmascarar_grupo_659");
    By btnDormitorio = By.xpath("//li[@id='undefined-nivel2-Dormitorio']");
    By btnCabeceros = By.xpath("//p[@id='Categorías-nivel3-Cabeceros']");

    public By getBtnMenu() {
        return btnMenu;
    }

    public By getBtnDormitorio() {
        return btnDormitorio;
    }

    public By getBtnCabeceros() {
        return btnCabeceros;
    }
}
