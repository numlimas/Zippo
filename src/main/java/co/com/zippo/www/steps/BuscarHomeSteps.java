package co.com.zippo.www.steps;

import co.com.zippo.www.pageObjects.HomePage;
import co.com.zippo.www.utils.LecturaExcel;

import co.com.zippo.www.utils.Scroll;
import net.thucydides.core.annotations.Step;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscarHomeSteps extends MetodosSteps{
    HomePage homePage = new HomePage();
    @Step
    public void buscar(){
        ArrayList<String> productos = LecturaExcel.productos;
        for (String producto:productos) {
            escribirEnter(homePage.getTxtBusqueda(),producto);
        }
    }
}
