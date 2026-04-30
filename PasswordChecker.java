import java.util.Scanner;

public class PasswordChecker{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String password = "secret123";

System.out.println("Enter a password");
String userInput = input.nextLine();

if (userInput.equals(password)){

System.out.println("Access granted! ");
}
else{ System.out.println("Access denied");

}

}

}
