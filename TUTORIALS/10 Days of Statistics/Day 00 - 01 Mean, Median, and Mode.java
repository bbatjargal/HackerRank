import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
        int temp;
        double total = 0.0;
        for(int i=0; i<n; i++){
            temp = scan.nextInt();
            total += temp;
            if(maps.containsKey(temp))
                maps.put(temp, maps.get(temp) + 1);
            else 
                maps.put(temp, 1);
            nums.add(temp);
        }
        
        double mean = total / n;
        
        double median = 0.0;        
        Collections.sort(nums);
        temp = n % 2;
        if(temp == 0)
            median = (nums.get(n/2-1) + nums.get(n/2)) * 1.0 / 2;
        else
            median = nums.get(n/2);            
        
        
        int mode = -1;      
        int nm =0;
        
        for(int key : maps.keySet()){
            temp = maps.get(key);
            if(nm < temp) {
                nm = temp;  
                mode = key;
            } else if(nm == temp && mode > key){
                mode = key;
            }
        }
        
        System.out.println(String.format("%.1f", mean));
        System.out.println(String.format("%.1f", median));
        System.out.println(mode);
        
    }
}
