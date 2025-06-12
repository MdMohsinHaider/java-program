package com.jspider.CollectionFramework.Iterable.Iterator.collection.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Set_AllMethod extends Set {
    @Override
    default Spliterator spliterator() {
        return Set.super.spliterator();
    }

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
    boolean add(Object o);

    @Override
    boolean remove(Object o);

    @Override
    boolean containsAll(Collection c);

    @Override
    boolean addAll(Collection c);

    @Override
    boolean retainAll(Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    void clear();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    default Object[] toArray(IntFunction generator) {
        return Set.super.toArray(generator);
    }

    @Override
    default boolean removeIf(Predicate filter) {
        return Set.super.removeIf(filter);
    }

    @Override
    default Stream stream() {
        return Set.super.stream();
    }

    @Override
    default Stream parallelStream() {
        return Set.super.parallelStream();
    }

    @Override
    default void forEach(Consumer action) {
        Set.super.forEach(action);
    }
}
