package sky.pro.spring_basket.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import sky.pro.spring_basket.domain.Basket;

import java.util.Set;

@Service
public class StoreServiceImp implements StoreService {
    private final Basket basket;

    public StoreServiceImp(@Qualifier("beanBasket") Basket beanBasket) {
        this.basket = beanBasket;
    }

    @Override
    public void addProducts(Integer... products) {
        for (int product :products) {
            basket.getBasket().add(product);
        }
    }

    @Override
    public Set<Integer> getBasket() {
        return basket.getBasket();
    }
}
