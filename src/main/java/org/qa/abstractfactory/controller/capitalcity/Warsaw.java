package org.qa.abstractfactory.controller.capitalcity;

import org.qa.abstractfactory.models.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class Warsaw implements CapitalCity {
    /**
     * @return
     */
    @Override
    public int getPopulation() {
        return 200000;
    }

    /**
     * @return
     */
    @Override
    public List<String> getListOfAttractions() {
        return Arrays.asList("Cultural Palace", "Royal Castle", "Polish Museum");
    }
}
