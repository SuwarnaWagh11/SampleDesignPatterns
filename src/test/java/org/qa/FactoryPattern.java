package org.qa;

import org.junit.jupiter.api.Test;
import org.qa.factorypattern.*;
import org.qa.factorypattern1.NexonConcrete;
import org.qa.factorypattern1.SafariConcrete;
import org.qa.factorypattern1.TataCarCreator;
import org.qa.factorypattern1.TataCars;

public class FactoryPattern {


    @Test
    public void verifyVehicalsFactoryMethodPattern(){

    }
    @Test
    public void verifyTataCarsFactoryMethodPattern(){
        TataCarCreator creator = new NexonConcrete();
        TataCars nexon = creator.createCars();
        nexon.generateNumberOfCars(40);
        SafariConcrete creator1 = new SafariConcrete();
        TataCars safari = creator1.createCars();
        safari.generateNumberOfCars(50);
    }
    @Test
    public void verifyFactoryMethodPattern(){
        Creator creator = new ConcreteCreatorA();
        Product product = creator.createProduct();
        product.doStuff();

        Creator creator1 = new ConcreteCreatorB();
        Product product1 = creator1.createProduct();
        product1.doStuff();
    }
}
