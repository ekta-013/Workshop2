package com.bridgelabs;
import java.util.Scanner;

public class HospitalMain {
	public static void main(String[] args) {
	System.out.println("Enter name of the hospital");
	Scanner scanner = new Scanner(System.in);
	Hospital hospital = Hospital.createNewHospital(scanner.next());
	boolean Terminate = false; 
	 while (!Terminate) {
         System.out.println("\nHospitalList: " + Hospital.map.keySet());
         System.out.println("Select option :\n1.create New Hospital \n2.Add patient");
         int option = scanner.nextInt();
         switch (option) {
             case 1:
                 System.out.println("Enter Hospital Name");
                 hospital = Hospital.createNewHospital(scanner.next());
                 break;
             case 2:
                 System.out.println("Enter add patient");
                 hospital.addPatient();
                 break;
         }
	}
}
}
