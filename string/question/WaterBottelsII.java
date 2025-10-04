package string.question;

import java.util.Scanner;

public class WaterBottelsII {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int fullBottles = sc.nextInt();
            int numExchange = sc.nextInt();
            int res = drunkBottles(fullBottles, numExchange);
            System.out.println(res);
        }
    }
    public static int drunkBottles(int fullBottles, int numExchange){
        int emptyBottles = fullBottles;
       
        while(emptyBottles >= numExchange){
            emptyBottles -=  numExchange++;
            fullBottles +=1;
            emptyBottles++;
        }
        return fullBottles;
    }
}
