package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.InternationFactory;
import org.qa.abstractfactory.models.Language;
import org.qa.abstractfactory.controller.capitalcity.Madrid;
import org.qa.abstractfactory.controller.language.Spanish;

public class SpanishFactory implements InternationFactory {
    /**
     * @return
     */
    @Override
    public Language getLanguage() {
        return new Spanish();
    }

    /**
     * @return
     */
    @Override
    public CapitalCity createCapital() {
        return new Madrid();
    }
}
