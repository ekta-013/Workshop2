package com.bridgelabs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
	String hospitalName;
	static HashMap<String, Hospital> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	ArrayList<Patient> list = new ArrayList<>();
	
	 public Hospital(String hospitalName) {
	        this.hospitalName = hospitalName;
	}
	 static Hospital createNewHospital(String hospitalName) {
	        Hospital hospital = new Hospital(hospitalName);
	        map.put(hospitalName, hospital);
	        return hospital;
	 }
	public <patient> patient getUserInput() {
		Patient person = new Patient();
		
		System.out.println("Enter Department");
		person.chooseDepartment();
		
		System.out.println("Enter Name: ");
		person.setName(sc.nextLine());
		
		System.out.println("Enter Age: ");
		person.setAge(sc.nextLine());
		
		System.out.println("Enter Phone number: ");
		person.setPhoneNumber(sc.nextLine());
		
		System.out.println("Enter City: ");
		person.setCity(sc.nextLine());
		
		System.out.println("Enter State: ");
		person.setState(sc.nextLine());
		
		return(patient) person;
	}
	public void addPatient() {
        Patient patient = getUserInput();
        list.add(patient);
        System.out.println(patient);
        System.out.println("Patient Updated Successfully");
		
	}
}
