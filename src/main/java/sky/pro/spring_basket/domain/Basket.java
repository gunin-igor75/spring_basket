package sky.pro.spring_basket.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class Basket {
    private final Set<Integer> baskets = new HashSet<>();

    public Basket() {
    }

    public Set<Integer> getBasket() {
        return baskets;
    }
}
