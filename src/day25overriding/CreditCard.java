package day25overriding;

    /*
        1)Encapsulation means "Data Hiding"
        2)How to hide data?
          Answer: I make the data private
        3)Can you read encapsulated data from the other classes?
          Answer: Yes, I create "getter method"(Java Bean) for the encapsulated data then by using the getter method
                  I can read it.
        4) Can you update encapsulated data from the other classes?
          Answer: Yes, I create "setter method"(Java Bean) for the encapsulated data then by using the setter method
                  I can read it.
        5) Return Type of getter() methods must be same with the data type of the variables
           Return Type of setter() methods will be "void" everytime
        6) getter() methods do not use any parameter, but setter() methods use a single
           parameter whose data type is same with the data type of the variable
        7) getter() methods for booleans start with "is", does not start with "get"
        8) What should you do if you do not want to make your variable value readable?
           Answer: Do not create getter
           What should you do if you do not want to update your variable value
           Answer: Do not create setter
           What should you do if you do not want the variable value neither readable nor updatable?
           Answer: Do not create getter, do not create setter

           Note: If you do not create any setter for any variable, then class is called "immutable class"

     */

public class CreditCard {

    private String ccn = "1234432123455432";
    private int age = 21;
    private boolean isExpired = false;

    //By using "getter methods" we can read the value of encapsulated data from other classes
    public String getCcn() {
        return ccn;
    }

    //By using "setter methods" we can update the value of encapsulated data from other classes
    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isExpired() {
        return isExpired;
    }
    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
