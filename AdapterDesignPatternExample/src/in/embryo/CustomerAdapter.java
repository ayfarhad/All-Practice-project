package in.embryo;

public class CustomerAdapter implements Customer{

	private Courier courier;
	
	public CustomerAdapter(Courier courier) {
		this.courier = courier;
	}

	@Override
	public void displayCustomerName() {
		System.out.println("Customer name in adapter");	
		courier.cost();
	}

	@Override
	public void displayCustomerAddress() {
	System.out.println("Address in adapter");
	}
	
	
}
