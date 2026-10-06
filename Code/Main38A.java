/*
Link: https://codeforces.com/problemset/problem/38/A
*/

import java.util.Scanner;

public class Main38A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n < 2 || n > 100 ) {
            sc.close();
            return;
        }

        int[] d = new int[n - 1];

        for (int i = 0; i < d.length; i++){
            d[i] = sc.nextInt();

            if (d[i] < 1 || d[i] > 100 ) {
                sc.close();
                return;
            }
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < 1 || a >= b || b > n ) {
            sc.close();
            return;
        }

        sc.close();

        int year = 0;
        for(int i = a - 1; i < b - 1; i++){
            year += d[i];
        }

        System.out.println(year);
        
    }

}

/* 
Input 1:
3
5 6
1 2

Output 1:
5

Input 2:
3
5 6
1 3

Output 2:
11
*/