

import session6_assignment4.NegativeAgeException;
import java.util.Scanner;

class Main  { 

public static void main(String args[]){

Scanner in = new Scanner(System.in);

System.out.println("Enter your age ");

int age = in.nextInt(); //taking input from the user

if(age < 0){
//handling custom exception
throw  new NegativeAgeException(" NegativeAgeException---Age cannot be negative");
}
else 
{
System.out.println("Your age is "+age);
}
}
}