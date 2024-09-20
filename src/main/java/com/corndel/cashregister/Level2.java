package com.corndel.cashregister;

import com.corndel.cashregister.models.Item;

import java.util.ArrayList;
import java.util.List;

public class Level2 {
    /**
     * Goes through the given drawer and counts how many *coins* there are in total
     *
     * <p>
     * N.b. just the number of coins, not the total value of them
     *
     * <p>
     * N.b. $1 is a note, not a coin
     */
    public static int countCoins(List<Item> drawer) {
        // TODO
        int coinCount = 0;

//    var coins = new ArrayList<>();
//    coins.add("penny");
//    coins.add("nickel");
//    coins.add("dime");


        for (var item : drawer) {
            if (item.name.equals("penny")) {
                coinCount += item.quantity;
            } else if (item.name.equals("nickel")) {
                coinCount += item.quantity;
            } else if (item.name.equals("dime")) {
                coinCount += item.quantity;
            } else if (item.name.equals("quarter")) {
                coinCount += item.quantity;
            }
        }
        return coinCount;
    }




/**
 * Same as count coins but for *notes* instead
 */
public static int countNotes(List<Item> drawer) {
    // TODO
    int noteCount = 0;
    for (var item : drawer) {
        if ((item.name.equals("penny")) || (item.name.equals("nickel")) || (item.name.equals("dime")) || (item.name.equals("quarter"))){
            continue;
        }
        else {
            noteCount += item.quantity;

        }

    }
    return noteCount;
}
}