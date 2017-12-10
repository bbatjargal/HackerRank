import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        double total = 0.0;
        int sumWeight = 0;
        int temp;
        for(int i =0; i < n; i++){
            x[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            temp = scan.nextInt();
            total += x[i] * temp;
            sumWeight += temp;
        }
        System.out.printf("%.1f", total/sumWeight);        
    }
}
