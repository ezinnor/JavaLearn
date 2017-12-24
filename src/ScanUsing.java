import java.util.*;
public class ScanUsing {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("enter name, age, gender, and salary?");
        String answer = input.next();
        int age = input.nextInt();
        char gender = input.next().charAt(0);
        float salary = input.nextFloat();

        System.out.println("Name: "+ answer);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("Salary: "+ salary);

    }
}
