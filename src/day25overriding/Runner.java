package day25overriding;

public class Runner {

    public static void main(String[] args) {

        CreditCard ccn1 = new CreditCard();
        System.out.println(ccn1.getCcn());//1234432123455432

        String ccn = ccn1.getCcn();

        //I want to make credit card number like ***********5432
        ccn1.setCcn("************" + ccn.substring((ccn.length()-4)));
        System.out.println(ccn1.getCcn());

        //I want to tell to user "Not visible"
        ccn1.setCcn("Not visible");
        System.out.println(ccn1.getCcn());


    }

}
