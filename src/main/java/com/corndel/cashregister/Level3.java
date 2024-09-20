package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level3 {
  /**
   * Calculates the total value of all money in the drawer.
   */
  public static int sumDrawer(List<Item> drawer) {
    // TODO

    int total = 0;

    for (var item : drawer){
      total += item.value * item.quantity;
    }
    return total;
  }
}
