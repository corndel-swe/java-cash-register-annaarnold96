package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;
import java.util.List;

public class Level4 {
  /**
   * Returns true if it is possible to make the target amount out of the cash in
   * the drawer. Returns false if it is not possible.
   */
  public static boolean canMakeAmount(int target, List<Item> drawer) {
    // TODO
    int targetAmount = target;
    int total = Level3.sumDrawer(drawer);
    if (total < target){
      return false;
    }
    else {
      for (var item : drawer) {
        while (item.value <= targetAmount && item.quantity > 0) {
          targetAmount -= item.value;
          item.quantity -= 1;
        }
      }
      return targetAmount == 0;

    }
  }
}
