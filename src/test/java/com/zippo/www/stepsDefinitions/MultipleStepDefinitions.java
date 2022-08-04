package com.zippo.www.stepsDefinitions;


import com.zippo.www.driver.SeleniumWebDriver;
import com.zippo.www.steps.MultipleBusquedaSteps;
import com.zippo.www.utils.LecturaExcel;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class MultipleStepDefinitions {
    MultipleBusquedaSteps multipleBusquedaSteps=new MultipleBusquedaSteps();

    @Dado("^Estoy en la Homepage de Zippo$")
    public void estoyEnLaHomepageDeZippo() {
        LecturaExcel.obtenerDatos();
        SeleniumWebDriver.navegarA(LecturaExcel.url);
    }


    @Cuando("^quiero un producto le doy click y valido que sea la pagina del producto$")
    public void quieroUnProductoLeDoyClickYValidoQueSeaLaPaginaDelProducto() {
        multipleBusquedaSteps.pasos();
    }


    @Entonces("^me aseguro que sea el producto que quiero$")
    public void meAseguroQueSeaElProductoQueQuiero() {
        multipleBusquedaSteps.cerrarNavegador();
    }
}
