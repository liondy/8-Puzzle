
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FRISKA
 */
public class AStar {

    PriorityQueue<State> frontier = new PriorityQueue();
    Map<String, Integer> explored = new HashMap<String, Integer>();
    Map<State, State> memo = new HashMap<State, State>();
    Stack<State> result = new Stack();

    private int getManhattanDistance(String state) {
        int distance = 0;
        for (int i = 0; i < 9; i++) {
            distance += Math.abs(i - (state.charAt(i) - 1));
        }
        return distance;
    }

    public void compute(State newState, State oldState) {
        String nextState = newState.board;
        if (!explored.containsKey(nextState)) {
            int val;
            if (oldState == null) {
                val = 0;
            } else {
                val = explored.get(oldState.board) + 1;
            }
            explored.put(nextState, val);
            frontier.add(newState);
            memo.put(newState, oldState);
        }
    }

    public void moveUp(State oldState) {
        String state = oldState.board;
        int a = state.indexOf("0");
        if (a > 2) {
            String nextState = state.substring(0, a - 3) + "0" + state.substring(a - 2, a) + state.charAt(a - 3) + state.substring(a + 1);
            int d = getManhattanDistance(nextState);
            State newState = new State(nextState, d);
            isGoal(oldState, newState);
        }
    }

    public void moveDown(State oldState) {
        String state = oldState.board;
        int a = state.indexOf("0");
        if (a < 6) {
            String nextState = state.substring(0, a) + state.substring(a + 3, a + 4) + state.substring(a + 1, a + 3) + "0" + state.substring(a + 4);
            int d = getManhattanDistance(nextState);
            State newState = new State(nextState, d);
            isGoal(oldState, newState);
        }
    }

    public void moveLeft(State oldState) {
        String state = oldState.board;
        int a = state.indexOf("0");
        if (a != 0 && a != 3 && a != 6) {
            String nextState = state.substring(0, a - 1) + "0" + state.charAt(a - 1) + state.substring(a + 1);
            int d = getManhattanDistance(nextState);
            State newState = new State(nextState, d);
            isGoal(oldState, newState);
        }
    }

    public void moveRight(State oldState) {
        String state = oldState.board;
        int a = state.indexOf("0");
        if (a != 2 && a != 5 && a != 8) {
            String nextState = state.substring(0, a) + state.charAt(a + 1) + "0" + state.substring(a + 2);
            int d = getManhattanDistance(nextState);
            State newState = new State(nextState, d);
            isGoal(oldState, newState);
        }
    }

    private void isGoal(State oldState, State newState) {
        compute(newState, oldState);
        if (newState.board.equals("123456780")) {
            int total = explored.get(newState.board);
            System.out.println("Solution found after " + total + " steps");
            State trace = newState;
            while (trace != null) {
                result.add(trace);
                trace = memo.get(trace);
            }
            backtrack(total);
            System.exit(0);
        }
    }

    private void backtrack(int steps) {
        int i = 0;
        while (!result.isEmpty()) {
            System.out.print("Step: " + i);
            if (i == 0) {
                System.out.println(" (Initial State)");
            } else if (i == steps) {
                System.out.println(" (Goal State)");
            } else {
                System.out.println();
            }
            printState(result.pop());
            i++;
        }
    }

    private void printState(State state) {
        String s = state.board;
        int i = 0;
        while (i != s.length()) {
            if (i == 3 || i == 6) {
                System.out.println();
            }
            System.out.print(s.charAt(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println();
    }
}
