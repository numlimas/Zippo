package co.com.zippo.www.steps;

import co.com.zippo.www.pageObjects.HomePage;
import co.com.zippo.www.utils.LecturaExcel;
import co.com.zippo.www.utils.Scroll;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;


public class MultipleBusquedaSteps extends MetodosSteps{
    HomePage homePage=new HomePage();
    Scroll scroll = new Scroll();

    @Step
    public void pasosAcort(){
        By[] btnProducto = {homePage.getBtnProdCombustible(),homePage.getBntProdDispensador(),homePage.getBtnProdInsertoS(),homePage.getBtnProdInsertoD(),homePage.getBtnProdMecha()};
        By lblProducto = By.xpath("//h1[@class='product_title entry-title']");
        for (int i = 0; i < btnProducto.length; i++) {
            scroll.scrollPixels();
            scroll.scrollAElemento(btnProducto[i]);
            clickear(btnProducto[i]);
            validacion(LecturaExcel.validaciones.get(i).toString(),lblProducto);
            clickear(homePage.getBtnHome());
        }
    }
}
