package com.company;

import static com.company.Main.*;

public class Robot implements RobotMoves {




    @Override
    public void start(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[arr[i].length / 2][arr[j].length / 2] = robot;
                if(arr[i][j] ==robot){
                    indexI = i;
                    indexJ = j;
                }
            }

        }


    }

    @Override
    public int right(int[][] arr, int index) {
        indexJ = index +1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == robot) {
                    arr[i][j] = tmp;


                    if(indexJ<arr[j].length) {
                        arr[i][indexJ] = 1;

                    }
                }
            }


        }
        return  indexJ;
    }

    @Override
    public int left(int[][] arr, int index) {
        indexJ = index -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == robot) {
                    arr[i][j] = tmp;


                    if(indexJ<arr[j].length) {
                        arr[i][indexJ] = 1;

                    }
                }
            }


        }
        return  indexJ;
    }

    @Override
    public int up(int[][] arr, int index) {
        indexI = index -1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == robot) {
                    arr[i][j] = tmp;


                    if(indexI<arr[i].length) {
                        arr[indexI][j] = 1;

                    }
                }
            }


        }
        return  indexI;

    }



    @Override
    public int down(int[][] arr, int index) {
        indexI = index +1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == robot) {
                    arr[i][j] = tmp;


                    if(indexI<arr[i].length) {
                        arr[indexI][j] = 1;

                    }
                }
            }


        }
        return  indexI;

    }



}
