import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, jumpCount = 0;
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        while(i<n-2){
            if(c[i+2] == 0){
                i += 2;
                jumpCount++;
            }else{
                i += 1;
                jumpCount++;
            }
        }
        if(i == n-2)
            jumpCount++;
        System.out.println(jumpCount);
    }
}
