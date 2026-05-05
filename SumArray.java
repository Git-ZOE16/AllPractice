public class SumArray{
    public static void main(String[] args){
    
 int[] sumHolder = {2,4,6,8};
 
 System.out.println(sumOfArray(sumHolder));
 
    }
public static int sumOfArray(int[] sumHolder){

   int sum = 0;
     
    
    for (int count = 0; count < sumHolder.length; count++){
    //sum+= sumHolder[count];
    sum = sum + sumHolder[count];
    } 
   return sum;

}
    
}
