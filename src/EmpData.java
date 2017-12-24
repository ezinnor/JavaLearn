import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpData {
    public static void main(String args[]) throws IOException{
        //create bufferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter employee ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.println("Enter employee gender (M/F): ");
        char gender = br.readLine().charAt(0);

        System.out.println("Enter the name of the employee?");
        String name = br.readLine();


        //display results
        System.out.println("Employee ID, gender and name are: "+ id +"\n"+ gender+ "\n" + name);


    }
}
