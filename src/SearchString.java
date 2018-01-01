import java.util.*;
public class SearchString {
    //create the main method.
    public static void main(String args[]){
        //create the scanner object.
        Scanner input = new Scanner(System.in);

        //asks for strings and feed them into a string array.
        System.out.println("How many strings do you want to feed?");
        int noOfStrings = input.nextInt();

        String objStrings[] = new String[noOfStrings];


        for(int i=0; i<noOfStrings; i++){
            objStrings[i] = input.next();
        }

        //Enter the string you want to search
        System.out.println("Enter the string you want to search?");
        String strSearch = input.next();

        //a boolean flag
        boolean flag = false;

        //search for the string in array
        for(int i=0; i<noOfStrings; i++){
            if(objStrings[i] == strSearch){
                System.out.println("Found the strings at "+ i);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not found in the group.");
        }


    }
}
