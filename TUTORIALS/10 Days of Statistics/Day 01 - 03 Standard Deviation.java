import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        double total = 0;
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
            total += arr[i];
        }
        double mean = total/n;
        total  = 0.0;
        for(int i = 0; i < n; i++){
            total += Math.pow(arr[i] - mean, 2);
        }
        System.out.printf("%.1f", Math.sqrt(total/n));
    }
}
