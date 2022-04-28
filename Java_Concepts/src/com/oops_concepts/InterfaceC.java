package com.oops_concepts;

public interface InterfaceC extends InterfaceA, InterfaceB {
	
	@Override
	default void building() {
		System.out.println("Accenture");
		
	}

}
