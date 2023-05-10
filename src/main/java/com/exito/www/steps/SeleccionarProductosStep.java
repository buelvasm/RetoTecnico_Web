package com.exito.www.steps;

import com.exito.www.pageObject.CarritoDeCompraPageObject;
import com.exito.www.pageObject.SeleccionarProductosPageObject;
import com.exito.www.utils.EsperaExplicita;
import com.exito.www.utils.EsperaImplicita;
import com.exito.www.utils.Robot;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeleccionarProductosStep {
    SeleccionarProductosPageObject seleccionarProductosPageObject;
    CarritoDeCompraPageObject carritoDeCompraPageObject;
    Robot robot = new Robot();
    static List<String> nombreProducto = new ArrayList<>();
    static List<String> precioProducto = new ArrayList<>();
    static List<String> cantidadProducto = new ArrayList<>();


    @Step("Se crea una lista, donde cada producto es identificado mediante un elemento (xpath) en comun, luego imprimo la lista para saber cuantos elementos existen y por ultimo seleccionar la posicion que requiero para dar click")
    public void listarProductos() throws AWTException {
        Random rand = new Random();
        List<WebElement> Productos = seleccionarProductosPageObject.getDriver().findElements(seleccionarProductosPageObject.getBtnCompraRapida());
        System.out.println("Nro de productos visibles: " + Productos.size());
        int numero = 5;
        for (int i = 0; i < numero; i++) {
            int nAleatorio = rand.nextInt(Productos.size());
            WebElement elementoAzar = Productos.get(nAleatorio);
            System.out.println("Elemento ---> " + elementoAzar);
            robot.control_Menos();
            EsperaImplicita.esperaImplicitaWeb(3);
            elementoAzar.click();
            robot.control_Mas();
            Productos.remove(nAleatorio);
            String producto = seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getLblNombreProducto()).getText();
            nombreProducto.add(producto);
            System.out.println("Este es el nombre del producto ---> " + nombreProducto);
            String precio = seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getLblPrecioProducto()).getText();
            precioProducto.add(precio);
            System.out.println("Este es el precio del producto ---> " + precioProducto);
            EsperaExplicita.esperaexplilicitaClick(seleccionarProductosPageObject.getDriver(), seleccionarProductosPageObject.getBtnAgregar());
            seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getBtnAgregar()).click();

            /**Metodo para seleccionar cantidad aleatoria**/
            int a = 0, cantidad = 5, rango = 10;
            int arreglo[] = new int[cantidad];
            arreglo[a] = (int) (Math.random() * rango);
            for (a = 0; a < cantidad; a++) {
                arreglo[a] = (int) (Math.random() * rango);
                for (int j = 0; j < a; j++) {
                    if (arreglo[a] == arreglo[j]) {
                        EsperaExplicita.esperaexplilicitaClick(seleccionarProductosPageObject.getDriver(), seleccionarProductosPageObject.getBtnMasCantidad());
                        seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getBtnMasCantidad()).click();
                        EsperaImplicita.esperaImplicitaWeb(3);
                        a--;
                    }
                }
            }
            String cantidadP = seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getLblCantidadP()).getText();
            cantidadProducto.add(cantidadP);
            System.out.println("Esta es la cantidad ---> " + cantidadProducto);
            EsperaExplicita.esperaexplilicitaClick(seleccionarProductosPageObject.getDriver(), seleccionarProductosPageObject.getBtnCerrar());
            seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getBtnCerrar()).click();
        }
    }

    @Step
    public void clickBotonCarrito() {
        EsperaImplicita.esperaImplicitaWeb(5);
        seleccionarProductosPageObject.getDriver().findElement(seleccionarProductosPageObject.getBtnCarrito()).click();
    }

    @Step
    public void validarNombre() throws AWTException {
        List<WebElement> noProducto = carritoDeCompraPageObject.getDriver().findElements(carritoDeCompraPageObject.getLblNombreProducto());
        int cantidadNombre = 5;
        robot.decremento();
        EsperaImplicita.esperaImplicitaWeb(2);
        for (int l = 0; l < cantidadNombre; l++) {
            EsperaImplicita.esperaImplicitaWeb(2);
            try {
                while (noProducto.get(l).getText().equals(nombreProducto.get(l))) {
                    Assert.assertEquals(noProducto.get(l).getText(), nombreProducto.get(l));
                    System.out.println("IMPRIMO N PRODUCTO: -----> " + noProducto.get(l).getText());
                    System.out.println("IMPRIMO LOS NOMBRES DE P ---<: " + nombreProducto);
                    System.out.println("VALIDE LOS NOMBRES: ");
                    break;
                }
            } catch (Exception e) {

            }
        }
    }

    @Step
    public void validarCantidad() {
        List<WebElement> cantProducto = carritoDeCompraPageObject.getDriver().findElements(carritoDeCompraPageObject.getLblCantidadProducto());
        int cantiProducto = 5;
        EsperaImplicita.esperaImplicitaWeb(2);
        for (int p = 0; p < cantiProducto; p++) {
            while (cantProducto.get(p).getText().equals(cantidadProducto.get(p))) {
                System.out.println("ESTE ES EL VALORRRRRRR: " + cantProducto.get(p).getText());
                Assert.assertEquals(cantProducto.get(p).getText(), cantidadProducto.get(p));
                System.out.println("VALIDE LAS CANTIDADES: ");
                break;
            }
        }
    }
}
