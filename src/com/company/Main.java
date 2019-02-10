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


    public static void main(String[] args) {





        Robott.start(field);
        printArray(field);

        motion(Mot,Robott);



    }
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void motion (String str, Object r){

        Mot = str;
        r = Robott;


        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        str.toUpperCase();

      char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 'R'){
                Robott.right(field,indexJ);
                System.out.println(" ");
                printArray(field);
            }
            else if(c[i] == 'L'){
                Robott.left(field,indexJ);
                System.out.println(" ");
                printArray(field);
            }
            else if(c[i] == 'U'){
                Robott.up(field,indexI);
                System.out.println(" ");
                printArray(field);
            }
            else if(c[i] == 'D'){
                Robott.down(field,indexI);
                System.out.println(" ");
                printArray(field);
            }
            else{
                System.out.println("You must enter the characters: 'R' or 'L' or 'U' or 'D'");

            }

        }

      System.out.println(Arrays.toString(c));



    }
}
