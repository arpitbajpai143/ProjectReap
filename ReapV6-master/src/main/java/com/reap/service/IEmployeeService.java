package com.reap.service;

import java.util.List;

import com.reap.dao.util.NewerBoard;
import com.reap.dao.util.RecognizeKarmaCopy;
import com.reap.model.Employee;
import com.reap.model.GivingBadges;
import com.reap.model.RecievedBadges;
import com.reap.model.RecognizeKarma;

public interface IEmployeeService {
	
	public boolean register(Employee emp);

	public Employee login(String email, String Password);

	public Employee getEmployeeInfo(String employeeId);

	public GivingBadges getGivingKittyInfo(int givBadgeId);

	public RecievedBadges getRecievedKittyInfo(int recBadgeId);
	
	public RecievedBadges getRecievedKittyInfo(String employeeId);

	public List<Employee> getEmployeeSearchResults();

	public void updateRecievedBadges(String employeeId, String star);

	public List<Employee> employeeList();

	public List<RecievedBadges> getNewerBoardEmployees();

	List<RecognizeKarmaCopy> getEmplList();

	public List<NewerBoard> getNewerList();

	public List<RecognizeKarmaCopy> getAllBadges(String employeeId);
	
	public List<RecognizeKarmaCopy> getRecievedRecognizeKarmaValues(String employeeId);
	
	public List<RecognizeKarmaCopy> getGivenRecognizeKarmaValues(String employeeId);
}
