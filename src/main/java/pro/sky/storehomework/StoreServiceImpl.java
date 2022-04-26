package pro.sky.storehomework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImpl implements StoreService {

    //Создал небольшую базу товаров (Мап), откуда можно заказывать, в отдельном классе (Storebase)
    public List<Product> add(List<Integer> ID) {
        if (isID(ID) == false) {
            throw new WrongIDExeption();
        }
        Map<Integer, String> store = new Storebase().getStorebase();
        List<Product> prod = new ArrayList<Product>();
        for (Integer id : ID) {
            for (Integer a : store.keySet()) {
                if (id.equals(a)) {
                    Product i = new Product(id, store.get(a));
                    prod.add(i);

                }
            }
        }
        return prod;
    }

    public boolean isID(List<Integer> ID) {
        int a = 0;
        Map<Integer, String> store = new Storebase().getStorebase();
        for (Integer id : ID) {
            for (Integer b : store.keySet()) {
                if (id.equals(b)) {
                    a++;
                }
            }
        }
        if (a == ID.size()) {
            return true;
        } else {
            return false;
        }
    }

}
