package org.qa.simplefactory;

import java.util.function.Supplier;

public abstract class Factory<T> {

    public abstract T instantiate(Supplier<? extends T> supplier);
}
