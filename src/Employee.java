public class Employee {

    private String name;
    private int id;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + salary + "\n";
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * percentage / 100;
        } else {
            System.out.println("Percentage must be greater than zero.");
        }
    }
}
