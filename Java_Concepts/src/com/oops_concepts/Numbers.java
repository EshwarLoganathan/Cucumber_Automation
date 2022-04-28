package com.oops_concepts;



public class Numbers implements Addition {

	@Override
	public void sum() {
		
		System.out.println("Addition : " + (a+b));
		
		
	}
	
	public static void main(String[] args) {
		
		
		Numbers obj = new Numbers();
		
		obj.sum();
	}

	
	
	


	
	


}
