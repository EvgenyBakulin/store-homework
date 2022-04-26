package pro.sky.storehomework;

import java.util.List;

public interface StoreService {
    List<Product> add(List<Integer> ID);

    boolean isID(List<Integer> ID);
}
