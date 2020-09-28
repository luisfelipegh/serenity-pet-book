package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookAllResultsPage.BUTTON_PERRO;
import static co.com.devco.userinterfaces.PetBookAllResultsPage.PET_BOOK_HOME_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FindDogsPetBook implements Task {

    public FindDogsPetBook() {
    }

    public static Performable find() {
        return instrumented(FindDogsPetBook.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(PET_BOOK_HOME_PAGE),
                Click.on(BUTTON_PERRO)
        );
    }
}
