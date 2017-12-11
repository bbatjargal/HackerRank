import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            list.add(scan.nextInt());
        }
        Collections.sort(list);     
        int[] lower;
        int[] upper;
        int[] arr = list.stream().mapToInt(i->i).toArray();
        int nm = n/2;
        lower = new int[nm];
        upper = new int[nm];
        if(n%2 == 0) {
            System.arraycopy(arr, nm , upper, 0, nm);
        }else{  
            System.arraycopy(arr, nm+1, upper, 0, nm);           
        }
        System.arraycopy(arr, 0, lower, 0, nm);
        
        System.out.println(findQuartiles(lower));
        System.out.println(findQuartiles(arr));
        System.out.println(findQuartiles(upper));
    }
    
    public static int findQuartiles(int[] arr){
        int median;
        int n = arr.length;
        if(n%2 == 0) {
            median = (arr[n/2 - 1] + arr[n/2]) / 2;            
        }else{
            median = arr[n/2];
        }
        return median;
    }
}
