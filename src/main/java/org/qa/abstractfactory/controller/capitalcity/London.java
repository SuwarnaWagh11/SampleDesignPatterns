package org.qa.abstractfactory.controller.capitalcity;

import org.qa.abstractfactory.models.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class London implements CapitalCity {
    /**
     * @return
     */
    @Override
    public int getPopulation() {
        return 890000;
    }

    /**
     * @return
     */
    @Override
    public List<String> getListOfAttractions() {
        return Arrays.asList("Tower Bridge", "London Bridge", "Baker Street", "Oxford Street");
    }
}
