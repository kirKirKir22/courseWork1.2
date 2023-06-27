public class Storage {

    private Employee[] employees;

    public Storage() {
        employees = new Employee[10];

        employees[0] = new Employee(" Иванов", "Иван", "Иванович ", 1, 100);
        employees[1] = new Employee(" Ивашка", "Вадим", "Иванович", 2, 200);
        employees[2] = new Employee(" Ивановиков", "Степан", "Иванович ", 3, 300);
        employees[3] = new Employee(" Иванус", "Матвей", "Иванович ", 4, 400);
        employees[4] = new Employee(" Иванидзе", "Вахтанг", "Иванович ", 5, 500);
        employees[5] = new Employee(" Иванянян", "Ашот", "Иванович ", 1, 600);
        employees[6] = new Employee(" Иванель", "Антуан", "Иванович ", 2, 700);
        employees[7] = new Employee(" Иванко", "Фома", "Иванович ", 3, 800);
        employees[8] = new Employee(" Иванович", "Татьяна", "Ивановна ", 4, 900);
        employees[9] = new Employee(" Ивановская", "Ася", "Ивановна ", 5, 1000);
    }

    public void printInformationForAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

    public void printFio() {
        for (Employee employee : employees) {
            System.out.println(employee.toStringFio());

        }

    }

    public float findTotalMonthlySalary() {
        float sum = 0;
        for (Employee value : employees) {
            sum += value.getSalary();
        }
        return sum;
    }


    public float findTheAverageSalary() {
        return findTotalMonthlySalary() / employees.length;
    }

    public Employee findEmployeeMaxSalary() {
        Employee richEmpl = employees[0];
        for (Employee employee : employees) {
            if (richEmpl.getSalary() < employee.getSalary()) {
                richEmpl = employee;
            }

        }
        return richEmpl;
    }

    public Employee findEmployeeMinSalary() {
        Employee poorEmpl = employees[0];
        for (Employee employee : employees) {
            if (poorEmpl.getSalary() > employee.getSalary()) {
                poorEmpl = employee;
            }

        }
        return poorEmpl;
    }


}
