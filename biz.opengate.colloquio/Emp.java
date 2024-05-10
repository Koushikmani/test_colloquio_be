package biz.opengate.colloquio;

import java.util.ArrayList;
import java.util.List;

public class Emp {
    public static void main(String[] args) {
        // Instantiate a List using ArrayList implementation and populate it with 4-5 elements of type Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000.0));
        employees.add(new Employee(2, "Alice", 60000.0));
        employees.add(new Employee(3, "Bob", 55000.0));
        employees.add(new Employee(4, "Mary", 52000.0));
        employees.add(new Employee(5, "David", 53000.0));

        // Sort the list on the name field alphabetically
        employees.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        // Print the value of the sorted list in the console
        System.out.println("Sorted List:");
        employees.forEach(System.out::println);

        // Remove the Employee with a specific id from the populated list
        int idToRemove = 3;
        employees.removeIf(emp -> emp.getId() == idToRemove);

        // Remove the Employee with a specific name from the populated list
        String nameToRemove = "David";
        employees.removeIf(emp -> emp.getName().equals(nameToRemove));

        // Print the value of the filtered list in the console
        System.out.println("Filtered List:");
        employees.forEach(System.out::println);

        // Use java streams to extract from the list all the Employees whose name contains the "A" character and print the value of the filtered list in the console
        List<Employee> filteredList = employees.stream()
                .filter(emp -> emp.getName().contains("A"))
                .toList();

        // Print the value of the filtered list in the console
        System.out.println("Employees whose name contains 'A':");
        filteredList.forEach(System.out::println);
    }
}

class Employee {
    private int id;
    private String name;
    private Double salary;

    // Constructor
    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Equals and HashCode based on name
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}