package is.demo.serenity.steps;

import is.demo.serenity.pageObjects.TableroDashboardPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
public class TableroSteps {
    @Page
    TableroDashboardPage tablero;

    //Valida que el pagina o vista se puede evidenciar la etiqueta H5 este visible
    //se utiliza Mactchers.is() cuando va retornar un Booleano
    //se utiliza Mactchers.as() cuando va hacer una conversion
    @Step("Validar mensaje de ingreso de la vista Dashboard")
    public void ValidarMSJ (){
        Assert.assertTrue(
                tablero.LblDashboard.isDisplayed()
        );
    }
}

