//11. Write a program to calculate the frequency of the words in a given file,
//Example: Create a file named FileDemo.txt with the following content
//i am a man ,
//i like to sleep ,
//i have a home.
//Output: i->3 times,
//am-1,
//like -1,
//have -1,
//a-2 etc.,

package com.stackroute;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        File file=new File("FileDemo.txt");
        String contentToWrite="i am a man, i like to sleep, i have a home.";
        OutputStream outputStream=new FileOutputStream(file);
        outputStream.write(contentToWrite.getBytes());
        outputStream.close();

    }
}
