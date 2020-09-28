package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoDeBusquedaInesperado;
import co.com.devco.questions.FindResultsPetBook;
import co.com.devco.questions.ValidatePetViewPetBook;
import co.com.devco.tasks.FindAllPetBook;
import co.com.devco.tasks.ViewPetPetBook;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoDeBusquedaInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetBookViewPetStepDefinitions {

    @Cuando("^(.*) le da clic a una mascota$")
    public void LeDaClicAUnaMascota(String actor) {
        theActorCalled(actor).attemptsTo(
                ViewPetPetBook.find()
        );
    }

    @Entonces("^debe ver la mascota en una sola pagina a (.*)$")
    public void debeVerLaMascotaEnUnaSolaPagina(String imagen) {

        theActorInTheSpotlight().should(seeThat(
                ValidatePetViewPetBook.es(imagen)).orComplainWith(
                        ResultadoDeBusquedaInesperado.class, ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
