package pro.sky.storehomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerBasket {
    public final Basket basket;

    public ControllerBasket(Basket basket) {
        this.basket = basket;
    }

    @GetMapping("/get")
    public List<Product> getBasket() {
        return basket.getBasket();
    }

    @GetMapping("/add{ID}")
    public List<Product> addProduct(@RequestParam(value = "ID") List<Integer> ID) {
        return basket.add(ID);
    }
}
