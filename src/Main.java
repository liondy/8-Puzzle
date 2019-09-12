
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Input your board:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initialState = "";
        for (int i = 0; i < 3; i++) {
            initialState += br.readLine();
        }
        initialState = initialState.replace(" ", "");
        System.out.println("Input Algorithm: 0 = BFS, 1 = A*");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Searching for solution...");
        if(x==0){
            BFS s = new BFS();
            s.compute(initialState,null);
            while(!s.frontier.isEmpty()){
                String curr = s.frontier.remove();
                s.moveUp(curr);
                s.moveDown(curr);
                s.moveLeft(curr);
                s.moveRight(curr);
            }
        }
        else if(x==1){
            AStar a = new AStar();
            State s = new State(initialState,0);
            a.compute(s, null);
            while(!a.frontier.isEmpty()){
                State curr = a.frontier.remove();
                a.moveUp(curr);
                a.moveDown(curr);
                a.moveLeft(curr);
                a.moveRight(curr);
            }
        }
        else{
            System.out.println("No Algorithm was found");
        }
    }
}
