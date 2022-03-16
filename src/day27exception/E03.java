package day27exception;

    /*
        Note 1: When you type code, Java will give you red underlines for some Exceptions before running the code.
              That kind of Exceptions are called "Compile Time Exceptions"(Checked Exception)
              1)FileNotFoundException: This Exception is thrown if the path is wrong or the file does not exist
              2)IOException:This Exception handles all issues related with Input and Output

              Note a: "FileNotFoundException" is the child of "IOException"
              Note b: If there is parent-child relationship between Exception Classes, Child Exception Class must come before
                    Parent Exception Class in multiple catch-block usage.
              Note c: To execute a code block under every condition, put the codes inside the "finally-block"
        Note 2: a) try-block cannot be used alone
                b) try-block can be used with a single catch-block
                c) try-block can be used with multiple catch-block
                d) try-block can be used with just finally-block
                e) try-block can be used with single or multiple catch-block and finally-block
     */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

    public static void main(String[] args) {

        goAndReadTheFile();

    }

    public static void goAndReadTheFile(){

        try {
            FileInputStream fis = new FileInputStream("src/day27exception/File02.txt");
            int k = 0;
            while( (k=fis.read()) != -1){
                System.out.print((char)k);
            }
        }catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching out the file or existence of the file ==> " + e.getMessage());
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Connection with cloud was broken");
        }
    }
}
