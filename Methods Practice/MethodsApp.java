public class MethodsApp{
    public static String displayStudentBio(String firstName, String lastName, String department){
        result = """ my name is %s %s. I am in %s department.""".formatted(firstName, lastName, department);
    return result;

    }

    public static void main(String[] args){

    System.out.println(displayStudentBio("Oluyemi","Zoe","Computer Science"));


}

}



