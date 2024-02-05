package francescobuonocore.u4d1;

import francescobuonocore.u4d1.entities.Drinks;
import francescobuonocore.u4d1.entities.Menu;
import francescobuonocore.u4d1.entities.Pizzas;
import francescobuonocore.u4d1.entities.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;

@SpringBootApplication
public class U4d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U4d1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U4d1Application.class);

	    Menu menu = ctx.getBean(Menu.class);

		System.out.println("Pizzas: ");
		for (Pizzas pizza : menu.getPizzas()) {
			System.out.println("° " + pizza);
		}
		System.out.println("Toppings: ");
		for (Toppings topping : menu.getToppings()){
			System.out.println("° " + topping);
		}
		System.out.println("Drinks: ");
		for (Drinks drink : menu.getDrinks()) {
			System.out.println("° " + drink);
		}
	}

}
