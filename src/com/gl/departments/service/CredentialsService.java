package com.gl.departments.service;

import com.gl.departments.model.Employee;

public interface CredentialsService {

	public String generatePassword();

	public String generateEmailAddress(Employee employee, String companyName, String dept);

	public void showCredentials(Employee employee, String emailAddress, String password);

}
