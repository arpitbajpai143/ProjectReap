package com.reap.dao;

import java.util.List;

import com.reap.model.Employee;
import com.reap.model.GivingBadges;
import com.reap.model.RecievedBadges;
import com.reap.model.RecognizeKarma;

public interface IEmployeeDao {

	public boolean register(Employee emp);

	public Employee login(String email, String Password);

	public Employee getEmployeeInfo(String employeeId);

	public GivingBadges getGivingKittyInfo(int givBadgeId);

	public RecievedBadges getRecievedKittyInfo(int recBadgeId);
	
	public RecievedBadges getRecievedKittyInfo(String employeeId);
	
	public Employee findEmployee(String name);

	public void updateRecievedBadges(String employeeId, String star);

	public void updateGivingBadges(String employeeId, String star);

	public List<Employee> employeeList();

	public List<RecievedBadges> getNewerBoardEmployees();

	String generateEmployeeId();

	public List<Employee> getEmployeeSearchResults();

	String findEmployeeName(int Id);

	String findEmployeeName(String employeeId);

	public List<RecognizeKarma> getRecognizeKarmaValues();
	
	public List<RecognizeKarma> getRecievedRecognizeKarmaValues(String employeeId);
	
	public List<RecognizeKarma> getGivenRecognizeKarmaValues(String employeeId);

}
