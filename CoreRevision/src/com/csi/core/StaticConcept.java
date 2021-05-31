package com.csi.core;
public class StaticConcept {
	public static void main(String[] args) {
		StaticConcept s1 = new StaticConcept();
		System.out.println("WELCOME");
		s1.get();
		set();
	}
	void get() {
		System.out.println("INDIA");
	}
	static {
		System.out.println("REACT JS");
	}
	static void set() {
		System.out.println("INSPIRIA MALL");
	}
	static {
		System.out.println("CSI PUNE");
	}
}
