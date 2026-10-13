/*
Link: https://codeforces.com/problemset/problem/112/A
*/

import java.util.Scanner;

public class Main112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        int result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}

/*
Input 1:
aaaa
aaaA

Output 1:
0

Input 2:
abs
Abz

Output 2:
-1

Input 3:
abcdefg
AbCdEfF

Output 3:
1
*/