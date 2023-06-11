# Exp-10-Write-a-program-to-print-details-of-an-employee...

## AIM:

To write a java program to print the salary of an employee.

## ALGORITHM:

### Step 1:

Import the necessary packages.

### Step 2:

Create a Class named 'Member' which has data members.

### Step 3:

Add a method printSalary to print the salary in that class.

### Step 4:

Create two other classes 'Employee' and 'Manager' which inherits 'Member' class.

### Step 5:

Assign details to an employee and a manager by making an object of both of these classes.

### Step 6:

Print the result.

### Step 7:

End the program.

## PROGRAM:

```java

Name   : Anto Richard. S
Reg No : 212221240005

```

```java

public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    public Member(String name, int age, String phoneNumber, String address,
                  double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    public void printSalary() {
        System.out.println("Salary :" + salary);
    }
}

public class Employee extends Member {
    private String specialization;
    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

public class Manager extends Member{
    private String department;
    public Manager(String name, int age, String phoneNumber,
                   String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

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

```

## OUTPUT:

![10e](https://github.com/anto-richard/Exp-10-Write-a-program-to-print-details-of-an-employee-/assets/93427534/478dbaa8-c87e-4592-9c0c-b965185bab2e)

## RESULT:

Thus, the java program to print the salary of an employee is executted successfully.

