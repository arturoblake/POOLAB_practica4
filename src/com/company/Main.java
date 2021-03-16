package com.company;
import java.util.*;

public class Main{
    public String color;
    public int velocidad = 0;
    public int alcance = 0;
    public int fuerza = 0;

    public static void main(String[] args) {

        AngryBird p1 = new AngryBird("r", 3, 4, 3);
        AngryBird p2 = new AngryBird("a",5, 5, 2);
        AngryBird p3 = new AngryBird("n",1, 3, 5);

        System.out.println("el primer angrybird es : r, 3, 4, 3");
        System.out.println("el segundo angrybird es : a, 5, 5, 2 ");
        System.out.println("el tercer angrybird es : r, 1, 3, 5");
    }
}
