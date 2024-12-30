package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.InternationFactory;
import org.qa.abstractfactory.models.Language;
import org.qa.abstractfactory.controller.language.English;
import org.qa.abstractfactory.controller.capitalcity.London;

public class EnglandFactory implements InternationFactory {
    /**
     * @return
     */
    @Override
    public Language getLanguage() {
        return new English();
    }

    /**
     * @return
     */
    @Override
    public CapitalCity createCapital() {
        return new London();
    }
}
