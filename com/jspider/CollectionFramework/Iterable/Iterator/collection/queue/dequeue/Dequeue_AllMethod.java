package com.jspider.CollectionFramework.Iterable.Iterator.collection.queue.dequeue;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Dequeue_AllMethod extends Deque {
    @Override
    void addFirst(Object o);

    @Override
    void addLast(Object o);

    @Override
    boolean offerFirst(Object o);

    @Override
    boolean offerLast(Object o);

    @Override
    Object removeFirst();

    @Override
    Object removeLast();

    @Override
    Object pollFirst();

    @Override
    Object pollLast();

    @Override
    Object getFirst();

    @Override
    Object getLast();

    @Override
    Object peekFirst();

    @Override
    Object peekLast();

    @Override
    boolean removeFirstOccurrence(Object o);

    @Override
    boolean removeLastOccurrence(Object o);

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

    @Override
    boolean addAll(Collection c);

    @Override
    void push(Object o);

    @Override
    Object pop();

    @Override
    boolean remove(Object o);

    @Override
    boolean contains(Object o);

    @Override
    int size();

    @Override
    Iterator iterator();

    @Override
    Iterator descendingIterator();

    @Override
    default Deque reversed() {
        return Deque.super.reversed();
    }




    // Collection

    @Override
    boolean isEmpty();

    @Override
    Object[] toArray();

    @Override
    Object[] toArray(Object[] a);

    @Override
    default Object[] toArray(IntFunction generator) {
        return Deque.super.toArray(generator);
    }

    @Override
    boolean containsAll(Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    default boolean removeIf(Predicate filter) {
        return Deque.super.removeIf(filter);
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
        return Deque.super.spliterator();
    }

    @Override
    default Stream stream() {
        return Deque.super.stream();
    }

    @Override
    default Stream parallelStream() {
        return Deque.super.parallelStream();
    }



    // Iterable


    @Override
    default void forEach(Consumer action) {
        Deque.super.forEach(action);
    }
}
