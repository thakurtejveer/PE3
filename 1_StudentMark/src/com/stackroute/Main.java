//1. Create a class called StudentMarks, which prompts user for the number of students, reads
//it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user
//for the grades of each of the students and saves them in an int array called stuGrades. Your
//program shall check that the grade is between 0 and 100 else has to trow an error message.


package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.print("Enter Number of Students: ");
        int numOfStudents=scanner.nextInt();
        int grades[]=new int[numOfStudents];
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.format("Enter Grade (between 0 to 100) of student %d: ",(i+1));
            try {
                grades[i] = scanner.nextInt();
                if (grades[i] < 0 || grades[i] > 100) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.format("You have entered wrong grade of student %d. ", i+1);
                i--;
            }

        }
        System.out.print("Grades of all students are following: ");
        for(int i=0;i<numOfStudents;i++)
        {
            System.out.print(grades[i]+" ");
        }

    }
}
