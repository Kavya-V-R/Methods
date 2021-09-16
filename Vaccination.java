package com.xworkz.methods;

public class Vaccination {
	public static void downloadCertificate(long adharNumber) {
		System.out.println("certificate of Adhar Number " + adharNumber + " is downloaded ");
	}

	public static void main(String[] args) {
		Vaccination.downloadCertificate(380067009661l);
	}
}
