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
public class BFS {
    State initialState;
    
    public BFS(State init){
        this.initialState = init;
    }
    
    public PriorityQueue compute(){
        PriorityQueue<State> frontier = new PriorityQueue<>();
        frontier.add(this.initialState);
        PriorityQueue<State> explored = new PriorityQueue<>();
        explored.add(this.initialState);
        while(!frontier.isEmpty()){
            State cur = frontier.poll();
            if(cur.isGoal()){
                break;
            }
            else{
                State[] s = cur.makeFrontier(cur);
                for (int i = 0; i < s.length; i++) {
                    frontier.add(s[i]);
                }
            }
            explored.add(cur);
        }
        return explored;
    }
    
    public void print(){
        
    }
}
