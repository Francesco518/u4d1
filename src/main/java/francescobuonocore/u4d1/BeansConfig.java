package francescobuonocore.u4d1;

import francescobuonocore.u4d1.entities.Drinks;
import francescobuonocore.u4d1.entities.Menu;
import francescobuonocore.u4d1.entities.Pizzas;
import francescobuonocore.u4d1.entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {
@Bean
    public Pizzas margheritaPizza() {
    List<Toppings> margheritaToppings = Arrays.asList(new Toppings("Tomato", 18, 1.5), new Toppings("Mozzarella", 280, 5.65));
    return new Pizzas("Margherita", margheritaToppings);
}
@Bean
    public Pizzas hamAndFries() {
    List<Toppings> hamAndFriesToppings = Arrays.asList(new Toppings("Tomato",18, 1.50 ), new Toppings("Mozzarella", 280,5.65 ), new Toppings("Ham", 35, 0.99), new Toppings("Fries", 22, 0.69));
    return new Pizzas("Ham and Fries Pizza", hamAndFriesToppings);
}
@Bean
    public Pizzas salamiPizza() {
    List<Toppings> salamiToppings = Arrays.asList(new Toppings("Tomato", 18, 1.5), new Toppings("Mozzarella", 280, 5.65), new Toppings("Salami", 86, 0.99));
    return new Pizzas("Salami Pizza", salamiToppings);
}
@Bean
public Toppings tomato() {
    return new Toppings("Tomato", 18, 1.5);
}
    @Bean
    public Toppings mozzarella() {
        return new Toppings("Mozzarella", 280, 5.65);
    }
    @Bean
    public Toppings ham() {
        return new Toppings("Ham", 35, 0.99);
    }
    @Bean
    public Toppings fries() {
        return new Toppings("Fries", 22, 0.69);
    }
    @Bean
    public Toppings salami() {
        return new Toppings("Salami", 86, 0.99);
    }
@Bean
    public Drinks lemonade() {
    return new Drinks("Lemonade", 0.33, 128, 1.29);
}
    @Bean
    public Drinks water() {
        return new Drinks("Water", 0.5, 0, 1.29);
    }
    @Bean
    public Drinks wine() {
        return new Drinks("Wine", 0.75, 13, 128, 1.29);
    }
@Bean
    public Menu menu(List<Pizzas> pizzas, List<Toppings> toppings, List<Drinks> drinks) {
    return new Menu(pizzas, toppings, drinks);
    }

}

