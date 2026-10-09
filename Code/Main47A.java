/*
Link: https://codeforces.com/problemset/problem/47/A
*/

import java.util.Scanner;

public class Main47A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean found = false;

        for (int i = 1; i <= n; i++) {
            int triangular = i * (i + 1) / 2;

            if (triangular == n) {
                found = true;
                break;
            }

            if (triangular > n) {
                break;
            }
        }

        System.out.println(found ? "YES" : "NO");

        sc.close();
    }
}

/*
Input 1:
1

Output 1:
YES

Input 2:
2

Output 2:
NO

Input 1:
3

Output 1:
YES
*/