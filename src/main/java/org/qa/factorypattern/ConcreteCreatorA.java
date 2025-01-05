package org.qa.factorypattern;

public class ConcreteCreatorA extends Creator{
    /**
     * @return
     */
    @Override
    public Product createProduct() {
        return new ConcreteProdA();
    }
}
