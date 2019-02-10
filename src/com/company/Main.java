package com.company;

public class Main {
    private static int[][] arr = new int[5][5];
    public static int robot = 1;
    public static int tmp = 0;
    public static int indexI;
    public static int indexJ;


    public static void main(String[] args) {


        Robot robot = new Robot();

        printArray(arr);

        robot.start(arr);

        System.out.println(indexI);
        System.out.println(indexJ);

        System.out.println(" ");
        printArray(arr);
        System.out.println(indexI);

        System.out.println(" ");
        robot.down(arr,indexI);

        printArray(arr);
        System.out.println(indexI);

        System.out.println(" ");
        robot.up(arr,indexI);

        printArray(arr);
        System.out.println(indexI);

        System.out.println(" ");
        robot.right(arr,indexJ);

        printArray(arr);
        System.out.println(indexJ);

        System.out.println(" ");
        robot.left(arr,indexJ);

        printArray(arr);
        System.out.println(indexJ);



    }
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
