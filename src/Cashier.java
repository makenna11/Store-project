public class Cashier extends Manager{
    final double hourlyPayRate;

    public Cashier(String name, String birthDate, int staffId, String email, double hourlyPayRate) {
        super(name, birthDate, staffId, email);
        this.hourlyPayRate = hourlyPayRate;
    }
    public void receipt(String sale){
        System.out.println("cashier sold goods to Customer " + sale + " And Despenses Receipt");
    }



    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
