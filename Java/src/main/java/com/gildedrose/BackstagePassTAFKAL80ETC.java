package com.gildedrose;

public class BackstagePassTAFKAL80ETC extends Item {
    public BackstagePassTAFKAL80ETC(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            if (sellIn > 10) {
                quality++;
            } else if (sellIn > 5) {
                quality += 2;
            } else if (sellIn > 0) {
                quality += 3;
            } else {
                quality = 0;
            }
        }
    }
}
