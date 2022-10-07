package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.questions.Responder;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public  void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Carlos desea registarse en Utest$")
    public void carlosDeseaRegistarseEnUtest() throws Exception {
        OnStage.theActorCalled("Carlos").wasAbleTo(Abrir.laPagina());

    }


    @When("^eL usuario ingresa los datos requerido por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridoPorElSistema(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarDireccion.laPagina(datos),
                LlenarDispositivos.laPagina(datos), LlenarFinal.laPagina(datos));

    }

    @Then("^El registro se completa al ver el boton complete setup$")
    public void elRegistroSeCompletaAlVerElBotonCompleteSetup(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.Los(datos)));

    }
}
