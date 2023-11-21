package org.pages;

import org.data.entities.Employee;
import org.apache.tapestry5.annotations.Property;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {

//    @Component(id = "home", parameters = {"page=Index"})
//    private PageLink index;
//    @Property
//    private List<Employee> employees;

    @Property
    private Employee employee;

    public List<Employee> getEmployees() {

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Employee emp = new Employee();
            emp.setName("name" + i);
            emp.setId(i);
            emp.setCity("city" + i);
            emp.setAge(i+20);
            employeeList.add(emp);
        }

        return employeeList;

    }

}
