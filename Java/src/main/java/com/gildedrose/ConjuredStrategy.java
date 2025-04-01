package com.gildedrose;

public class ConjuredStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.quality > 0) {
            item.quality -= 2;
        }
    }
}
