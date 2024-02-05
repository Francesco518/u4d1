package francescobuonocore.u4d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Drinks{

    private String name;
    private double quantity;
    private int calories;
    private double price;
    private int alcholPercentage;

public Drinks(String name, double quantity, int alcholPercentage, int calories, double price){
    this.name = name;
    this.quantity = quantity;
    this.alcholPercentage = alcholPercentage;
    this.calories = calories;
    this.price = price;
}

    public Drinks(String name,double quantity, int calories, double price) {
        this.name = name;
        this.quantity = quantity;
        this.calories = calories;
        this.price = price;
    }



}
