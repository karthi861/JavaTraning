package Sixth;

import java.util.*;


public class list {
    public static void main(String[] args) {
        LinkedList<String> colors=new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");

        for(String a :colors){
            System.out.println(a);
        }
        System.out.println();

        Collections.reverse(colors);
        System.out.println(colors);
        System.out.println();

        colors.sort(null);
        for(String a :colors){
            System.out.println(a);
        }
        System.out.println();





    }
}
