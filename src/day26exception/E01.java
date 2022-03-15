package day26exception;

    /*
        1)Exception means un-expected issues in your codes.
          Like "Gas Finishing" in your vacation
        2)There are 2 ways to work with Exceptions
          a)Exception Handling: try-catch blocks
          b)Throw Exception
     */

public class E01 {

    public static void main(String[] args) {
        divide(12, 3);//4
        divide(0, 3);//0
        divide(12, 0);//No answer in Math
    }

    /*
        1)If you think any problem can occur for any line of code, put it inside the try-block then create a catch-block
        2)Inside the catch-block parenthesis put the possible exception class.
        3)By using "e.getMessage()", you can get technical message
        4)If you want you can put a non-technical message inside the catch body
        5)If the codes inside the try-body works without any issue. catch-block will not be executed.
        **** 6)After any Exception occurred next lines of codes cannot be executed, JAVA STOPS EXECUTION
     */

    public static void divide(int a, int b){
        try{
            System.out.println(a / b);
            System.out.println("Hi!");
            System.out.println("Bye!");
        }catch(ArithmeticException e){
            System.out.println("Could not divide ==> " + e.getMessage());
        }
    }

//    Note: Following code is not recommended because it needs deep math knowledge
//    public static void divide(int a, int b){
//        if(b==0){
//            System.out.println("Divisor cannot be zero");
//        }else {
//            System.out.println(a / b);
//        }
//    }

}
