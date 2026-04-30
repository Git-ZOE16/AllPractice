import java.util.Scanner;
public class FavoriteNumber{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

int favoriteNumber = 7;

System.out.println("Guess a number");
int userInput = input.nextInt();

if(userInput == 7){

System.out.println("That's my favorite number!");
}
else{
System.out.println("Nice try, guess again!");

}

}
}
