package org.wikipedia.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_word.feature",
        glue = {"org.wikipedia.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, tags = "@createCount")

public class SearchWordRunner {
}
