package org.qa.abstractfactory;

import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.models.Language;

public interface InternationFactory {

    Language getLanguage();
    CapitalCity createCapital();
}
