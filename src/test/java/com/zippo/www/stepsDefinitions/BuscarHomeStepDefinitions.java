package com.zippo.www.stepsDefinitions;

import com.zippo.www.driver.SeleniumWebDriver;
import com.zippo.www.steps.BuscarHomeSteps;
import com.zippo.www.utils.LecturaExcel;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;


public class BuscarHomeStepDefinitions {
    @Steps
    BuscarHomeSteps buscarHomeSteps = new BuscarHomeSteps();

    @Dado("^estoy en la pagina Home de Zippo$")
    public void estoyEnLaPaginaHomeDeZippo() {
        LecturaExcel.obtenerDatos();SeleniumWebDriver.navegarA(LecturaExcel.url);
    }

    @Cuando("^escribo el termino en la caja de busqueda y le doy enter$")
    public void escriboElTerminoEnLaCajaDeBusquedaYLeDoyEnter() {
        buscarHomeSteps.buscar();
    }

    @Entonces("^obtengo productos de Zippo relacionados con la busqueda$")
    public void obtengoProductosDeZippoRelacionadosConLaBusqueda() {
        buscarHomeSteps.cerrarNavegador();
    }
}