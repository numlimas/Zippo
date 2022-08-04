package com.zippo.www.steps;
import com.zippo.www.pageObjects.HomePage;
import com.zippo.www.utils.LecturaExcel;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;

public class BuscarHomeSteps extends MetodosSteps{
    HomePage homePage = new HomePage();
    @Step

    public void buscar(){
        ArrayList<String> productos = LecturaExcel.productos;
        for (String producto:productos) {
            escribirEnter(homePage.getTxtBusqueda(),producto);
            limpiar(homePage.getTxtBusqueda());
        }
    }
}
