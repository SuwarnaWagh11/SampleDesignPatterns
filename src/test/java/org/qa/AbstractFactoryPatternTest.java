package org.qa;

import org.junit.jupiter.api.Test;
import org.qa.abstractfactorypattern.*;

public class AbstractFactoryPatternTest {

    @Test
    public void verifyTestForAbstractFactoryPattern(){
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA proda1 = factory1.createProductA();
        ProductB prodb1 = factory1.createProductB();
        proda1.someProductAStuff();
        prodb1.someProductBStuff();
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA prod1 = factory2.createProductA();
        prod1.someProductAStuff();
        ProductB prod2 = factory2.createProductB();
        prod2.someProductBStuff();
    }
}
