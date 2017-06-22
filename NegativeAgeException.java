package session6_assignment4;

public class NegativeAgeException extends RuntimeException{   //creating a class for custom exception

String msg; //msg read by user when the exception occurs


public NegativeAgeException(String msg){
this.msg = msg;
System.out.println(msg);//printing exception message
}

}

