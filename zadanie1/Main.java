public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("джефри", 344);
        Employee employee2 = new Employee("джефрик крутой", 999);
        Employee employee3 = new Employee("флойд", 1111);
        HRManager HR = new HRManager("васян");
        System.out.println("изменение зарплаты у рабочих: ");
        HR.applySalaryChange(employee);
        HR.applySalaryChange(employee2);
        HR.applySalaryChange(employee3);
        System.out.println(employee.getStatus() + ". " + employee2.getStatus() + ". " + employee3.getStatus());
    }
}