public class ClassExercise{

    public static void main (String[] args){ 
    
    int counter = 100;

        while (counter >= 1){

  if (counter % 2 == 0){
  System.out.println(counter + "." + " Even ");
  
  }
  
if (counter % 2 == 1){
  System.out.println(counter + "." + " Odd ");
  
  }
  
 if (counter % 4 == 0){
  System.out.println(counter + "." + " Hurray ");
  
 }
 
           counter--;
        }
    }
}
