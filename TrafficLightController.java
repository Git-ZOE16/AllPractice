import java.util.Scanner;
public class TrafficLightController{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

String lightBox = "green";

System.out.println("Enter a Color");
String userInput = input.nextLine();

if (userInput.equals("green")){
System.out.println("Go!");
}

else if (userInput.equals("red")){
System.out.println("Stop!");
}

else if (userInput.equals("yellow")){
System.out.println("Wait!");
}
else{ System.out.println("Invalid Color!");
}

}

}


