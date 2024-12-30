package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.controller.capitalcity.Delhi;
import org.qa.abstractfactory.controller.language.Hindi;
import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.InternationFactory;
import org.qa.abstractfactory.models.Language;

public class DelhiFactory implements InternationFactory {
    /**
     * @return
     */
    @Override
    public Language getLanguage() {
        return new Hindi();
    }

    /**
     * @return
     */
    @Override
    public CapitalCity createCapital() {
        return new Delhi();
    }
}
