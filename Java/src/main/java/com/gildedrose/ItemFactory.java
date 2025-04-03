package com.gildedrose;

public class ItemFactory {

    public static Item createItem(String itemName, int sellIn, int quality) {
        switch (itemName) {

            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassTAFKAL80ETC(sellIn, quality);

            case "Backstage passes to a GALLA concert":
                return new BackstagePassGalla(sellIn, quality);

            default:
                throw new IllegalArgumentException("Unknown item type: " + itemName);
        }
    }
}
