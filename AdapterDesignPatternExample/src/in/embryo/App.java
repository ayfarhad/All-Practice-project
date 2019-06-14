package in.embryo;

public class App {

	public static void main(String[] args) {
		CustomerAdapter customerAdapter = new CustomerAdapter(new CourierImpl());
		customerAdapter.displayCustomerName();
	}
}
