package recursion;

public class FunctionCalls {
    public static void apple(){
        System.out.println("I am in apple");
    }
    public static void main(String[] args) {
        System.out.println("I am in main method");
        apple();  // call 
    }
}
