package org.wikipedia.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Search
{
    public static final Target TITLE_HOME = Target.the("TITLE_HOME").located(By.xpath(
            "//h1[@class='main-top-header']//span[@class='mw-headline']"));
    public static final Target SEARCH_WORD = Target.the("SEARCH_WORD").located(By.xpath(
            "//input[@class='cdx-text-input__input']"));
    public static final Target BUTTON_SEARCH = Target.the("BUTTON_SEARCH").located(By.xpath(
            "//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button" +
                    "--size-medium cdx-button--framed cdx-search-input__end-button']"));
    public static final Target TITLE_SISTEMA = Target.the("TITLE_SISTEMA").located(By.xpath(
            "//span[@class='mw-page-title-main']"));
    public static final Target TITLE = Target.the("TITLE").located(By.xpath(
            "//span[@id='Análisis_CEEM']"));
    public static final Target MOBILE_VERSION = Target.the("MOBILE_VERSION").located(By.id(
            "footer-places-mobileview"));
    public static final Target DESKTOP = Target.the("DESKTOP").located(By.id(
            "mw-mf-display-toggle"));
    public static final Target HISTORY = Target.the("HISTORY").located(By.id(
            "ca-history"));
    public static final Target FIRST_OPTION = Target.the("FIRST_OPTION").located(By.id(
            "mw-oldid-115085235"));
    public static final Target SECOND_OPTION = Target.the("SECOND_OPTION").located(By.id(
            "mw-diff-123425818"));
    public static final Target SEARCH_SELECT = Target.the("SEARCH_SELECT").located(By.xpath(
            "//input[@class='historysubmit mw-history-compareselectedversions-button mw-ui-button']"));
    public static final Target FIRST_LABEL = Target.the("FIRST_LABEL").located(By.xpath(
            "//td[@class='diff-otitle diff-side-deleted']//span[@class='mw-tag-markers']"));
    public static final Target SECOND_LABEL = Target.the("SECOND_LABEL").located(By.xpath(
            "//td[@class='diff-ntitle diff-side-added']//span[@class='mw-tag-markers']"));


}
