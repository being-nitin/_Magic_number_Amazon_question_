package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
     find nth magic number
     1 = 001 = 1*5^1 + 0*5^2 + 0*5^3 = 5
     2 = 010 = 25
     3 = 011 = 30
     4 = 100 = 125
     5 = 101 = 130
     And so on so the approach will be multiply every bit with the the consecutive powers of 5
     and do the right shift so that move the left side.
	 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans+= last*base;
            base = base*5;
        }
        System.out.println(ans);
    }
}
