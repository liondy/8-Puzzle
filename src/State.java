/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liondy
 */
public class State implements Comparable<State> {
    int distance;
    String board;
    
    public State(String board,int distance){
        this.board = board;
        this.distance = distance;
    }
    
    @Override
    public int compareTo(State s){
        return (s.distance < this.distance)?1:-1;
    }
}
