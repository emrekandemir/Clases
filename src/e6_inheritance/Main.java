package e6_inheritance;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(); // Customer class'ını çağırdık
        Employee employee = new Employee();

        customer.age = 12;
        System.out.println(customer.age);

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.bestEmployee();
    }
}
