package com.bridgelabs;
import java.util.Scanner;

public class Patient {
	private String Name;
	private String Age;
	private String PhoneNumber;
	private String City;
	private String State;
	Department Department;
	
	public enum Department{
		ONCOLOGY, NEUROLOGY, CARDIOLOGY, GYNOCOLOGY;
	}
	
	Scanner Scanner = new Scanner(System.in);
	 
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		this.Age = age;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	
	public void chooseDepartment() {
		System.out.println("Choose Department:\n1.ONCOLOGY \n2.NEUROLOGY \n3.CARDIOLOGY \n4.GYNOCOLOGY ");
        byte option = Scanner.nextByte();
        switch (option) {
            case 1:
                if (option == 1) {
                    System.out.println(this.Department = Department.ONCOLOGY);
                } else if (option == 2) {
                    System.out.println(this.Department = Department.NEUROLOGY);
                } else if (option == 3) {
                    System.out.println(this.Department = Department.CARDIOLOGY);
                } else if (option == 4) {
                    System.out.println(this.Department = Department.GYNOCOLOGY);
                } else {
                    System.out.println("Select Valid Option");
                    chooseDepartment();
                }	
        }
	}
	@Override 
	public String toString() {
		return "Patient{" +
				"Name: " + Name + '\'' +
				"Age: " + Age + '\'' +
				"PhoneNumber: " + PhoneNumber + '\'' +
				"City: " + City + '\'' + 
				"State: " + State + '\'' +
				'}';
	}
	 
}
