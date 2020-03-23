package by.Fokin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, m, q, x1, x2, y1, y2, st = 0;
        String u;
        n = scan.nextInt();
        m = scan.nextInt();
        String mt[][] = new String[n][m];
        for(int i = 0; i < n; i += 1) {
            for(int j = 0; j < m; j += 1) {
                mt[i][j] = scan.nextLine();
            }
        }
        q = scan.nextInt();
        for(int k = 0; k < q; k += 1) {
            x1 = scan.nextInt();
            x1 -= 1;
            y1 = scan.nextInt();
            y1 -= 1;
            x2 = scan.nextInt();
            x2 -= 1;
            y2 = scan.nextInt();
            y2 -= 1;
            int p = x1;
            x1 = y1;
            y1 = p;
            p = x2;
            x2 = y2;
            y2 = p;
            if(y1 == y2) {
                if(mt[x1][y1].equals(mt[x2][y2])) {
                    u = mt[x1][y1];
                    if(x1 < x2) {
                        for (int i = (x1 + 1); i < x2; i += 1) {
                            if (mt[i][y1].equals(u)) {
                                st += 1;
                            }
                        }
                    } else {
                        for (int i = (x1 - 1); i > x2; i -= 1) {
                            if (mt[i][y1].equals(u)) {
                                st += 1;
                            }
                        }
                    }
                }
                if(st > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                st = 0;
            }
            if(x1 == x2) {
                if(mt[x1][y1].equals(mt[x2][y2])) {
                    u = mt[x1][x2];
                    if(y1 < y2) {
                        for (int j = (y1 + 1); j < y2; j += 1) {
                            if (mt[x1][j].equals(u)) {
                                st += 1;
                            }
                        }
                    } else {
                        for (int j = (y1 - 1); j > y2; j -= 1) {
                            if (mt[x1][j].equals(u)) {
                                st += 1;
                            }
                        }
                    }
                }
                if(st > 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                st = 0;
            }
            if(x1 != x2 && y1 != y2) {
                System.out.println("No");
            }
        }
    }
}