package org.qa.abstractfactory.languagecontrollers;

import org.qa.abstractfactory.models.Language;

public class Spanish implements Language {
    /**
     *
     */
    @Override
    public void greet() {
        System.out.println("Ciao!!!");
    }
}
