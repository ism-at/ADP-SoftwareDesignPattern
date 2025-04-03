package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    private List<Observer> observers = new ArrayList<>();
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    public abstract void updateQuality();
}
