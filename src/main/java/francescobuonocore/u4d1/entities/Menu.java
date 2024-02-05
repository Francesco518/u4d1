package francescobuonocore.u4d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Menu {
    private List<Pizzas> pizzas;
    private List<Toppings> toppings;
    private List<Drinks> drinks;

    public Menu(List<Pizzas> pizzas, List<Toppings> toppings, List<Drinks> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizzas> getPizzas() {
        return pizzas;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }
}
