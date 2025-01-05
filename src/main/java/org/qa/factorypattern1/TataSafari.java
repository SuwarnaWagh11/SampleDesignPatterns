package org.qa.factorypattern1;

public class TataSafari implements TataCars {
    /**
     *
     */
    @Override
    public void generateNumberOfCars(int num) {
        System.out.println("Generating Tata Safari Cars: "+ num);
    }
}
