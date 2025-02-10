package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract class AbstractStore {
    protected List<Item> items = new ArrayList<>();
    @SuppressWarnings("unused")
    abstract void demo();
    @SuppressWarnings("unused")
    void sortBy(Comparator<Item> comparator) { items.sort(comparator); }
}