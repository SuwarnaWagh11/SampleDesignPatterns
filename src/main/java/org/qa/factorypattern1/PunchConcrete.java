package org.qa.factorypattern1;

public class PunchConcrete extends TataCarCreator{
    /**
     * @return
     */
    @Override
    public TataCars createCars() {
        return new TataPunch();
    }

    /**
     *
     */
    @Override
    public void generateCost() {
        System.out.println("Cost for TATA Punch is 70K$");
    }
}
