package MovingBishop;

import java.util.ArrayList;

public class MovingBishop {

    static ArrayList<String> lightSpaces = new ArrayList<String>();
    static ArrayList<String> darkSpaces = new ArrayList<String>();

    public static void initializeChessBoard() {
        // Initializing light spaces
        lightSpaces.add("a2");
        lightSpaces.add("a4");
        lightSpaces.add("a6");
        lightSpaces.add("a8");
        lightSpaces.add("b1");
        lightSpaces.add("b3");
        lightSpaces.add("b5");
        lightSpaces.add("b7");
        lightSpaces.add("c2");
        lightSpaces.add("c4");
        lightSpaces.add("c6");
        lightSpaces.add("c8");
        lightSpaces.add("d1");
        lightSpaces.add("d3");
        lightSpaces.add("d5");
        lightSpaces.add("d7");
        lightSpaces.add("e2");
        lightSpaces.add("e4");
        lightSpaces.add("e6");
        lightSpaces.add("e8");
        lightSpaces.add("f1");
        lightSpaces.add("f3");
        lightSpaces.add("f5");
        lightSpaces.add("f7");
        lightSpaces.add("g2");
        lightSpaces.add("g4");
        lightSpaces.add("g6");
        lightSpaces.add("g8");
        lightSpaces.add("h1");
        lightSpaces.add("h3");
        lightSpaces.add("h5");
        lightSpaces.add("h7");

        // Initializing dark spaces
        darkSpaces.add("a1");
        darkSpaces.add("a3");
        darkSpaces.add("a5");
        darkSpaces.add("a7");
        darkSpaces.add("b2");
        darkSpaces.add("b4");
        darkSpaces.add("b6");
        darkSpaces.add("b8");
        darkSpaces.add("c1");
        darkSpaces.add("c3");
        darkSpaces.add("c5");
        darkSpaces.add("c7");
        darkSpaces.add("d2");
        darkSpaces.add("d4");
        darkSpaces.add("d6");
        darkSpaces.add("d8");
        darkSpaces.add("e1");
        darkSpaces.add("e3");
        darkSpaces.add("e5");
        darkSpaces.add("e7");
        darkSpaces.add("f2");
        darkSpaces.add("f4");
        darkSpaces.add("f6");
        darkSpaces.add("f8");
        darkSpaces.add("g1");
        darkSpaces.add("g3");
        darkSpaces.add("g5");
        darkSpaces.add("g7");
        darkSpaces.add("h2");
        darkSpaces.add("h4");
        darkSpaces.add("h6");
        darkSpaces.add("h8");
    }

    public static boolean bishop(String start, String end, int moves){

        int startX = start.toCharArray()[0]-48;
        int startY = start.toCharArray()[1];
        int endX = end.toCharArray()[0]-48;
        int endY = end.toCharArray()[1];

        if (start.equals(end)) return true;

        if (lightSpaces.contains(start) && lightSpaces.contains(end) && moves >= 2){
            return true;
        }
        if (darkSpaces.contains(start) && darkSpaces.contains(end) && moves >= 2){
            return true;
        }
        if (lightSpaces.contains(start) && lightSpaces.contains(end) && moves == 1){
            return ((startX-endX)==(startY-endY));
        }
        if (darkSpaces.contains(start) && darkSpaces.contains(end) && moves == 1){
            return ((startX-endX)==(startY-endY));
        }

        return false;
    }

    public static void main (String[] args){
        initializeChessBoard();
        System.out.println(bishop("a1", "b4", 2));
        System.out.println(bishop("a1", "b5", 5));
        System.out.println(bishop("f1", "f1", 0));
        System.out.println(bishop("a1", "b4", 1));
    }
}
