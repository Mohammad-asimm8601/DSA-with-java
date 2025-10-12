package BinarySearch.Question;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = mySqrt(x);
        System.out.println(res);
    }

    public static int mySqrt(int x) {
        int lo = 0, hi = x;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x/mid)
                hi = mid - 1;
            else
                lo = mid + 1;

        }
        return hi;
    }
}
