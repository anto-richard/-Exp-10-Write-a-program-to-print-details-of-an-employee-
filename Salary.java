public class Salary {
    public static void main(String[] args) {
        Employee employee = new Employee("Swee", 19, "6483998337", "Valasaravakkam",
                100000, "AI&ML");
        Manager manager = new Manager("Sam", 36, "6483998733", "Egmore",
                80000, "IT");

        //Employee Salary
        employee.printSalary();
        //Manager Salary
        manager.printSalary();
    }
}