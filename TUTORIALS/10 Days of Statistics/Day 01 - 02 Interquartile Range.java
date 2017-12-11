import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] elements = new int[n];
        int[] frequencys= new int[n];
        for(int i = 0; i < n; i++){
            elements[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            frequencys[i] = scan.nextInt();
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < n; i++)
            for(int j=0; j< frequencys[i]; j++)
                list.add(elements[i]);
            
        Collections.sort(list);
        int[] arr = list.stream().mapToInt(i->i).toArray();
        int nm = arr.length/2;
        int[] lower = new int[nm];
        int[] upper = new int[nm];
        if(n%2 == 0){
            System.arraycopy(arr, nm, upper, 0, nm);
        }else{
            System.arraycopy(arr, nm+1, upper, 0, nm);
        }
        System.arraycopy(arr, 0, lower, 0, nm);
        double q1 = findQuartiles(lower);
        double q3 = findQuartiles(upper);
        System.out.println(q3-q1);
    }
    public static double findQuartiles(int[] arr){
        double median;
        int n = arr.length;
        if(n%2 == 0){
            median = (arr[n/2-1] + arr[n/2]) / 2;
        }else{
            median = arr[n/2];
        }
        return median;
    }
}
