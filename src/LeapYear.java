import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class LeapYear {
    public static void main(String args[]) throws IOException{

        //accepts input from buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the year to check for leap year.");
        String year = br.readLine();
        int leapYear = Integer.parseInt(year);

        //check for leap year
        if((leapYear % 100 == 0 && leapYear % 400 == 0) || (leapYear % 100 != 0 && leapYear % 4 == 0)){
            System.out.printf("The year %d is a leap year." ,leapYear);
        }else{
            System.out.println("the year isn't a leap year.");
        }
    }
}
