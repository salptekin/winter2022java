package day26exception;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "Can", "Veli", "Han"};

        getAnElementFromAnArray(arr, 2);//Veli
        getAnElementFromAnArray(arr, 0);//Ali
        getAnElementFromAnArray(arr, 4);//ArrayIndexOutOfBoundsException ==> Index 4 out of bounds for length 4

    }

    public static void getAnElementFromAnArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("An error occurred in array operation ==> " + e.getMessage());
        }
    }

}
