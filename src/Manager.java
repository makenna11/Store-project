public class Manager extends Staff {

    final String email;

    public Manager(String name, String birthDate, int staffId, String email) {
        super(name, birthDate, staffId);
        this.email = email;
    }

    public void hire(){
        System.out.println("Manager Hired The Cashier");
    }
    public double collectPay(){
        return 600;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
}
