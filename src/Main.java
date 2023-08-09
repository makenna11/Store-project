public class Main {
    public static void main(String[] args) {
        Staff tim = new Staff("Tim", "11/11/2000", 9001);
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Manager manager = new Manager("dollar", "12/12/1990 ", 9002,"email@gmail.com");
        System.out.println(manager);
        System.out.println("Manager's Pay = " + manager.collectPay());
        System.out.println("Manager Age = " + manager.getAge());
        manager.hire();

        Cashier cashier = new Cashier("timmy", "11/11/1999", 9203, "timmy@gmail.com",50);
        System.out.println(cashier);
        cashier.receipt("Rice");
        System.out.println("Cashier's Age = "+ cashier.getAge());
        System.out.println("Cashier's Pay = " + cashier.collectPay());


        Customer seyi = new Customer("timmy");
        seyi.purchases("RICE");


        Product rice = new Product("Rice", 500);
        System.out.println(rice);
        System.out.println(rice.getProductName() + "'s price is " + rice.getPrice());


    }
}
