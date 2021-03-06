package co.com.devco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/pet_book_find_cats.feature",
		glue = {"co.com.devco.stepdefinitions"},
		snippets = SnippetType.CAMELCASE
)
public class PetBookFindCatsRunner {

}
