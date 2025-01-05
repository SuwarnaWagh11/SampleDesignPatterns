package org.qa.simplefactory;

import java.util.function.Supplier;

public class SupplierFactory <T> extends Factory<T> {
    /**
     * @param supplier
     * @return
     */
    @Override
    public T instantiate(Supplier<? extends T> supplier) {
        return supplier.get();
    }
}
