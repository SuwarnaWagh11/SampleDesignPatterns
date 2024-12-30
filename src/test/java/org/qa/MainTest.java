package org.qa;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.qa.abstractfactory.factories.*;
import org.qa.abstractfactory.models.CapitalCity;
import org.qa.abstractfactory.InternationFactory;
import org.qa.abstractfactory.models.Language;

/**
 * A simple unit test
 */
public class MainTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void verifyTestForLondon()
    {
        InternationFactory factory = new EnglandFactory();
        CapitalCity capital = factory.createCapital();
        Language lang = factory.getLanguage();
        lang.greet();
        System.out.println("London contains population "+ capital.getPopulation()+ "\nHere are some attractions "+ capital.getListOfAttractions());
        assertTrue( true );
    }

    @Test
    public void verifyTestForMadrid()
    {
        InternationFactory factory = new SpanishFactory();
        CapitalCity capital = factory.createCapital();
        Language lang = factory.getLanguage();
        lang.greet();
        System.out.println("Madrid contains population "+ capital.getPopulation()+ "\nHere are some attractions "+ capital.getListOfAttractions());
        assertTrue( true );
    }

    @Test
    public void verifyTestForWarsaw()
    {
        InternationFactory factory = new WarsawFactory();
        CapitalCity capital = factory.createCapital();
        Language lang = factory.getLanguage();
        lang.greet();
        System.out.println("Warsaw contains population "+ capital.getPopulation()+ "\nHere are some attractions "+ capital.getListOfAttractions());
        assertTrue( true );
    }

    @Test
    public void verifyTestForDelhi()
    {
        InternationFactory factory = new DelhiFactory();
        CapitalCity capital = factory.createCapital();
        Language lang = factory.getLanguage();
        lang.greet();
        System.out.println("Delhi contains population "+ capital.getPopulation()+ "\nHere are some attractions "+ capital.getListOfAttractions());
        assertTrue( true );
    }

    @Test
    public void verifyTestForParis()
    {
        InternationFactory factory = new ParisFactory();
        CapitalCity capital = factory.createCapital();
        Language lang = factory.getLanguage();
        lang.greet();
        System.out.println("Paris contains population "+ capital.getPopulation()+ "\nHere are some attractions "+ capital.getListOfAttractions());
        assertTrue( true );
    }
}
