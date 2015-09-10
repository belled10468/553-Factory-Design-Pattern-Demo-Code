package creator;

import product.Sushi;
import utility.Location;
import utility.SushiType;
import concreteProduct.EelRollWithAvocado;
import concreteProduct.EelRollWithNoAvocado;
import concreteProduct.SalmonSushiWithNoWasabi;
import concreteProduct.SalmonSushiWithWasabi;

public class SushiShopWithSimpleFactory {
	public Sushi orderSushi(int tableNum, SushiType sushiOrder, Location loc) {

		System.out.printf("Table %d makes an order of %s\n", tableNum,
				sushiOrder.name());

		return makeSushi(loc, sushiOrder);

	}

	protected Sushi makeSushi(Location loc, SushiType sushiOrder) {
		switch (loc) {
		case JAPAN:
			switch (sushiOrder) {
			case SALMON:
				return new SalmonSushiWithWasabi();

			case ROLL:
				return new EelRollWithNoAvocado();
			}
			break;
		case USA:
			switch (sushiOrder) {
			case SALMON:
				return new SalmonSushiWithNoWasabi();

			case ROLL:
				return new EelRollWithAvocado();
			}
			break;
		}
		return null;
	};
}