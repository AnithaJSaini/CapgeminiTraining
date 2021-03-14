package j1;

public class OrderOutofStockException extends Exception {
	int unitsOrdered;
	public OrderOutofStockException(int unitOrdered) {
		this.unitsOrdered = unitOrdered;
	}

	
	public String toString()
	{
		return "OrderOutofStockException :- "+unitsOrdered;
	}
	


}
