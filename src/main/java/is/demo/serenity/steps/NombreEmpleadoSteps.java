package is.demo.serenity.steps;

import is.demo.serenity.pageObjects.NombreEmpleadoPage;
import is.demo.serenity.utils.SeleccionEmpleado;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class NombreEmpleadoSteps {
    @Page
    NombreEmpleadoPage CambioNomEmp;

    @Page
    SeleccionEmpleado SeleccionarAletoria;

    @Step("Abrir navegador ")
    public void IngresarOrders(){
        CambioNomEmp.openUrl( "https://demo.serenity.is");
    }
    @Step("Clic en Open Orders")
    public void ClicOpenOrders (){
        CambioNomEmp.getDriver().findElement(CambioNomEmp.getClicEnlase()).click();
    }

    @Step("Clic en la Orden")
    public void clicOrden(){
        CambioNomEmp.getDriver().findElement(CambioNomEmp.getClicOrden()).click();
    }


    @Step("Dar clic al boton ")
    public void ClicBoton(){
        CambioNomEmp.getDriver().findElement(CambioNomEmp.getBtnInicioSesion()).click();
    }

    @Step("Clic lista desplegable ")
    public void  ClicListaEmpelado() {CambioNomEmp.getDriver().findElement(CambioNomEmp.getClicListaEmpleado()).click();}

    //@Step("Clic empleado selecionado")
    //public void clicEmpleado() {SeleccionarAletoria.getDriver().findElement()}

}
