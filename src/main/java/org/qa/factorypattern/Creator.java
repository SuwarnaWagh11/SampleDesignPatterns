package org.qa.factorypattern;

public abstract class Creator {

    public void someOperation(){
        System.out.println("I am in Creator class, doing some operations ;)");
    }

    public abstract Product createProduct();
}
