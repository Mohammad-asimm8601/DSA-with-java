package string.question;

import java.util.Scanner;

public class WatersBottle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numBottles = sc.nextInt();
            int numExchange = sc.nextInt();
            System.out.println(numWaterBottles(numBottles, numExchange));
        }
    }
    public static int numWaterBottles(int numBottles, int numExchange){
        int full = numBottles;
        int empty = numBottles;
        while(empty >= numExchange){
            int getfull = empty/numExchange;
            empty  = empty % numExchange;
            empty +=getfull;
            full += getfull;
        }
        return full;
    }
}
