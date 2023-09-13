package org.wikipedia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.wikipedia.userinterfaces.Search.TITLE;


public class MessageTitle implements Question
{
    @Override
    public String answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).getText();
    }
    public static MessageTitle is() {
        return new MessageTitle();
    }
}
