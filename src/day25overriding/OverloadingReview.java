package day25overriding;

public class OverloadingReview {

    public static void main(String[] args) {

    }

    //Can we overload static methods? YESSSSSS!
    public static void add(int i, int k){
        System.out.println(i+k);
    }
    public static void add(int i, int k, int m){
        System.out.println(i+k);
    }

    //Can we overload final methods? YESSSSSS!
    public final void multiply(int a, int b){
        System.out.println(a*b);
    }
    public final void multiply(int a, int b, int c){
        System.out.println(a*b*c);
    }

    //Can we overload private methods? YESSSSSS!
    private void join(String s, String m){
        System.out.println(s + m);
    }
    private void join(String s, String m, String n){
        System.out.println(s + m + n);
    }
}
