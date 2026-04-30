import java.util.Scanner;
public class FavoritePet{

public static void main(String[] args){
Scanner petBox = new Scanner(System.in);


System.out.println("Select your Favorite pet ");
String pet = petBox.nextLine();

if(pet.equals("dog")){

System.out.println("woof!, Dogs are awesome! ");
}
else{
System.out.println("Cool choice, but i love dogs!");  
}
}
}

