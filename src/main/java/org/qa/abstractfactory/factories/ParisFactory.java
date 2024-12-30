package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.controller.capitalcity.Paris;
import org.qa.abstractfactory.controller.language.French;
import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.InternationFactory;
import org.qa.abstractfactory.models.Language;

public class ParisFactory implements InternationFactory {
    /**
     * @return
     */
    @Override
    public Language getLanguage() {
        return new French();
    }

    /**
     * @return
     */
    @Override
    public CapitalCity createCapital() {
        return new Paris();
    }
}
