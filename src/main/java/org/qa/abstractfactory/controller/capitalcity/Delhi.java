package org.qa.abstractfactory.controller.capitalcity;

import org.qa.abstractfactory.models.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class Delhi implements CapitalCity {
    /**
     * @return
     */
    @Override
    public int getPopulation() {
        return 5498900;
    }

    /**
     * @return
     */
    @Override
    public List<String> getListOfAttractions() {
        return Arrays.asList("Taj Mahal", "Lal Mahal", "Street Food");
    }
}
