package EmployeeManagementTask;

import java.util.Scanner;

public class AdminPage extends ManageInfo {
	static boolean flag = true;

	void controllingFlow() {
		System.out.println(
				" \n" + "press (1) for Registering Employee Information.\n" + "press (2) for search employee by name.\n"
						+ "press (3) for viewing all data.\n" + "Press (4) for Exiting Application.");
		System.out.print("Press Any Key : ");
		Scanner sc = new Scanner(System.in);
		byte choice = sc.nextByte();
		System.out.println(" ");

		switch (choice) {
		case 1:
			managingData();
			break;
		case 2:
			searchByName();
			break;
		case 3:
			displayAll();
			break;
		case 4:
			flag = false;
			System.out.println("Application Exited Successfully.");
		}
	}

	public static void main(String[] args) {
		try {
			AdminPage admin = new AdminPage();
			System.out.println("OHO Software Solution.");
			while (flag) {
				admin.controllingFlow();
			}
		} catch (Exception e) {
			System.err.println("     Application Exited Forcefully.     ");
		}
	}
}
