package org.qa.factorypattern1;

public class TataPunch implements TataCars{
    /**
     * @param n
     */
    @Override
    public void generateNumberOfCars(int n) {
        System.out.println("Generating Tata Punch Cars: "+ n);
    }
}
