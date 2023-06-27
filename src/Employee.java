public class Employee {

    private String name;
    private String lastName;
    private String patronymic;
    private int department;
    private float salary;
    private static int counter = 1;
    private int id;

    public Employee(String lastName, String name, String patronymic, int department, float salary) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИO сотрудника: " + lastName + " "
                + name + " " + patronymic + " " + " отдел: "
                + department + " зарплата: " + salary + " ID : " + id;
    }

    public String toStringFio() {
        return lastName + " " + name + " " + patronymic;

    }

}
