package concreteCreator;

import concreteProduct.EelRollWithAvocado;
import concreteProduct.SalmonSushiWithNoWasabi;
import product.Sushi;
import utility.SushiType;
import creator.SushiShop;

public class AmericanSushiShop extends SushiShop{

	@Override
	protected Sushi makeSushi(SushiType sushiOrder) {
		// TODO Auto-generated method stub
		switch(sushiOrder){
		case SALMON:
			return  new SalmonSushiWithNoWasabi();
			
		case ROLL:
			return new EelRollWithAvocado();
		}
		return null;
	}

}
