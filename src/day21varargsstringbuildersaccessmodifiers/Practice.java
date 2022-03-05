package day21varargsstringbuildersaccessmodifiers;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {

        //Find the smallest positive integer and greatest negative integer in a given integer list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);
        System.out.println(list);// [-12, 18, -5, 23, -2]

        //Sort the list elements
        Collections.sort(list);//[-12, -5, -2, 18, 23]

        //Assign values
        int minPositive = list.get(list.size()-1);
        int maxNegative = list.get(0);

        //Loop
        for(Integer w : list){

            if(w>=0){
                minPositive = Math.min(minPositive, w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w);
            }

        }
        System.out.println(minPositive);
        System.out.println(maxNegative);
    }
}
