package org.qa.factorypattern1;

public class NexonConcrete extends TataCarCreator{
    /**
     * @return
     */
    @Override
    public TataCars createCars() {
        return new TataNexon();
    }

    /**
     *
     */
    @Override
    public void generateCost() {
        System.out.println("Cost for TATA Nexon is 50K$");
    }
}
