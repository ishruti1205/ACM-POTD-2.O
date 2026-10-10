/*
Link: https://codeforces.com/problemset/problem/50/A
*/

import java.util.Scanner;

public class Main50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println((m * n) / 2);

        sc.close();
    }
}

/*
Input 1:
2 4

Output 1:
4

Input 2:
3 3

Output 2:
4
*/