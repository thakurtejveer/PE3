package com.stackroute;

public class Main {

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("WW|");
	for(int i=1;i<=8;i++) {
	    for(int j=1;j<=8;j++)
        {
            if((i+j)%2==0)
            {
                str.delete(0,str.length());
                str.append("WW|");
                System.out.print(str);
            }
            else
            {
                str.delete(0,str.length());
                str.append("BB|");
                System.out.print(str);
            }
        }
        System.out.println();
    }
    }
}
