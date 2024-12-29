package org.qa.abstractfactory.capitalcitycontroller;

import org.qa.abstractfactory.models.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class Madrid implements CapitalCity {
    /**
     * @return
     */
    @Override
    public int getPopulation() {
        return 230000;
    }

    /**
     * @return
     */
    @Override
    public List<String> getListOfAttractions() {
        return Arrays.asList("Prado", "Royal Palace", "Temple Of Debod");
    }
}
