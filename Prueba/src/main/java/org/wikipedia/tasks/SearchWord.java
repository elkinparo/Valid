package org.wikipedia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.wikipedia.userinterfaces.Search;

public class SearchWord implements Task
{
     String option;

    public SearchWord(String option) {
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(option).into(Search.SEARCH_WORD),
                Click.on(Search.BUTTON_SEARCH));
    }
    public SearchWord SearchWord(String option) {
        return Tasks.instrumented(SearchWord.class, option);
    }

}
