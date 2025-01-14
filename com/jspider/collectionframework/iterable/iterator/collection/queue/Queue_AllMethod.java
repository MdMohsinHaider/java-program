package com.jspider.collectionframework.iterable.iterator.collection.queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Queue_AllMethod extends Queue {
    @Override
    boolean add(Object o);

    @Override
    boolean offer(Object o);

    @Override
    Object remove();

    @Override
    Object poll();

    @Override
    Object element();

    @Override
    Object peek();





    // Collection

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
        return Queue.super.toArray(generator);
    }

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
        return Queue.super.removeIf(filter);
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
        return Queue.super.spliterator();
    }

    @Override
    default Stream stream() {
        return Queue.super.stream();
    }

    @Override
    default Stream parallelStream() {
        return Queue.super.parallelStream();
    }




    // Iterable

    @Override
    default void forEach(Consumer action) {
        Queue.super.forEach(action);
    }
}
