public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.printInformationForAllEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + storage.findTotalMonthlySalary());
        System.out.println("Сотрудник с минимальной зарплатой: " + storage.findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + storage.findEmployeeMaxSalary());
        System.out.println("Среднее занчение зарплаты: " + storage.findTheAverageSalary());
        storage.printFio();

    }
}