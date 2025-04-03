package com.gildedrose;

public class ConjuredDecorator extends Item {

    private Item decoratedItem;

    public ConjuredDecorator(Item decoratedItem) {
        super(decoratedItem.name, decoratedItem.sellIn, decoratedItem.quality);
        this.decoratedItem = decoratedItem;
    }

    @Override
    public void updateQuality() {
        decoratedItem.updateQuality();  
        if (decoratedItem.quality > 0) {
            decoratedItem.quality -= 1;
        }
    }
}
