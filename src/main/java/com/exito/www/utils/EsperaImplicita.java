package com.exito.www.utils;
/**Autor: Manuel Buelvas**/
public class EsperaImplicita {

    public static void esperaImplicitaWeb(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
