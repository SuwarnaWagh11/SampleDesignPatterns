package org.qa.factorypattern1;

public class SafariConcrete extends TataCarCreator{
    /**
     * @return
     */
    @Override
    public TataCars createCars() {
        return new TataSafari();
    }

    /**
     *
     */
    @Override
    public void generateCost() {
        System.out.println("Cost for TATA Safari is 60K$");
    }
}
