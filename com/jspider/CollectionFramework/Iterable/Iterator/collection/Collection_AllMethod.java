package com.jspider.CollectionFramework.Iterable.Iterator.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

interface Collection_AllMethod extends Collection{
    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    Iterator iterator();

    @Override
    Object[] toArray();

    @Override
    Object[] toArray(Object[] a);

    @Override
    default Object[] toArray(IntFunction generator) {
        return Collection.super.toArray(generator);
    }

    @Override
    boolean add(Object o);

    @Override
    boolean remove(Object o);

    @Override
    boolean containsAll(Collection c);

    @Override
    boolean addAll(Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    default boolean removeIf(Predicate filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    boolean retainAll(Collection c);

    @Override
    void clear();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    default Spliterator spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    default Stream stream() {
        return Collection.super.stream();
    }

    @Override
    default Stream parallelStream() {
        return Collection.super.parallelStream();
    }

    @Override
    default void forEach(Consumer action) {
        Collection.super.forEach(action);
    }
}
