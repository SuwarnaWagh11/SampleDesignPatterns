package org.qa.abstractfactorypattern;

public class ConcreteFactory2 implements AbstractFactory {
    /**
     * @return
     */
    public ProductA createProductA() {
        return new ConcreteProdA();
    }

    /**
     * @return
     */
    @Override
    public ProductB createProductB() {
        return new ConcreteProdB();
    }
}
