package com.megalunchbox.game.state;

import java.util.LinkedList;

public class State {

    private static LinkedList<States> states = new LinkedList<States>();

    private static States currentState;

    static {
        for(States state : States.values()) {
            states.add(state);
        }
    }

    public static LinkedList<States> getStates() {
        return states;
    }

    public static States getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(States currentState) {
        State.currentState = currentState;
    }

    public enum States {

        Menu("Menu", 0),
        Game("Main", 1);

        private String name;
        private int id;

        States(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

    }

}
