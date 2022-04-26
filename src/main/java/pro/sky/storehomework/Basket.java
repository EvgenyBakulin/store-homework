package pro.sky.storehomework;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Product> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public List<Product> add(List<Integer> ID) {
        StoreServiceImpl s = new StoreServiceImpl();
        for (Product i : s.add(ID)) {
            basket.add(i);
        }
        return s.add(ID);
    }

    public List<Product> getBasket() {
        return basket;
    }
}
