package day21varargsstringbuildersaccessmodifiers;

public class StringBuilder1 {

    /*
        1)String Class is "immutable" but StringBuilder Class is "mutable"
        2)"immutable" means updates will NOT be reflected to the original String without assignment
        3)"mutable" means updates will be reflected to the original String without assignment
        4)If you need to reflect updated directly to the original String, use StringBuilder Class, otherwise
          use String Class
     */

    public static void main(String[] args) {

        String s = "Ali";
        s = s + "!";
        System.out.println(s + "!");
        System.out.println(s + "!" + "?");

        //How to create a StringBuilder Object
        //1.Way:
        StringBuilder sb1 = new StringBuilder("Veli");
        System.out.println(sb1);//Veli

        //2.Way:
        StringBuilder sb2 = new StringBuilder();

        //Java gives 16 boxes for the characters whose numbers are less than or equal to 16
        System.out.println("For empty: " + sb2.capacity());

        sb2.append("Veli");
        sb2.append(" Han").append("!...").append("xxxx");
        System.out.println(sb2);//Veli Han!...
        System.out.println(sb2.length());// 12
         //Java gives 2 times existing boxes plus 2 if you use characters more than the existing boxes
        System.out.println("For non-empty: " + sb2.capacity());

        //3.Way:
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("FL!");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//2*2+2 = 6

        StringBuilder sb4 = new StringBuilder("Mississippi");
        System.out.println(sb4.lastIndexOf("s"));//6
        //Take the first 7 indexes, return the index of last occurrence of "s"
        System.out.println(sb4.lastIndexOf("s",7));

        sb4.insert(2,"XXX");
        System.out.println(sb4);//MiXXXssissippi

        System.out.println(sb4.insert(1,"ABCDE", 1,3));// MBCiXXXssissippi

        sb4.delete(4, 7);
        System.out.println(sb4);// MBCississippi

        sb4.deleteCharAt(1);
        sb4.deleteCharAt(1);
        System.out.println(sb4);// Mississippi

        sb4.replace(2, 4, "S");
        System.out.println(sb4);// MiSissippi

        sb4.reverse();
        System.out.println(sb4);// ippissiSiM

        StringBuilder sb5 = new StringBuilder("Ali Can");
        StringBuilder sb6 = new StringBuilder("Ali Can");
        StringBuilder sb7 = new StringBuilder("Dli Can");

        //For the same Strings compareTo() method returns 0
        System.out.println(sb5.compareTo(sb6));//0

        //If the first one comes before the second one the result will be negative
        System.out.println(sb5.compareTo(sb7));//-3

        //If the first one comes after the second one the result will be positive
        System.out.println(sb7.compareTo(sb5));//3

        //Note: The number 3 means the difference lexicographically
        //Note: For the uppercase and lowercase it will return the difference between ASCII values

        //Note: If a method comes from String Class, it will be immutable, it means it cannot update the String Builder
        String newString = sb5.substring(4);
        System.out.println(newString);// Can
        System.out.println(sb5);// Ali Can

        //Can we convert StringBuilders to String? Yes by using toString()
        String stringFromStringBuilder = sb5.toString();
        //Can we convert String to StringBuilders? Yes by using StringBuilder() constructor
        StringBuilder stringBuilderFromString = new StringBuilder(stringFromStringBuilder);
    }
}
