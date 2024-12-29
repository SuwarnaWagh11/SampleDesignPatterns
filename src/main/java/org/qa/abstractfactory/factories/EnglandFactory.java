package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.models.InternationFactory;
import org.qa.abstractfactory.models.Language;
import org.qa.abstractfactory.languagecontrollers.English;
import org.qa.abstractfactory.capitalcitycontroller.London;

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
