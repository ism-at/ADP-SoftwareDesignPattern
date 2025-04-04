package com.gildedrose;

public class Conjured extends Item {

    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality > 0) {
            quality -= 2;
        }
    }
}
