import java.util.Scanner;

public class Solution {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);


        final char[] S = sc.nextLine().toCharArray();
        final int K = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < S.length; ++i) {
            char c = S[i];
            if (c >= 'A' && c <= 'Z') {
                final int v = c - 'A';
                c = (char) ((v + K) % 26 + 'A');
            } else if (c >= 'a' && c <= 'z') {
                final int v = c - 'a';
                c = (char) ((v + K) % 26 + 'a');
            }
            System.out.print(c);
        }
        //System.out.println();
    }
}