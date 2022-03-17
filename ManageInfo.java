package EmployeeManagementTask;

import java.util.*;

public class ManageInfo {
	private ArrayList<DetailsHolder> array = new ArrayList<>();

	void managingData() {
		Scanner scanner = new Scanner(System.in);

		DetailsHolder data = new DetailsHolder();
		System.out.print("Employee Id : ");
		data.setEmpId(scanner.nextLine());

		System.out.print("Employee Name : ");
		data.setEmpName(scanner.nextLine());

		System.out.print("Employee Department : ");
		data.setEmpDept(scanner.nextLine());

		System.out.print("Employee's Contact Number : ");
		data.setContactNum(scanner.nextLine());
		
		System.out.println(" ");
		array.add(data);
		System.out.print("Enter (1) if need to add more Data orelse Press any key.\n" + "Press Any key : ");
		byte choice = scanner.nextByte();
		
		if (choice == 1) {
			managingData();
		} else {
			System.out.println("Previous Data is stored successfully!\n proceed for next process.\n");
		}
	}

	void display(DetailsHolder data) {
		System.out.println("Employee Id             : " + data.getEmpId());
		System.out.println("Employee Name           : " + data.getEmpName());
		System.out.println("Employee Department     : " + data.getEmpDept());
		System.out.println("Employee Contact Number : " + data.getContactNum());
	}

	void displayAll() {
		for (DetailsHolder employee : array) {
			System.out.println("Employee Id             : " + employee.getEmpId());
			System.out.println("Employee Name           : " + employee.getEmpName());
			System.out.println("Employee Department     : " + employee.getEmpDept());
			System.out.println("Employee Contact Number : " + employee.getContactNum());
			System.out.println(" ");
		}
	}

	void searchByName() {
		System.out.print("Enter the Name to Search : ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		for (DetailsHolder employee : array) {
			if (employee.getEmpName().equalsIgnoreCase(name)) {
				display(employee);
			}
		}
	}
}
