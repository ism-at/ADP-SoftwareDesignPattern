package com.gildedrose;

public class Main {
    public static void main(String[] args) {

        Logger logger = new Logger();

        // Create an item (e.g., AgedBrie) and add observer
        Item agedBrie = new AgedBrie(0, 0);
        agedBrie.addObserver(logger);

        // For Update
        agedBrie.updateQuality();

        // Print the log to see the result
        logger.printLog();
    }
}
