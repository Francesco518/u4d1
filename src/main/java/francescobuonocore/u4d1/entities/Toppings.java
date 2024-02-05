package francescobuonocore.u4d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Toppings  {
    private String name;
    private int calories;
    private double price;
    private List<Toppings> toppings;

    public Toppings(String name) {
        this.name = name;
    }
    public Toppings(String name, List<Toppings> toppings) {
this.name = name;
        this.toppings = toppings;
    }

    public Toppings(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
