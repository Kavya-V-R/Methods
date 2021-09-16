package com.xworkz.methods;

public class AC {
	public static void on() {
		System.out.println("AC swithced ON ");
	}

	public static void off() {
		System.out.println("AC swithced OFF");
	}

	public static void increaseTemp() {
		System.out.println("temperature of AC is increased");
	}

	public static void decreaseTemp() {
		System.out.println("temperature of AC is decreased");
	}

	public static void main(String[] args) {
		AC.on();
		AC.off();
		AC.increaseTemp();
		AC.decreaseTemp();
	}
}
