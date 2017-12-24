import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Stringtokens {
    public static void main(String pradeep[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the full name and also age?");
        String answer = br.readLine();

        //string Tokenizer
        StringTokenizer st = new StringTokenizer(answer, " ");
        String firstName = st.nextToken();
        String lastName = st.nextToken();
        String age = st.nextToken();
        firstName = firstName.trim();
        lastName = lastName.trim();
        age = age.trim();
        int realAge = Integer.parseInt(age);

        System.out.println("The name and age of person is: "+ firstName +"\n"+ lastName +"\n"+ realAge);

    }
}
