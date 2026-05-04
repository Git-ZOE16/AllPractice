public class MaxiNumberInArray{
public static void main(String[] args){

int[] numbers = {9, 5, 22, 11};

int Maximum = numbers[0];

for(int value = 1; value < numbers.lenght; value++){
    if (numbers[0] > Maximum){
    

Maximum= numbers[value];

 System.out.println("Maximum: " +Maximum);
}
}
}
}
