package pro.sky.storehomework;

import java.util.HashMap;
import java.util.Map;

public class Storebase {
    private Map <Integer, String> storebase;

    public Storebase(){
        Map<Integer, String>storebase = new HashMap<Integer,String>();
        storebase.put(1,"Bread");
        storebase.put(2,"Milk");
        storebase.put(3,"Eggs");
        storebase.put(4,"Meat");
        storebase.put(5,"Fish");
        storebase.put(6,"Bear");
    }
}
