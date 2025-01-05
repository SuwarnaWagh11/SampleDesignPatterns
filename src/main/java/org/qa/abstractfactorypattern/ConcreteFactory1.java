package org.qa.abstractfactorypattern;

public class ConcreteFactory1 implements AbstractFactory {
    /**
     * @return
     */
    @Override
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
