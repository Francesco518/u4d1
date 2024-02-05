package francescobuonocore.u4d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizzas {
    private String name;
    private List<Toppings> toppings;
    private int calories;
    private double price;

    public Pizzas(String name, List<Toppings> toppings) {
        this.name = name;
        this.toppings = toppings;

    }
    public Pizzas(String name, List<Toppings> toppings, int calories, double price) {
        this.name = name;
        this.toppings = toppings;
        this.calories = calories;
        this.price = price;
    }



    public String getName() {
        return this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "name='" + name + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
