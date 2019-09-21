package org.sions.andropile;

import java.util.ArrayList;

public class Pile {
    private ArrayList<String> collection;

    public Pile() {
        collection = new ArrayList<>();
    }

    public void add(String entry) {
        collection.add(entry);
    }

    public ArrayList<String> list() {
        return collection;
    }

    public void delete(String entry) {
        collection.remove(entry);
    }
}
