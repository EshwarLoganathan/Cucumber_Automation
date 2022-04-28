package com.oops_concepts;

interface One {

	int a = 10; // public, static and final
}

interface Two {

	int b = 20; // public, static and final
}

interface Three extends One, Two {

	void sum(); // public and abstract
}

class NormalClass implements Three {

	@Override
	public void sum() {
		System.out.println("Addition : " + (a + b));

	}
}

public class InheritanceSample3 {

	public static void main(String[] args) {

		NormalClass obj = new NormalClass();

		obj.sum();

	}
}
