package com.jspider.CollectionFramework.Iterable;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

interface Iterable_AllMethod extends Iterable {
    @Override
    Iterator iterator();

    @Override
    default void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    default Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
