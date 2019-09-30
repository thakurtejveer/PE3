//2. Write a program to compute the addition of two matrix, Read the number of rows and
//columns as input, also the values of each matrix
//Output:
//Input number of rows of matrix: 3
//Input number of columns of matrix: 2
//Input elements of first matrix: 1 2 3 4 5 6
//Input the elements of second matrix: 9 8 7 6 5 4
//Sum of the matrices:-
//10 10
//10 10
//10 10

package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number of rows of matrix: ");
        int numOfRowsOfMatrix=scanner.nextInt();
        System.out.println("Input number of columns of matrix: ");
        int numOfColumnsOfMatrix=scanner.nextInt();
        int [][] matrix1=new int[numOfRowsOfMatrix][numOfColumnsOfMatrix];
        int [][] matrix2=new int[numOfRowsOfMatrix][numOfColumnsOfMatrix];
        int [][] answerMatrix=new int[numOfRowsOfMatrix][numOfColumnsOfMatrix];
        System.out.println("Input elements of first matrix : ");
        {
            for(int i=0;i<numOfRowsOfMatrix;i++)
            {
                for(int j=0;j<numOfColumnsOfMatrix;j++)
                {
                    System.out.format("Element (%d,%d): ", i+1, j+1);
                    matrix1[i][j]=scanner.nextInt();
                }
            }

        }
        System.out.println("Input elements of second matrix : ");
        {
            for(int i=0;i<numOfRowsOfMatrix;i++)
            {
                for(int j=0;j<numOfColumnsOfMatrix;j++)
                {
                    System.out.format("Element (%d,%d): ", i+1, j+1);
                    matrix2[i][j]=scanner.nextInt();
                }
            }

        }
        System.out.println("Sum of both matrices is: ");
        {
            for(int i=0;i<numOfRowsOfMatrix;i++)
            {
                for(int j=0;j<numOfColumnsOfMatrix;j++)
                {
                    System.out.print(matrix1[i][j]+matrix2[i][j]+" ");;
                }
                System.out.println("");
            }
        }



    }

}
