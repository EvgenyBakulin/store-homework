package pro.sky.storehomework;

import java.util.HashMap;
import java.util.Map;

public class Storebase {
    private Map<Integer, String> storebase = Map.of(1, "Milk", 2, "Bread", 3, "Eggs",
            4, "Meat", 5, "Fruits", 6, "Bear");

    public Map<Integer, String> getStorebase() {
        return storebase;
    }
}
