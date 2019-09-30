//6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this
//easier, assume the digits are a ​ string​ and use split()
//Input: 98,96,95,94,93
//Output: 98,96,95,94,93 non consecutive numbers
//Input: 54,53,52,51,50,49,48
//Output : 54,53,52,51,50,49,48 are consecutive numbers
//Input: 1,2,3,4,5,6,6
//Output: 1,2,3,4,5,6,6 non consecutive numbers

package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your numbers separated by comma ',': ");
        String enteredString=scanner.nextLine();
        String[] wordsOfString=enteredString.split(",");
        int n=wordsOfString.length;
        int[] numbersOfString=new int[n];
        int number;
        for(int i=0;i<n;i++)
        {
            number=Integer.parseInt(wordsOfString[i]);
            numbersOfString[i]=number;
        }
        Arrays.sort(numbersOfString);
        for(int i=1;i<n;i++)
        {
            if(numbersOfString[i]!=numbersOfString[i-1]+1) {
                System.out.println(enteredString+" are non consecutive numbers");
                return;
            }
        }
        System.out.println(enteredString+ " are consecutive numbers");

    }
}
