package co.com.zippo.www.steps;

import co.com.zippo.www.pageObjects.BasePage;
import co.com.zippo.www.pageObjects.HomePage;
import co.com.zippo.www.utils.LecturaExcel;
import co.com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class MultipleBusquedaSteps extends MetodosSteps{
    HomePage homePage=new HomePage();
    BasePage basePage=new BasePage();
    Scroll scroll = new Scroll();

    @Step
    public void pasosAcort(){
        By[] btnProducto = {homePage.getBtnProdCombustible(),homePage.getBntProdDispensador(),homePage.getBtnProdInsertoS(),homePage.getBtnProdInsertoD(),homePage.getBtnProdMecha()};
        for (int i = 0; i < btnProducto.length; i++) {
            scroll.scrollAElemento(btnProducto[i]);
            clickear(btnProducto[i]);
            validacion(LecturaExcel.validaciones.get(i).toString(),basePage.getLblProducto());
            clickear(homePage.getBtnHome());
        }
    }
}
