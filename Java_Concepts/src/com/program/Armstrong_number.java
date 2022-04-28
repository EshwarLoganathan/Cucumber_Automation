package com.program;

public class Armstrong_number {


public static void main(String[]args){

int a = 370;
int temp = a;
int rem = 0;
int value = 0;

while(temp>0)
{
rem = temp%10;
value =value+( rem*rem*rem);
temp=temp/10;
}
if(a==value)
{
System.out.println("The number is Armstrong");
}
else
{
System.out.println("The number is not a Armstrong");
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
