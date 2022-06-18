package com.gl.departments.service.impl;

import java.util.Random;

import com.gl.departments.model.Employee;
import com.gl.departments.service.CredentialsService;

public class CredentialsServiceImpl implements CredentialsService {

	@Override
	public String generatePassword() {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[8];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < 8; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee employee, String companyName, String dept) {
		return employee.getFirstName() + employee.getLastName() + "@" + dept + "." + companyName + ".com";
	}

	@Override
	public void showCredentials(Employee employee, String emailAddress, String password) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ----> " + emailAddress);
		System.out.println("Password ----> " + password);
	}

}
