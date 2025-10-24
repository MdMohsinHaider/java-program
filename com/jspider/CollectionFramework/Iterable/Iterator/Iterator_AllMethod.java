package com.jspider.CollectionFramework.Iterable.Iterator;

import java.util.Iterator;
import java.util.function.Consumer;

interface Iterator_AllMethod extends Iterator{
    @Override
    boolean hasNext();

    @Override
    Object next();

    @Override
    default void remove() {
        Iterator.super.remove();
    }

    @Override
    default void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action);
    }
}
