package concreteProduct;

import product.Sushi;

public class SalmonSushiWithNoWasabi implements Sushi{

	@Override
	public String getProperties() {
		// TODO Auto-generated method stub
		return "(Salmon||Wasabi||Rice)";
	}

}
