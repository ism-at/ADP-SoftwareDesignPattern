package com.gildedrose;

public class AgedBrieStrategy implements ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.quality < 50) {
            item.quality++;

        }
    }
}
