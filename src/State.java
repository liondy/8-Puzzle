/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
public class State implements Comparable<State> {
    Queue<State> frontier = new LinkedList<State>();
    Map<State,Integer> explored = new HashMap<State,Integer>();
    Map<State,State> memo = new HashMap<State,State>();
    int[][] board;
    int[][] goalState = {{1,2,3},{4,5,6},{7,8,0}};
    int point,x,y;
    
    //initial state
    public State(int[][] board){
        this.board = board;
        int i,j;
        for (i=0;i<3;i++) {
            for(j=0;j<3;j++){
                if(this.board[i][j]==0){
                    this.x=i;
                    this.y=j;
                }
            }
        }
    }
    
    public void compute(State newState, State oldState){
        if(!explored.containsKey(newState)){
            int val;
            if(oldState==null){
                val = 0;
            }
            else{
                val = explored.get(oldState)+1;
            }
            explored.put(newState,val);
            frontier.add(newState);
            memo.put(newState, oldState);
        }
    }
    
    public void moveUp(State state){
        if(state.x>0){
            State newState = new State(state.board);
            int temp = newState.board[x-1][y];
            newState.board[x-1][y]=0;
            newState.board[x][y]=temp;
            newState.x = x-1;
            newState.y = y;
            isGoal(state,newState);
        }
    }
    
    public void moveDown(State state){
        if(state.x<2){
            State newState = new State(state.board);
            int temp = newState.board[x+1][y];
            newState.board[x+1][y]=0;
            newState.board[x][y]=temp;
            newState.x = x+1;
            newState.y = y;
            isGoal(state,newState);
        }
    }
    
    public void moveLeft(State state){
        if(state.y>0){
            State newState = new State(state.board);
            int temp = newState.board[x][y-1];
            newState.board[x][y-1]=0;
            newState.board[x][y]=temp;
            newState.x = x;
            newState.y = y-1;
            isGoal(state,newState);
        }
    }
    
    public void moveRight(State state){
        if(state.y<2){
            State newState = new State(state.board);
            int temp = newState.board[x][y+1];
            newState.board[x][y+1]=0;
            newState.board[x][y]=temp;
            newState.x = x;
            newState.y = y;
            isGoal(state,newState);
        }
    }
    
    //check if the state is the goal state
    public void isGoal(State oldState, State newState){
        compute(newState,oldState);
        int i,j;
        boolean same=true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if(newState.board[i][j]!=this.goalState[i][j]){
                    same=false;
                }
            }
        }
        if(same){
            System.out.println("Solution found after "+explored.get(newState)+" steps");
            State trace = newState;
            while(trace!=null){
                printState(trace);
                trace = memo.get(trace);
            }
            System.exit(0);
        }
    }
    
    public void printState(State s){
        int i,j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(s.board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    @Override
    public int compareTo(State s){
        return Integer.compare(this.point, s.point);
    }
}
