package com.xworkz.methods;

public class SimpleInterest {
	public static float simpleInterest(float p, float t, float r) {
		float SI = (p * t * r) / 100;
		return SI;
	}

	public static void main(String[] args) {
		float p = 13000f;
		float t = 2;
		float r = 12;
		float simInt = SimpleInterest.simpleInterest(p, t, r);
		System.out.println("simple interest " + simInt);
	}
}
