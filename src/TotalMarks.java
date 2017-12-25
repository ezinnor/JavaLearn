import java.util.Scanner;

public class TotalMarks {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //declare the array to store marks
        float marks[] = new float[5];
        float totalMarks = 0;
        System.out.println("enter the total number of an exam?");
        int NumberOfExam = input.nextInt();
        int totalNumberOfExam = NumberOfExam*5;
        //Ask the student about marks.
        System.out.println("Enter the marks for 5 subjects?");
        for(int i=0; i<5;i++){
            marks[i] = input.nextFloat();
        }
        //calculate total marks
        for (int i=0; i<marks.length; i++){
            totalMarks += marks[i];
        }

        //calculate percentage
        float totalPercentage = (totalMarks/totalNumberOfExam) * 100;

        System.out.printf("Total number secured is: %.2f and percentage is: %.2f", totalMarks, totalPercentage);
    }
}
