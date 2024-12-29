package org.qa.abstractfactory.models;

public interface InternationFactory {

    Language getLanguage();
    CapitalCity createCapital();
}
