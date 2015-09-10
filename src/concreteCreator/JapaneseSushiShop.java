package concreteCreator;

import product.Sushi;
import utility.SushiType;
import concreteProduct.EelRollWithNoAvocado;
import concreteProduct.SalmonSushiWithWasabi;
import creator.SushiShop;

public class JapaneseSushiShop extends SushiShop {

	@Override
	protected Sushi makeSushi(SushiType sushiOrder) {
		// TODO Auto-generated method stub
		switch(sushiOrder){
		case SALMON:
			return  new SalmonSushiWithWasabi();
			
		case ROLL:
			return new EelRollWithNoAvocado();
		}
		return null;
	}
}
