package com.xworkz.methods;

public class TollGate {
	public static void openDoor() {
		System.out.println("Door opened");
	}

	public static void collectMoney() {
		System.out.println("Money collected");
	}

	public static void closeDoor() {
		System.out.println("Door closed");
	}

	public static void main(String[] args) {
		TollGate.openDoor();
		TollGate.collectMoney();
		TollGate.closeDoor();
	}
}
