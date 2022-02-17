package Entities;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order.toString());
		
		OrderStatus orderStatus = OrderStatus.DELIVERED;
		OrderStatus orderStatusString = OrderStatus.valueOf("DELIVERED");
	}

}
