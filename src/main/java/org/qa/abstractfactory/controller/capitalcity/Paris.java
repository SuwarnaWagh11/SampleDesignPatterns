package org.qa.abstractfactory.controller.capitalcity;

import org.qa.abstractfactory.models.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class Paris implements CapitalCity {
    /**
     * @return
     */
    @Override
    public int getPopulation() {
        return 4300000;
    }

    /**
     * @return
     */
    @Override
    public List<String> getListOfAttractions() {
        return Arrays.asList("Eiffel Tower","The Louvre","The Arch de Triumphe");
    }
}
