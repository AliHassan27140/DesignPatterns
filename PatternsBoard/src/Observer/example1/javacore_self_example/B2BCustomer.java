package Observer.example1.javacore_self_example;

public class B2BCustomer implements Observer {

	public B2BCustomer(OnlineStore onlineStore) {
		onlineStore.addListener(this);
	}

	public void update() {
		System.out.println("Goods arrived to the store. Make your B2B order now");
	}

}
