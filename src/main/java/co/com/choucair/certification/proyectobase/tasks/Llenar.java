package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaInfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.choucair.certification.proyectobase.userinterface.PaginaInfoPersonal.*;

public class Llenar implements Task {

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                         Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                         Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                         SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                         SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                         SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANO_NACIMIENTO),
                        Click.on(BOTON_UBICACION));

    }
}
