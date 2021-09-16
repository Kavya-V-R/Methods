package com.xworkz.methods;

public class Phone {
	public static void call() {
		System.out.println("call-Phone call done");
	}

	public static void message() {
		System.out.println("message-Message sent");

	}

	public static void alarm() {
		System.out.println("Alarm-Alarm set");
	}

	public static void playstore() {
		System.out.println("playstore-App installed");
	}

	public static void googleMeet() {
		System.out.println("google meet-Joined to class");
	}

	public static void main(String[] args) {
		Phone.call();
		Phone.message();
		Phone.alarm();
		Phone.playstore();
		Phone.googleMeet();
	}
}
