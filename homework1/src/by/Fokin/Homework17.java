package by.Fokin;

import java.util.Scanner;

public class Homework17 {

    public static void main(String[] args) {

        int m, h = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во строк и столбцов квадратной матрицы(Ввести значение больше 2): ");
        int n = scan.nextInt();
        while(n < 3) {
            System.out.println("Введите корректное значение: ");
            n = scan.nextInt();
        }
        int mt[][] = new int[n][n];
        if(n % 2 == 0) {
            m = (n / 2) - 1;
            for(int p = m; p < (m + 2); p += 1) {
                for (int j = 0; j < n; j += 1) {
                    mt[j][p] = 1;
                }
            }
            for(int i = 0; i < m; i += 1) {
                for(int j = h; j < m; j += 1) {
                    mt[i][j] = 1;
                }
                h += 1;
            }
            h = 0;
            for(int i = n - 1; i > m; i -= 1) {
                for(int j = h; j < m; j += 1) {
                    mt[i][j] = 1;
                }
                h += 1;
            }
            h = n - 1;
            for(int i = 0; i < m; i += 1) {
                for(int j = h; j > m; j -= 1) {
                    mt[i][j] = 1;
                }
                h -= 1;
            }
            h = n - 1;
            for(int i = n - 1; i > m; i -= 1) {
                for(int j = h; j > m; j -= 1) {
                    mt[i][j] = 1;
                }
                h -= 1;
            }
            for(int i = 0; i < n; i += 1) {
                System.out.println();
                for(int j = 0; j < n; j += 1) {
                    System.out.print(mt[i][j] + " ");
                }
            }
        }
        if(n % 2 != 0) {
            m = n / 2;
            for(int j = 0; j < n; j += 1) {
                mt[j][m] = 1;
            }
            for(int i = 0; i < m; i += 1) {
                for(int j = h; j < m; j += 1) {
                    mt[i][j] = 1;
                }
                h += 1;
            }
            h = 0;
            for(int i = n - 1; i > m; i -= 1) {
                for(int j = h; j < m; j += 1) {
                    mt[i][j] = 1;
                }
                h += 1;
            }
            h = n - 1;
            for(int i = 0; i < m; i += 1) {
                for(int j = h; j > m; j -= 1) {
                    mt[i][j] = 1;
                }
                h -= 1;
            }
            h = n - 1;
            for(int i = n - 1; i > m; i -= 1) {
                for(int j = h; j > m; j -= 1) {
                    mt[i][j] = 1;
                }
                h -= 1;
            }
            for(int i = 0; i < n; i += 1) {
                System.out.println();
                for(int j = 0; j < n; j += 1) {
                    System.out.print(mt[i][j] + " ");
                }
            }
        }
    }
}
