package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Logger implements Observer {

    private List<String> log = new ArrayList<>();

    @Override
    public void update(Item item) {
        log.add("Item updated: " + item.name + " | New Quality: " + item.quality);
    }

    public void printLog() {
        for (String entry : log) {
            System.out.println(entry);
        }
    }
}
