package Singleton.aliExample;

public class Demo {
	
	public static void main(String[] args) {
		OrderManagementService orderManagService1 = OrderManagementService.getInstance();
		OrderManagementService orderManagService2 = OrderManagementService.getInstance();
		
//		var orderManagService3 = new OrderManagementService();
		
		System.out.println(orderManagService1 == orderManagService2);
		orderManagService1.placeOrder();
	}

}
