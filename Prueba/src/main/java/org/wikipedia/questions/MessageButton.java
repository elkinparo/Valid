package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.DESKTOP;

public class MessageButton implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return DESKTOP.resolveFor(actor).getText();
    }
    public static MessageButton is() {
        return new MessageButton();
    }
}
