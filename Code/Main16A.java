/*
Link: https://codeforces.com/problemset/problem/16/A
*/

import java.util.Scanner;

public class Main16A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] flag = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            String row = sc.next();

            for (int j = 0; j < m; j++) {
                flag[i][j] = row.charAt(j) - '0';
            }
        }

        sc.close();

        boolean sameRowColor = checkSameRowColor(flag);
        boolean sameAdjacentRowColor = checkAdjacentRowColor(flag);

        boolean result = sameRowColor && sameAdjacentRowColor;

        if (result) System.out.println("YES");
        else System.out.println("NO");
        
    }

    public static boolean checkSameRowColor(int[][] flag){
       for (int[] row : flag) {
            int firstColor = row[0];
              
            for (int color : row) {  
                if (color != firstColor) return false;
            }
        }

        return true;
    }

    public static boolean checkAdjacentRowColor(int[][] flag){
       for (int i = 0; i < flag.length - 1; i++) {  
            if (flag[i][0] == flag[i+1][0]) return false;
        }

        return true;
    }
}

/* 
Input 1:
3 3
000
111
222

Output 1:
YES

Input 2:
3 3
000
000
111

Output 2:
NO

Input 3:
3 3
000
111
002

Output 3:
NO
*/