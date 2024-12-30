package org.qa.abstractfactory.controller.language;

import org.qa.abstractfactory.models.Language;

public class Hindi implements Language {
    /**
     *
     */
    @Override
    public void greet() {
        System.out.println("Namaste!!!");
    }
}
