package com.gl.departments;

import java.util.Scanner;

import com.gl.departments.model.Employee;
import com.gl.departments.service.CredentialsService;
import com.gl.departments.service.impl.CredentialsServiceImpl;

public class TestApplication {

	private static CredentialsService credentialsService = new CredentialsServiceImpl();
	private static final String COMPANY_NAME = "GL";
	private static Employee employee = null;
	private static String dept = null;

	public static void main(String[] args) {
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			employee = new Employee("harshit", "choudhary");
			dept = "tech";
			credentialsService.showCredentials(employee,
					credentialsService.generateEmailAddress(employee, COMPANY_NAME, dept),
					credentialsService.generatePassword());
			break;

		case 2:
			employee = new Employee("harshit", "choudhary");
			dept = "admin";
			credentialsService.showCredentials(employee,
					credentialsService.generateEmailAddress(employee, COMPANY_NAME, dept),
					credentialsService.generatePassword());
			break;

		case 3:
			employee = new Employee("harshit", "choudhary");
			dept = "hr";
			credentialsService.showCredentials(employee,
					credentialsService.generateEmailAddress(employee, COMPANY_NAME, dept),
					credentialsService.generatePassword());
			break;

		case 4:
			employee = new Employee("harshit", "choudhary");
			dept = "legal";
			credentialsService.showCredentials(employee,
					credentialsService.generateEmailAddress(employee, COMPANY_NAME, dept),
					credentialsService.generatePassword());
			break;

		default:
			System.out.println("Invalid Input received");
		}

		scanner.close();
	}

}
