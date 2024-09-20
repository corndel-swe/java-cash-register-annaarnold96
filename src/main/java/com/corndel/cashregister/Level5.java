package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level5 {
  /**
   * Calculates the amount of change the customer is owed based on the cost and
   * the amount paid. Adds the customer's paid amount to the drawer, removes their
   * change from the drawer, and then returns the updated drawer.
   * 
   * <p>
   * The paid items must be added to the drawer before removing the appropriate
   * change.
   * 
   * <p>
   * E.g., if the customer pays for $8.50 worth of goods with a $5 and 4 * $1
   * bills, then `paid` will be given as
   * 
   * List.of(new Item("five", 500, 1), new Item("one", 100, 4))
   * 
   * A "five" and a "one" should be added to the drawer, and two "quarters" should
   * be removed as change.
   * 
   * <p>
   * If you want to re-use some functions from other levels, you can do, e.g.
   * Level1.addItem(...) and so on.
   */
  public static List<Item> transaction(int cost, List<Item> paid, List<Item> drawer) {
    // TODO
    /**
     * Cost given and paid given
     * calculate if change can be given
     * if yes, add paid to drawer
     * then remove change
     * return drawer
     */
    System.out.println("1:" + drawer);
    // Check what change is required and if it can be given
    var changeRequired = Level3.sumDrawer(paid) - cost;
    System.out.println(changeRequired);
    boolean canGiveChange = Level4.canMakeAmount(changeRequired, drawer);
    System.out.println("2:" + drawer);
    // If change can be given, add payment into drawer
    if (canGiveChange){
      for (var item : paid){
        Level1.addItem(item.name, drawer);
        System.out.println(item.name + ":" + item.quantity);

      }
      System.out.println(drawer);

      // Then make change.
      for (var item : drawer) {
        while (item.value <= changeRequired && item.quantity > 0) {
          changeRequired -= item.value;
          item.quantity -= 1;
        }
      }

    }else {
      System.out.println("No change available");
    }
    System.out.println(drawer);
    return drawer;
    }



  }

