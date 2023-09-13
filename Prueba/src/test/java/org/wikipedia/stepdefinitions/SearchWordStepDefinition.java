package org.wikipedia.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.wikipedia.questions.*;
import org.wikipedia.tasks.CreateCount;
import org.wikipedia.tasks.SearchButton;
import org.wikipedia.tasks.SearchHistory;
import org.wikipedia.tasks.SearchWord;
import org.wikipedia.userinterfaces.Search;
import org.wikipedia.utils.Generate;

public class SearchWordStepDefinition
{
    @Managed
    WebDriver driver;
    // metodo para que el actor abra la pagina
    @Given("actor enters the page")
    public void actorEntersThePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://es.wikipedia.org/wiki/Wikipedia:Portada"));
    }

    // metodo donde el actor busca la palabra en específico de sistema
    @When("I send the word {string}")
    public void iSendTheWord(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(new SearchWord(option));
    }

    // metodo donde el actor busca la palabra en específico de sistema
    @Then("I see the word {string}")
    public void iSeeTheWord(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.is(), Matchers.equalTo(message)));
    }

    // metodo donde el actor busca la palabra en específico de sistema en el titulo
    @Then("I see the title {string}")
    public void iSeeTheTitle(String message1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageSearch.is(), Matchers.equalTo(message1)));
    }

    // metodo donde el actor busca la palabra en específico de Análisis CEEM en el titulo
    @Then("see the word {string}")
    public void seeTheWord(String message2) {
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(Search.TITLE));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageTitle.is(), Matchers.equalTo(message2)));
    }

    // metodo donde se llena el formulario para la creación de una cuenta de wikipedia
    @When("to send information for the create count")
    public void toSendInformationForTheCreateCount() {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateCount.format(Generate.dates()));
    }

    // metodo donde compara el texto específico de una alerta
    @Then("I see the alert {string}")
    public void iSeeTheAlert(String message3) {
        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(textoAlerta, (Question<Boolean>) Matchers.equalTo(message3)));
    }

    // metodo donde se busca un botón de version movile y se le da click
    @When("search of the button mobile version")
    public void searchOfTheButtonMobileVersion() {
        OnStage.theActorInTheSpotlight().attemptsTo(new SearchButton());
    }

    // metodo donde se valida la existencia del botón escritorio y compara el texto con uno en específico
    @Then("I see the option {string}")
    public void iSeeTheOption(String message4) {
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(Search.DESKTOP));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageButton.is(), Matchers.equalTo(message4)));
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(Search.DESKTOP));
    }

    // metodo donde se selecciona el historial y dos opciones para comparar
    @When("search of the button history")
    public void searchOfTheButtonHistory() {
        OnStage.theActorInTheSpotlight().attemptsTo(new SearchHistory());
    }

    // metodo donde se validar las comparaciones  del historial y dos mensajes en especifico
    @Then("I see the message {string}")
    public void iSeeTheMessage(String message5) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageFirstLabel.is(), Matchers.equalTo(message5)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageSecondLabel.is(), Matchers.equalTo(message5)));
    }
}
