
# Gilded Rose

### Used Patterns:

1. **Strategy Pattern**: It's used to handle the different behaviors for various types of items (e.g., `AgedBrie`, `Sulfuras`).

2. **Factory Method Pattern**: Used to instantiate the correct subclass for different item types (e.g., `BackstagePass`).

3. **Decorator Pattern**: Used for `Conjured` items to degrade twice as fast without modifying the core item classes.

4. **Observer Pattern**: The new Added pattern, used to notify observers (like a logger) when an item's quality changes. This helps keep track of changes in the system without tightly coupling components.

### Workflow:

1. **Item Types**: Each item type (e.g., `AgedBrie`, `BackstagePass`, `Sulfuras`) is represented by a subclass of `Item`. These subclasses implement different `updateQuality()` behaviors.

2. **ItemFactory**: This factory method is responsible for creating the appropriate `Item` subclass based on the name.

3. **Quality Updates**: The quality of each item is updated using the `updateQuality()` method. For `Conjured` items, the **Decorator Pattern** ensures the quality degrades twice as fast.


### Complexity:

- The **Decorator Pattern** adds flexibility to extend item behaviors dynamically without modifying existing code.
- The **Factory Method** allows for easy creation of different item types while keeping code clean and extensible.
- The **Observer Pattern** ensures that changes to item quality are tracked without tightly couplling components.

---


