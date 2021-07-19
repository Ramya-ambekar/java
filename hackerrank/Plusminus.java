import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr,int n) {
    // Write your code 
        int i=0;
        int pos=0;int neg=0;int z=0;
        for(i=0;i<n;i++){
            if(arr.get(i)>0){
                pos+=1;
            }
            else if(arr.get(i)<0){
                neg+=1;
            }
            else{
                z+=1;
              }
        
    }
        System.out.println(pos/(double)n);
        System.out.println(neg/(double)n); 
        System.out.println(z/(double)n);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr,n);

        bufferedReader.close();
    }
}
