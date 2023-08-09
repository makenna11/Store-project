public class Customer  {
    final String  customerName;

    public Customer(String customer) {
        this.customerName = customer;
    }

    public void purchases(String product){
        System.out.println("Customer purchases " + product);
    }
    public void receipt(){
        System.out.println("Dispenses receipt to " + customerName);
    }

}
