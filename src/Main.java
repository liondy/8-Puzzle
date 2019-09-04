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
        if(s.isGoal()){
            System.out.println("Puzzle Solved");
        }
        else{
            PriorityQueue<State> pq = new PriorityQueue<>();
            s.setParent(null); //the root of the tree
            pq.add(s);
        }
    }
}
