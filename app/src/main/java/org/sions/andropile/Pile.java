package org.sions.andropile;

import java.util.ArrayList;
import java.util.Random;

public class Pile {

    Random random;
    private ArrayList<String> collection;

    public Pile() {
        collection = new ArrayList<>();
        random = new Random();
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

    public String getChoice() {
        if (collection.size() == 0) return "";
        return collection.get(random.nextInt(collection.size()));
    }
}
