public class Staff {
    private String name;
    private String birthDate;

    private int staffId;



    public Staff(){

    }

    public Staff(String name, String birthDate, int staffId) {
        this.name = name;
        this.birthDate = birthDate;
        this.staffId = staffId;
    }

    public int getAge(){
        int currentYear = 2023;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public  double collectPay(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }
}
