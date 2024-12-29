package org.qa.abstractfactory.languagecontrollers;

import org.qa.abstractfactory.models.Language;

public class Polish implements Language {
    /**
     *
     */
    @Override
    public void greet() {
        System.out.println("Dzein Dobrey");
    }
}
