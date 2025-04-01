package com.gildedrose;

public class SulfurasStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        // Here I don't need to change anything,
        // because Sulfuras items never be changed in quality or sell-in.
    }
}
