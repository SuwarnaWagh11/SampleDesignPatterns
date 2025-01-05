package org.qa.factorypattern1;

public class TataNexon implements TataCars{
    /**
     * @param n
     */
    @Override
    public void generateNumberOfCars(int n) {
        System.out.println("Generating Tata Nexon Cars: "+ n);
    }
}
