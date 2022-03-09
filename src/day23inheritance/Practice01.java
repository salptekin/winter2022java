package day23inheritance;

public class Practice01 {
    int a = 12;
    public void rest(){
        System.out.println("XXX");
    }
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        this();//By using 'this()' you can do constructor call from inside the class
               //'this()' must be first statement in constructor body
               //You can use just one this constructor call in a constructor body
        System.out.println("B");
    }
}
class Practice02 extends Practice01{
    int a = 13;
    public void rest(){
        System.out.println("YYY");
    }
    public Practice02(){
        super(12);
        System.out.println("C");
    }
    public Practice02(int i){
        super(11); //'super()' must be first statement in constructor body
                     //You can use just one super constructor call in a constructor body
        System.out.println("E");
    }
}
class Practice03 extends Practice02{
    int a = 14; // If you make any variable private it cannot be inherited
                // public, protected class members can be inherited without any issue
                // default class members can be inherited just in the same package
    public void rest(){
        System.out.println("ZZZ");
    }
    public Practice03(String s){
        super(11);
        System.out.println("D");
    }
}
class Runner{
    public static void main(String[] args) {
        Practice03 obj1 = new Practice03("Woow!");
        System.out.println(obj1.a);//14 ==> Java selects variables by looking at the data type of the object
        obj1.rest();//ZZZ ==> Java selects methods by looking at the constructor of the object

        Practice02 obj2 = new Practice03("Woow!");
        System.out.println(obj2.a);//13 ==> If a class does not have "a" Java looks for "a" in parent classes. If any parent does not have "a" you will get Compile Time Error
        obj2.rest();//ZZZ

        Practice01 obj3 = new Practice03("Woow!");
        System.out.println(obj3.a);//12
        obj3.rest();//ZZZ

        Object obj4 = new Practice03("Woow!");
    }
}