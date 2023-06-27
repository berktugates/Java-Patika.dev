
public class FactoryEmployee {
    public static void main(String[] args) {
        // added object and methods
        Employee e = new Employee("Berke",1200,45,2008);
        e.employeeInfo();
        e.tax();
        e.employeeInfo();
        e.bonus();
        e.employeeInfo();
        e.raiseSalary();
        e.employeeInfo();
    }
}