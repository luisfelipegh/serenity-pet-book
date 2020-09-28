package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoDeBusquedaInesperado;
import co.com.devco.questions.FindResultsPetBook;
import co.com.devco.tasks.FindAllPetBook;
import co.com.devco.tasks.FindDogsPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookFindDogsStepDefinitions {

    @Cuando("^(.*) le da clic al boton Perro")
    public void LeDaClicAlBotonPerro(String actor) {
        theActorCalled(actor).attemptsTo(
                FindDogsPetBook.find()
        );
    }

    @Entonces("^debe ver la imagen Perro (.*)$")
    public void debeVerLaImagenPerro(String imagen) {

        theActorInTheSpotlight().should(seeThat(
                FindResultsPetBook.es(imagen)).orComplainWith(
                        ResultadoDeBusquedaInesperado.class, ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
