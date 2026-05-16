import java.util.Arrays;
public class ArrayFunctions{

    public static void main (String [] args){
    
    int [] scores = {3, 5, 2, 1, 7, 8};
    
    System.out.println("Number of even scores is " + taskOne(scores));
    System.out.println("Number of odd scores is " + taskTwo(scores));
    System.out.println("Sum of even scores is " + taskThree(scores));
    System.out.println("Sum of odd scores is " + taskFour(scores));
    System.out.println("The even scores are " + Arrays.toString(taskFive(scores)));
    System.out.println("The odd scores are " + Arrays.toString(taskSix(scores)));
    System.out.println("The average of even numbers is " + taskSeven(scores));
    System.out.println("The average of even numbers is " + taskEight(scores));
    System.out.printf("The average of scores is %.2f%n", taskNine(scores));
    System.out.println("The even index scores are " + Arrays.toString(taskTen(scores)));
    System.out.println("The odd index scores are " + Arrays.toString(taskEleven(scores)));

    System.out.println("The reverse of the scores is " + Arrays.toString(taskThirteen(scores)));
    System.out.println("The scores are " + Arrays.toString(scores));
    System.out.println("The reverse of the scores is " + Arrays.toString(taskTwelve(scores)));
    System.out.println("The maximum is :" + maximum(scores));

} 
   
  public static int taskOne(int [] scores){
  
    int noOfEvenScores = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 == 0){
            noOfEvenScores++;
        }
    }
    
    return noOfEvenScores;
  }
  
  public static int taskTwo(int [] scores){
  
    int noOfOddScores = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 != 0){
            noOfOddScores++;
        }
    }
    
    return noOfOddScores;
  }
  
  public static int taskThree(int [] scores){
  
    int evenSum = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 == 0){
            evenSum += scores[index];
        }
    }
    
    return evenSum;
  }
  
  public static int taskFour(int [] scores){
  
    int oddSum = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 != 0){
            oddSum += scores[index];
        }
    }
    
    return oddSum;
  }
  
  public static int [] taskFive(int [] scores){
  
    int [] newEvenScores = new int [taskOne(scores)];
    
    int count = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 == 0){
            newEvenScores[count] = scores[index];
            count++;
        }
    }
    
    return newEvenScores;
  
  }
  
  public static int [] taskSix(int [] scores){
  
    int [] newOddScores = new int [taskTwo(scores)];
    
    int count = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (scores[index] % 2 != 0){
            newOddScores[count] = scores[index];
            count++;
        }
    }
    
    return newOddScores;
  
  }
  
  public static double taskSeven(int [] scores){
  
    double sum = taskThree(scores);
    
    return sum/taskOne(scores);
  
  }
  
  public static double taskEight(int [] scores){
  
    double sum = taskFour(scores);
    
    return sum/taskTwo(scores);
  
  }
  
  public static double taskNine(int [] scores){
  
    double sum = taskFour(scores) + taskThree(scores);
    
    return sum/scores.length;
  
  }
  
  public static int [] taskTen(int [] scores){
  
    int noOfEvenIndex = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (index % 2 == 0){
            noOfEvenIndex++;
        }
    }
    
    int [] evenIndexScores = new int [noOfEvenIndex];
    
    int count = 0;
    for (int index = 0; index < scores.length; index++){
    
        if (index % 2 == 0){
        
            evenIndexScores[count] = scores[index];
            count++;
        }    
    }
    
    return evenIndexScores;
  
  }
  
  public static int [] taskEleven(int [] scores){
  
    int noOfOddIndex = 0;
    
    for (int index = 0; index < scores.length; index++){
        if (index % 2 != 0){
            noOfOddIndex++;
        }
    }
    
    int [] oddIndexScores = new int [noOfOddIndex];
    
    int count = 0;
    for (int index = 0; index < scores.length; index++){
    
        if (index % 2 != 0){
        
            oddIndexScores[count] = scores[index];
            count++;
        }    
    }
    
    return oddIndexScores;
  
  }
  
  public static int [] taskTwelve(int [] scores){
  
    for (int index = 0; index < scores.length/2; index++){
        int tempNumber = scores[index];
        scores[index] = scores[scores.length - 1 - index];
        scores[scores.length - 1 - index] = tempNumber;    
    }
    
    return scores;
  
  }
  
  public static int [] taskThirteen(int [] scores){
  
    int [] newScores = new int [scores.length];
  
    for (int index = 0; index < scores.length; index++){
        newScores[index] = scores[scores.length - 1 - index];
    }
    
    return newScores;
  
  }

    public static int maximum(int [] scores){

        int maximum = Integer.MIN_VALUE;
        
        for (int count : scores ){

            if(count > maximum )
                    maximum = count;


        }

        return maximum;



        }
    

}
