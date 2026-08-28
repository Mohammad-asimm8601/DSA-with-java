package recursion;

public class FuctionCalling {
    public static void main(String[] args) {
        asim(1);
    }
    public static void asim(int n){
        if (n==10) return;
        System.out.println("Simran");
        asim(n+1);
    }
}
