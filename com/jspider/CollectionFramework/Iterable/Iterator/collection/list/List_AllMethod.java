package com.jspider.CollectionFramework.Iterable.Iterator.collection.list;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

interface List_AllMethod extends List{
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
    boolean addAll(int index, Collection c);

    @Override
    boolean removeAll(Collection c);

    @Override
    boolean retainAll(Collection c);

    @Override
    default void replaceAll(UnaryOperator operator) {
        List.super.replaceAll(operator);
    }

    @Override
    default void sort(Comparator c) {
        List.super.sort(c);
    }

    @Override
    void clear();

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();

    @Override
    Object get(int index);

    @Override
    Object set(int index, Object element);

    @Override
    void add(int index, Object element);

    @Override
    Object remove(int index);

    @Override
    int indexOf(Object o);

    @Override
    int lastIndexOf(Object o);

    @Override
    ListIterator listIterator();

    @Override
    ListIterator listIterator(int index);

    @Override
    List subList(int fromIndex, int toIndex);

    @Override
    default Spliterator spliterator() {
        return List.super.spliterator();
    }

    @Override
    default void addFirst(Object o) {
        List.super.addFirst(o);
    }

    @Override
    default void addLast(Object o) {
        List.super.addLast(o);
    }

    @Override
    default Object getFirst() {
        return List.super.getFirst();
    }

    @Override
    default Object getLast() {
        return List.super.getLast();
    }

    @Override
    default Object removeFirst() {
        return List.super.removeFirst();
    }

    @Override
    default Object removeLast() {
        return List.super.removeLast();
    }

    @Override
    default List reversed() {
        return List.super.reversed();
    }

    @Override
    default Object[] toArray(IntFunction generator) {
        return List.super.toArray(generator);
    }

    @Override
    default boolean removeIf(Predicate filter) {
        return List.super.removeIf(filter);
    }

    @Override
    default Stream stream() {
        return List.super.stream();
    }

    @Override
    default Stream parallelStream() {
        return List.super.parallelStream();
    }

    @Override
    default void forEach(Consumer action) {
        List.super.forEach(action);
    }
}
