package org.qa.factorypattern;

public class ConcreteCreatorB extends Creator{
    /**
     * @return
     */
    @Override
    public Product createProduct() {
        return new ConcreteProdB();
    }
}
