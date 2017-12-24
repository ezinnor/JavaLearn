import java.io.*;

public class Apple {
    public static void main (String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a character.");

        //accepts the input as character.
        char ch = (char)br.read();

        //accept the input as string.
        String name = (String)br.readLine();

        //accept the input as string then convert it into interger with parse methods.
        String number = (String)br.readLine();
        int num = Integer.parseInt(number);
        float f = Float.parseFloat(number);
        //display the result.
        System.out.println(ch);
        System.out.println(name);
        System.out.println(num);
        System.out.println(f);

    }
}
