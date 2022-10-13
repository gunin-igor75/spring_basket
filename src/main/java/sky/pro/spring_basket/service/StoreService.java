package sky.pro.spring_basket.service;

import java.util.Set;

public interface StoreService {
    void addProducts(Integer ... products);

    Set<Integer> getBasket();
}
