package com.gildedrose;

public class BackstagePassGalla extends Item {
    public BackstagePassGalla(int sellIn, int quality) {
        super("Backstage passes to a GALLA concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality < 50) {
            if (sellIn > 10) {
                quality += 2;
            } else if (sellIn > 5) {
                quality += 3;
            } else if (sellIn > 0) {
                quality += 4;
            } else {
                quality = 0;
            }
        }
    }
}
