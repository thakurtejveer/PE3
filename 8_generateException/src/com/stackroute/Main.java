//8. Write a program that will generate ​ exceptions​ of type NegativeArraySizeException,
//IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
//displaying the message stored in the exception object.

package com.stackroute;

public class Main {

    public static void main(String[] args) {
        int[] array=new int[5];

        for(int i=0;i<3;i++)
        {
            try
            {
                switch(i)
                {
                    case 0:
                        int[] newArray= new int[-3];
                        break;
                    case 1:
                        array[6]=30;
                        break;
                    case 2:
                        int[] num= null;
                        System.out.println(num[0]);
                        break;
                    default:
                        System.out.println("All cases passed: ");


                }
            }
            catch(NegativeArraySizeException e)
            {
                System.out.println("NegativeArraySizeException.");
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println("IndexOutOfBoundsException.");
            }
            catch(NullPointerException e)
            {
                System.out.println("NullPointerException.");
            }
            finally
            {
                System.out.println("We are here.");
            }
        }

    }
}
