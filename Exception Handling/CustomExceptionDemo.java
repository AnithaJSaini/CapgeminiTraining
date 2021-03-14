package j1;

import java.util.Scanner;

public class CustomExceptionDemo {
public static void main(String[] args) {
		
		
		Inventory inventory1 = new Inventory("Laptop",100);
		
		System.out.println(" Enter the Order units:");
		int order = new Scanner(System.in).nextInt(); // 50
		
		OrderService service = new OrderService(inventory1);
		boolean status = false;
		try {
			status = service.placeOrder(order);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		if(status)
		{
			System.out.println(" Check Order Summery ");
		}
		else
		{
			System.out.println(" --- contact customer care ...");
		}
		
		
		
		
		
	}//end main

}
