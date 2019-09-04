/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
    static int[][] board;
    static char[] temp;
    static int i,j;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }
    }
}
