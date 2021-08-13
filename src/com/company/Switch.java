package com.company;

enum Color{
    Red,
    Blue,
    Green
}

public class Switch {
    public static void main(String[] args) {
        Color color = Color.Red;
        switch(color){
            case Red:
                System.out.println("red!");
                break;
            case Blue:
                System.out.println("blue!");
                break;
            case Green:
                System.out.println("green!");
                break;
            default:
                System.out.println("Not known color");
                break;
        }

    }
}
