package sky.pro.spring_basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.spring_basket.service.StoreService;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService basketService;

    public StoreController(StoreService basketService) {
        this.basketService = basketService;
    }
    @GetMapping("/add")
    public void addProducts(@RequestParam(value = "products", required = false) Integer... products) {
        basketService.addProducts(products);
    }
    @GetMapping("/get")
    public Set<Integer> getBasket() {
        return basketService.getBasket();
    }
}
