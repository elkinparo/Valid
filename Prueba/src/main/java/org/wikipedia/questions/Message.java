package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.TITLE_HOME;

public class Message implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return TITLE_HOME.resolveFor(actor).getText();
    }
    public static Message is() {
        return new Message();
    }
}
