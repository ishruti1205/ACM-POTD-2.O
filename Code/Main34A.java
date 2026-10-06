/*
Link: https://codeforces.com/problemset/problem/34/A
*/

import java.util.Scanner;

public class Main34A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        if (n < 2 || n > 100) {
            sc.close();
            return;
        }

        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        sc.close();

        int minDiff = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(heights[i] - heights[i + 1]);

            if (diff < minDiff) {
                minDiff = diff;
                index1 = i;
                index2 = i + 1;
            }
        }

        int diff = Math.abs(heights[n - 1] - heights[0]);

        if (diff < minDiff) {
            index1 = n - 1;
            index2 = 0;
        }
        
        System.out.println((index1 + 1) + " " + (index2 + 1));
    }

}

/* 
Input 1:
5
10 12 13 15 10

Output 1:
5 1

Input 2:
4
10 20 30 40

Output 2:
1 2
*/