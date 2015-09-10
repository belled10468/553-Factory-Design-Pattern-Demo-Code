package creator;

import product.Sushi;
import utility.SushiType;

public abstract class SushiShop {
	public Sushi orderSushi(int tableNum, SushiType sushiOrder){
		
		System.out.printf("Table %d makes an order of %s\n", tableNum, sushiOrder.name());
		
		return makeSushi(sushiOrder);
		
	}	
	
	//Factory Method
	protected abstract Sushi makeSushi(SushiType sushiOrder);
}