package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import java.util.List;

public class Responder implements Question<Boolean>
{
    private  List<UtestDatos> datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder Los(List<UtestDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton_final = Text.of(PaginaFinal.BOTON_FINAL).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Boton_final);
    }
}
