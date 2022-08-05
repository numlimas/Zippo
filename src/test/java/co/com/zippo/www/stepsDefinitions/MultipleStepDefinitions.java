package co.com.zippo.www.stepsDefinitions;

import co.com.zippo.www.driver.SeleniumWebDriver;
import co.com.zippo.www.steps.MultipleBusquedaSteps;
import co.com.zippo.www.utils.LecturaExcel;

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
        multipleBusquedaSteps.pasosAcort();
    }


    @Entonces("^me aseguro que sea el producto que quiero$")
    public void meAseguroQueSeaElProductoQueQuiero() {
        multipleBusquedaSteps.cerrarNavegador();
    }
}
