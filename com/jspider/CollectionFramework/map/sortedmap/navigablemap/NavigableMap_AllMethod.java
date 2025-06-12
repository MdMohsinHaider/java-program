package com.jspider.CollectionFramework.map.sortedmap.navigablemap;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

public interface NavigableMap_AllMethod extends NavigableMap {

    @Override
    default Object putLast(Object o, Object o2) {
        return NavigableMap.super.putLast(o, o2);
    }

    @Override
    Entry lowerEntry(Object key);

    @Override
    Object lowerKey(Object key);

    @Override
    Entry floorEntry(Object key);

    @Override
    Object floorKey(Object key);

    @Override
    Entry ceilingEntry(Object key);

    @Override
    Object ceilingKey(Object key);

    @Override
    Entry higherEntry(Object key);

    @Override
    Object higherKey(Object key);

    @Override
    Entry firstEntry();

    @Override
    Entry lastEntry();

    @Override
    Entry pollFirstEntry();

    @Override
    Entry pollLastEntry();

    @Override
    NavigableMap descendingMap();

    @Override
    NavigableSet navigableKeySet();

    @Override
    NavigableSet descendingKeySet();

    @Override
    NavigableMap subMap(Object fromKey, boolean fromInclusive, Object toKey, boolean toInclusive);

    @Override
    NavigableMap headMap(Object toKey, boolean inclusive);

    @Override
    NavigableMap tailMap(Object fromKey, boolean inclusive);

    @Override
    SortedMap subMap(Object fromKey, Object toKey);

    @Override
    SortedMap headMap(Object toKey);

    @Override
    SortedMap tailMap(Object fromKey);

    @Override
    default NavigableMap reversed() {
        return NavigableMap.super.reversed();
    }
}
