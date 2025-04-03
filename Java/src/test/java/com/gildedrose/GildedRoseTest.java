package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void testAgedBrie() {
        Item[] items = new Item[] { new AgedBrie( 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }

    @Test
    void testBackstagePass() {
        Item[] items = new Item[] { new BackstagePass( 15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Sulfuras( 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void testConjured() {
        Item[] items = new Item[] { new Conjured("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.items[0].quality);
    }

    @Test
    void testNormalItem() {
        Item[] items = new Item[] { new NormalItem("Elixir of the Mongoose", 5, 7) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6, app.items[0].quality);
    }

    @Test
    void testExpiredAgedBrie() {
        Item[] items = new Item[] { new AgedBrie(0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }



    @Test
    void testExpiredBackstagePass() {
        Item[] items = new Item[] { new BackstagePass( 0, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testBackstagePassTAFKAL80ETC() {
        Item[] items = new Item[] { new BackstagePassTAFKAL80ETC(15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality); // Quality should increase by 1
    }

    @Test
    void testBackstagePassGalla() {
        Item[] items = new Item[] { new BackstagePassGalla(15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(22, app.items[0].quality); // Quality should increase by 2
    }
}
