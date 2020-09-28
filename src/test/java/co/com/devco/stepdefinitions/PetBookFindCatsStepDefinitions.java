package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoDeBusquedaInesperado;
import co.com.devco.questions.FindResultsPetBook;
import co.com.devco.tasks.FindAllPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookFindCatsStepDefinitions {

    @Cuando("^(.*) le da clic al boton Gato$")
    public void LeDaClicAlBotonGato(String actor) {
        theActorCalled(actor).attemptsTo(
                FindAllPetBook.find()
        );
    }

    @Entonces("^debe ver la imagen del Gato (.*)$")
    public void debeVerLaImagenDelGato(String imagen) {

        theActorInTheSpotlight().should(seeThat(
                FindResultsPetBook.es(imagen)).orComplainWith(
                        ResultadoDeBusquedaInesperado.class, ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
