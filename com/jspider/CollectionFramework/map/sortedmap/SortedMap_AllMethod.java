package com.jspider.CollectionFramework.map.sortedmap;

import java.util.*;

public interface SortedMap_AllMethod  extends SortedMap {
    @Override
    Comparator comparator();

    @Override
    SortedMap subMap(Object fromKey, Object toKey);

    @Override
    SortedMap headMap(Object toKey);

    @Override
    SortedMap tailMap(Object fromKey);

    @Override
    Object firstKey();

    @Override
    Object lastKey();

    @Override
    Set keySet();

    @Override
    Collection values();

    @Override
    Set<Entry> entrySet();

    @Override
    default Object putFirst(Object o, Object o2) {
        return SortedMap.super.putFirst(o, o2);
    }

    @Override
    default Object putLast(Object o, Object o2) {
        return SortedMap.super.putLast(o, o2);
    }

    @Override
    default SortedMap reversed() {
        return SortedMap.super.reversed();
    }
}
