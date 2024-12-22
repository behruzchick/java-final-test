public class Staff extends Person{
    String school;
    double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Staff [" +
                "school='" + school +
                ", pay=" + pay +
                ']';
    }
}
