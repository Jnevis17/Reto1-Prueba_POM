package is.demo.serenity.stepDefinitions;

import io.cucumber.java.es.*;
import is.demo.serenity.steps.NombreEmpleadoSteps;
import is.demo.serenity.utils.SeleccionEmpleado;
import net.thucydides.core.annotations.Steps;

public class NombreEmpleadoStepDefinitios {


    @Steps
    NombreEmpleadoSteps cambioNomEpl;

    @Steps
    SeleccionEmpleado seleccionAletoria;
    @Dado("el ingreso correcto a Open Orders")
    public void elIngresoCorrectoAOpenOrders() {

        cambioNomEpl.IngresarOrders();
        cambioNomEpl.ClicBoton();
        cambioNomEpl.ClicOpenOrders();
    }

    @Cuando("de clic en cualquiera de las ordenes")
    public void deClicEnCualquieraDeLasOrdenes() {

        cambioNomEpl.clicOrden();
    }
    @Cuando("Selecione el nombre del empleado en aleatoria")
    public void selecioneElNombreDelEmpleadoEnAleatoria() {

        cambioNomEpl.ClicListaEmpelado();
        seleccionAletoria.seleccionEmpleadoRandom();

    }
    @Entonces("se evidenicia el cambio exitosamente")
    public void seEvideniciaElCambioExitosamente() {

    }

}
