//9. ​ Write a program to read the content of a text file, convert the content in upper case and print
//the same in console along with the length of the file.

package com.stackroute;


import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println();
        File file=new File("fileName.txt");
//        String contentToWrite="Hey, This is hello World. What about you?";
//        OutputStream outputStream=new FileOutputStream(file);
//        outputStream.write(contentToWrite.getBytes());
//        outputStream.close();
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String readString=reader.readLine();
        reader.close();
        System.out.println("Original File Content is  ->  "+readString);
        System.out.println("UpperCase File content is ->  "+readString.toUpperCase());
    }
}
