package arrays;
public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    //  pass by reference
    public static void change(int[] x) {
        x[0] = 90;
    }
}