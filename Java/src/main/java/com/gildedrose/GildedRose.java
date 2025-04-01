package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;
    Map<String, ItemStrategy> strategies;
    public GildedRose(Item[] items) {
        this.items = items;
        strategies = new HashMap<>();

        // Registeration the strategies for each item type
        strategies.put("Aged Brie", new AgedBrieStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassStrategy());
        strategies.put("Conjured Mana Cake", new ConjuredStrategy());
        strategies.put("default", new DefaultStrategy());
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemStrategy strategy = strategies.getOrDefault(item.name, strategies.get("default"));
            strategy.updateQuality(item);

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn--;
            }

            if (item.sellIn < 0) {
                // Handling expired items using the default strategy
                strategies.getOrDefault(item.name, strategies.get("default")).updateQuality(item);
            }
        }
    }
}
