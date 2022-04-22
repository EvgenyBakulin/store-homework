package pro.sky.storehomework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ControllerBasket {
    public final StoreService storeService;

    public ControllerBasket(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping("/get")
    public List getBasket() {
        return storeService.getList();
    }
    @GetMapping("/add{ID}")
    public List<Product> addProduct(@RequestParam(value = "ID") List<Integer> ID) {return storeService.add(ID);
    }
}
