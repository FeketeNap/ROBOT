package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static int[][] field = new int[5][5];
    public static int robot = 1;
    public static int tmp = 0;
    public static int indexI;
    public static int indexJ;
    public static String Mot;
    public static Robot Robott = new Robot();
    public static int[] startPos = new int[4];



    public static void main(String[] args) {

        Robott.start(field);

        startPos[0] = indexI;
        startPos[1] = indexJ;

        System.out.println("Starting position: ");

        printArray(field);

        motion(Mot,Robott);
        check(startPos);


    }
    private static void printArray(int[][] arr) {
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void motion (String str, Object r){

        Mot = str;

        System.out.println("You must enter the characters: 'R' or 'L' or 'U' or 'D':");

        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        String s = str.toUpperCase();

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'R'){
                Robott.right(field,indexJ);
            }
            else if(c[i] == 'L'){
                Robott.left(field,indexJ);
            }
            else if(c[i] == 'U'){
                Robott.up(field,indexI);
            }
            else if(c[i] == 'D'){
                Robott.down(field,indexI);
            }
            else{
                System.out.println("You must enter the characters: 'R' or 'L' or 'U' or 'D'");
            }
        }
        System.out.println("Coordinates now: ");
        printArray(field);
        System.out.println(" ");

    }
    private static void check (int [] startPos){
        startPos[2] = indexI;
        startPos[3] = indexJ;


        if (startPos[0] == startPos[2] && startPos[1] == startPos[3]){

            System.out.println("coordinates coincide!");
        }else{

            System.out.println("coordinates do not match!");
        }

    }
}
