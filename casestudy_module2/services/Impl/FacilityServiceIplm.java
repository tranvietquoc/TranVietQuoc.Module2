package casestudy_module2.services.Impl;

import casestudy_module2.models.Facility;
import casestudy_module2.models.House;
import casestudy_module2.models.Room;
import casestudy_module2.models.Villa;
import casestudy_module2.services.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FacilityServiceIplm implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service" + element.getKey() + "Số lần đã thuê: "+ element.getValue());
        }
    }

    @Override
    public void displayMainTain() {
    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích(m2): ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập giá ($): ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số người tối đa: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê (long | short): ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập thời gian thuê (day): ");
        int rentTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập các tiện ích khác: ");
        String otherUtilities = scanner.nextLine();
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility, serviceName, area, price, maxPeople, rentType, rentTime,
        otherUtilities, amount);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Đã thêm mới villa thành công");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập giá: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số người tối đa: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập thời gian thuê: ");
        int rentTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập yêu cầu về nội thất: ");
        boolean fullyFurnished = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Nhập các tiện ích khác: ");
        String otherUtilities = scanner.nextLine();
        House house =  new House(idFacility, serviceName, area, price, maxPeople, rentType,
        rentTime, floor, fullyFurnished, otherUtilities);
        facilityIntegerMap.put(house, 0);
        System.out.println("Đã thêm mới house thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id: ");
        String idFacility = scanner.nextLine();
        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhập diện tích: ");
        float area = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập giá: ");
        float price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập số người tối đa: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê: ");
        String rentType = scanner.nextLine();
        System.out.println("Nhập thời gian thuê: ");
        int rentTime = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập dịch vụ tiện ích (massage, food&drink, ...): ");
        String covenientService = scanner.nextLine();
        Room room = new Room(idFacility, serviceName, area, price, maxPeople, rentType,
        rentTime, covenientService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Đã thêm mới room thành công");
    }
}
