// Given an integer numRows, return the first numRows of Pascals triangle.
package multidimensionarray.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            List<List<Integer>> ans = new ArrayList<>();
            
            for (int i = 0; i < n; i++) {
                List<Integer> l = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if(j==0 || j==i){
                        l.add(1);
                    }else{
                        l.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                    }
                
                } 
                ans.add(l);
            }
            System.out.println(ans);
        }
        
        
    }
}
