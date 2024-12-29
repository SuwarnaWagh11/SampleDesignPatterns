package org.qa.abstractfactory.factories;

import org.qa.abstractfactory.languagecontrollers.Polish;
import org.qa.abstractfactory.capitalcitycontroller.Warsaw;
import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.models.InternationFactory;
import org.qa.abstractfactory.models.Language;

public class WarsawFactory implements InternationFactory {
    /**
     * @return
     */
    @Override
    public Language getLanguage() {
        return new Polish();
    }

    /**
     * @return
     */
    @Override
    public CapitalCity createCapital() {
        return new Warsaw();
    }
}
