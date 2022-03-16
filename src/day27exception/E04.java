package day27exception;

import java.io.FileInputStream;
import java.io.IOException;

    /*
        1)When you use "throws" in the method name line, it means you are telling to Java "Hey, Java if you need help let me know"
        2)After "throws" keyword in the method name line, you can use multiple Exception Classes like;
           throws IOException, ArithmeticException, ...
        3)What are the differences between, "throws" and "throw" keywords
            a)"throws" can be used in the method name line, "throw" can be used in method body
            b)After "throws", you can use multiple Exception Class Names.
              After "throw", you can use "new" keyword and Constructor of the Exception Class
            c)"throws" keyword used to handle "Checked Exceptions", "throw" keyword is used to throw exception whenever and wherever we want
         4)What is the meanings of "final", "finally", and "finalize" keywords? ==> Homework...
     */

public class E04 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/day27exception/File01.txt");
        int k = 0;
        while( (k=fis.read()) != -1){
            System.out.print((char)k);
        }

        System.out.println("==============");

        printTheAge(-12);//IllegalArgumentException ==> Ages cannot be negative...

    }

    //Create a method which throws "IllegalArgumentException" for negative ages
    public static void printTheAge(int age){

        if(age>=0){
            System.out.println(age);
        }else{
            throw new IllegalArgumentException("Ages cannot be negative...");
        }

    }















}
