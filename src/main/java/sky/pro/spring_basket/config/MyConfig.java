package sky.pro.spring_basket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.spring_basket.domain.Basket;

@Configuration
public class MyConfig {
    @Bean
    @SessionScope
    public Basket beanBasket() {
        return new Basket();
    }
}
