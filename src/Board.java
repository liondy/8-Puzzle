/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;
/**
 *
 * @author FRISKA
 */
public class Board {
    private int m;
    private int[][] tile;
    
    public Board(int[][] tile){
        this.m = tile[0].length;
        this.tile = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                this.tile[i][j] = tile[i][j];
            }
        }
    }
    public int dimensi(){
        return m;
    }
    public int missplaced(){
        int miss = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (tile[i][j] == 0){
                    continue;
                }
                if (tile[i][j] != i * m + j + 1){
                    miss++;
                }
            }
        }
        return miss;
    }
//    public int manhattan(){
//        int sum = 0;
//        for (int i = 0; i < m * m; i++) {
//            if (board[i] != i + 1 && board[i] != 0)
//                sum += manhattan2 (board[i],i);
//        }
//        return sum;
//    }
//    public int manhattan2 (int goal, int curr){
//        int row = Math.abs((goal - 1) / m - curr / m);
//        int col = Math.abs((goal - 1) % m - curr % m);
//        return row + col;
//    }
    public boolean isGoal(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (tile[i][j] != i * m + j + 1 && (i != m - 1 && j != m - 1)){
                    return false;
                }
            }
        }
        return true;
    }
}
