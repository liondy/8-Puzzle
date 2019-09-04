/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class State {
    int[][] board;
    int[][] goalState = {{1,2,3},{4,5,6},{7,8,0}};
    
    //initial state
    public State(int[][] board){
        this.board = board;
    }
    
    //make frontier based on the empty tile location (x,y)
    public State[] makeFrontier(State state){
        int i,j,k,x=0,y=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(state.board[i][j]==0){
                    x=i;
                    y=j;
                }
            }
        }
        State[] arrayFrontier;
        int[][] newBoard = new int[3][3];
        if((x==0&&(y==0||y==2))||(x==2&&(y==0||y==2))){
            arrayFrontier = new State[2];
            if(x==0&&y==0){
                
            }
        }
        else if(((x==0||x==2)&&y==1)||(x==1&&(y==0||y==2))){
            arrayFrontier = new State[3];
        }
        else{
            arrayFrontier = new State[4];
        }
        for (i = 0; i < arrayFrontier.length; i++) {
            for(j=0;j<3;j++){
                for(k=0;k<3;k++){
                    
                }
            }
        }
        return arrayFrontier;
    }
    
//    public State move(State state, int x,int y){
//        state.board
//        if(x==0&&y==0){
//            
//        }
//    }
    
    //check if the state is the goal state
    public boolean isGoal(){
        int i,j;
        boolean same=true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if(this.board[i][j]!=this.goalState[i][j]){
                    same=false;
                }
            }
        }
        return same;
    }
}
