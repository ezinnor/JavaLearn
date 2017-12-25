import java.util.Scanner;

public class BubbleSortTechnique {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int numbers[] = new int[10];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        //Bubble sort
        int temp = 0;
        boolean flag = false;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length-1; j++){
                if(numbers[j] > numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    flag = true;
                }

            }
            if(flag == false)
                break;
            else{
                flag = false;
            }
        }

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
