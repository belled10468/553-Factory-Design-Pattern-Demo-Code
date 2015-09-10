package utility;

import product.Sushi;
import concreteCreator.AmericanSushiShop;
import concreteCreator.JapaneseSushiShop;
import creator.SushiShop;

public class FoodStreet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SushiShop s1 = new JapaneseSushiShop();
		SushiShop s2 = new AmericanSushiShop();

		System.out
				.println("The first client comes to the Japanese Sushi shop and sits at table 1.");

		System.out.println("The client orders an eel roll");

		Sushi cient1OrderedSushi = s1.orderSushi(1, SushiType.ROLL);

		System.out.printf("The client eats %s.\n Yummy!\n",
				cient1OrderedSushi.getProperties());

		System.out.println("Fifteen minutes later...");

		System.out
				.println("The second client comes to the Japanese Sushi shop and sits at table 1.");

		System.out.println("The client orders an eel roll");

		Sushi cient2OrderedSushi = s2.orderSushi(1, SushiType.ROLL);

		System.out.printf("The client eats %s.\n Oishi!\n",
				cient2OrderedSushi.getProperties());

	}

}
