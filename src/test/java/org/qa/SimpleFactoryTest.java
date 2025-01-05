package org.qa;

import org.junit.jupiter.api.Test;
import org.qa.simplefactory.*;


public class SimpleFactoryTest {
    /*Define an interface for creating an object, but let subclasses decide which class to instantiate.
    Factory method lets a class defer instantiation to subclasses.

    You are separating code that can vary from the code that does not vary
    (i.e., the advantages of using a simple factory pattern is still present). This technique helps you easily maintain code.
    Your code is not tightly coupled; so, you can add new classes like Lion, Beer,
    and so forth, at any time in the system without modifying the existing architecture.
    So, you have followed the “closed for modification but open for extension” principle.
    */
    @Test
    public void simpleFactoryMethodTestVerification(){
        Factory<BaseInterface> secFact = new SupplierFactory<>();
        secFact.instantiate(Beta::new).doAction();
        secFact.instantiate((Alpha::new)).doAction();
    }
}
