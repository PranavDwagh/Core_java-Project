package Inheritance;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;



public class User3 {
		
	public static void main(String[] args) {
		System.out.println("Enter No elements of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Patient [] patient = new Patient[n];
 		
		populatePatient(patient, sc);
		
		showPatient(patient);
		
		GregorianCalendar obj = new GregorianCalendar();
		
		patientBelow18(patient, obj);
		 
	}

	private static void patientBelow18(Patient[] patient, GregorianCalendar obj) {
			
		System.out.println("Patient having age less than 18 are");
		for (int i=0; i<patient.length;i++)
		{
			if (obj.get(Calendar.YEAR)-patient[i].getDob().getYear()<18)
			{
				System.out.println(patient[i]);
			}
		}
		
	}

	private static void showPatient(Patient[] patient) {

		for (int i=0; i<patient.length;i++)
		{
			System.out.println(patient[i]);
		}
		
	}

	private static void populatePatient(Patient[] patient, Scanner sc) {
		for (int i=0; i<patient.length;i++)
		{
		System.out.println("Enter Name of patient");
		String name = sc.next();

		System.out.println("Enter Date of Birth");
		System.out.println("Enter date: ");
		int d = sc.nextInt();
		System.out.println("Enter Month:");
		int m = sc.nextInt();
		System.out.println("Enter year of Birth:");
		int y = sc.nextInt();
		Date date = new Date (d, m, y);
		sc.nextLine();
		System.out.println("Enter Brief description of disease: ");
		 String disease = sc.nextLine();
		
		 patient[i] = new Patient(name, date, disease);
		 
		}
		
	}
	
	
}
