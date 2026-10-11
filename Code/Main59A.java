/*
Link: https://codeforces.com/problemset/problem/59/A
*/

import java.util.Scanner;

public class Main59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else {
                lower++;
            }
        }

        if (upper > lower) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }

        sc.close();
    }
}

/*
Input 1:
HoUse

Output 1:
house

Input 2:
ViP

Output 2:
VIP

Input 3:
maTRIx

Output 3:
matrix
*/