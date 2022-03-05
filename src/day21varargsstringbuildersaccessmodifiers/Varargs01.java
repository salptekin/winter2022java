package day21varargsstringbuildersaccessmodifiers;

public class Varargs01 {

    public static void main(String[] args) {

        add();// 0

        add(5);// 5

        add(5, 10);//15

        add(5, 10, 15);//30

    }

    //Note 1: You cannot use any other parameters after varargs
    //Note 2: You can use any other parameters except varargs before varargs
    //Note 3: Varargs must be last parameter everytime
    //Note 4: You can use just a single varargs in a method parenthesis

    public static void add(int... a){
        int sum = 0;
        for(int w : a){
            sum = sum + w;
        }
        System.out.println(sum);
    }
}
