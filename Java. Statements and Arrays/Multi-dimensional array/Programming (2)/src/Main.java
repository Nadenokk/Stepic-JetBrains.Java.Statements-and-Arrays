import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int c = scan.nextInt();
        int[][] m = new int[s][c];
        int[][] t = new int[c][s];
        for (int i = 0; i < s; i++){
            for (int k = 0; k < c; k++) m[i][k] = scan.nextInt();
        }
        for (int i = 0; i < s; i++) for (int k = 0; k <c; k++) t[k][i] = m[i][k];
        for (int i = 0; i < c; i++){
            for (int k = 0; k < s; k++) System.out.print(t[i][k]+" ");
        }

    }
}