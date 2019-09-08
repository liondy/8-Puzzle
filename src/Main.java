/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        State s = new State(board);
        s.compute(s, null);
        while(!s.frontier.isEmpty()){
            State curr = s.frontier.remove();
            s.moveUp(curr);
            s.printState(curr);
//            s.moveDown(curr);
//            s.printState(s);
//            s.moveLeft(curr);
//            s.moveRight(curr);
        }
    }
}
