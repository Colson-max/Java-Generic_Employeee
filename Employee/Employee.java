package Employee;

public class Employee {
    private String name;
    private double sa1;
    private MyDate birthday;

    public Employee(String name, double sa1, MyDate birthday){
        this.name = name;
        this.sa1 = sa1;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sa1=" + sa1 +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSa1() {
        return sa1;
    }

    public void setSa1(double sa1) {
        this.sa1 = sa1;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
