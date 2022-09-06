package casestudy_module2.services.Impl;

import casestudy_module2.models.Employee;
import casestudy_module2.services.EmployeeService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập chức vụ: ");
        String position = scanner.nextLine();
        System.out.println("Nhập lương($): ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, address, position, salary);
        employeeList.add(employee);
        System.out.println("Đã thêm mới nhân viên thành công");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
