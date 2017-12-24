import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibbonaciSeries {
    public static void main(String pradeep[]) throws IOException{
        //to generate fibbonaci series, first we'd start with two numbers 0 and 1.
        int f1 = 0;
        int f2 = 1;
        int f;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Upto where you want your fabbonaci series?");
        String no = br.readLine();
        int number = Integer.parseInt(no);
        System.out.println(f1);
        System.out.println(f2);
        f = f1 + f2;
        System.out.println(f);
        int count = 3;
        while(count < number){

            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
            count++;

        }

    }
}
