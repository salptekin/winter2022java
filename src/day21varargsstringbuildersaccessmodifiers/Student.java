package day21varargsstringbuildersaccessmodifiers;

public class Student{

    public String name = "Ali Can";
    Integer age = 12;
    private char initial = 'A';

    //Note 1: If you do not type any access modifier, it means the access modifier is "default"
    //Note 2: "public" class members(variables and methods) are accessible from entire the project
    //Note 3: "private" class members cannot be accessible from other classes and from other packages
    //        "private" class members can be accessible just from the class itself
    //Note 4: "default"(package private) class members cannot be accessible  from other packages
    //Note 5: "protected" class members can be accessible from child classes in any packages
    //        "protected" class members cannot be accessible from other packages if you are not child class
    //Note 6: A class cannot be "protected" and cannot be "private".
    //        "protected" and "private" access modifiers are just for class members not for classes.

    /*
        1)What is the difference between "public" and "default"(package private)?
        Answer: No restriction for "public" in entire the project.
                No restriction for "default" in entire the package.

        2)What is the difference between "protected" and "default"(package private)?
        Answer: No restriction for "protected" in child classes
                No restriction for "protected" in entire the package
                No restriction for "default" in entire the package

        3)What is the difference between "public" and "protected"?
        Answer: No restriction for "public" in entire the project.
                No restriction for "protected" in child classes
                No restriction for "protected" in entire the package
     */

}
