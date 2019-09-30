//4. Write a program to set up an array of places, Loop round and remove the vowels. Display the
//new words in console
//Input:
//India
//United States
//Germany
//Egypt
//czechoslovakia
//Output:
//Place Name without Vowels:0 Ind
//Place Name without Vowels:1 Untd Stts
// Place Name without Vowels:2 Grmny
//Place Name without Vowels:3 Egypt
//Place Name without Vowels:4 czchslvk

package com.stackroute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter number of places you want to : ");
        Scanner scanner=new Scanner(System.in);
        int numOfPlaces=scanner.nextInt();
        List<String> wordsOfString= new ArrayList<String>(numOfPlaces);
        int n=1;
        while(n<numOfPlaces)
        {
            wordsOfString.set(n, scanner.nextLine());
            n++;
        }





    }
}
