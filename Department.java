package com.bridgelabs;

public enum Department {
	ONCOLOGY, 
	NEUROLOGY, 
	CARDIOLOGY, 
	GYNOCOLOGY;

public static void main(String[] args) {
	Department d1 = Department.ONCOLOGY;
	System.out.println(d1);
	Department d2 = Department.NEUROLOGY;
	System.out.println(d2);
	Department d3 = Department.CARDIOLOGY;
	System.out.println(d3);
	Department d4 = Department.GYNOCOLOGY;
	System.out.println(d4);
	}
}