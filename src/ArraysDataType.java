public class ArraysDataType {
    public static void main(String args[]){

        //createing single dimension array.
        int marks[] = {50,60,70,80,90};

        //another way to create it is by allocating memory explicitly
        int marksEnglish[];  //declare it
        marksEnglish = new int[5];  //allocate memory then.
        //or you could write that in one senetence too
        //int marksEnglish[] = new int[5];
        marksEnglish[0] = 45;
        marksEnglish[1] = 11;
        marksEnglish[2] = 23;
        marksEnglish[3] = 34;
        marksEnglish[4] = 78;

        //to read things from array, use loops
        for (int i : marksEnglish
             ) {
            System.out.println(i);
        } //that was for each loop, to iterate through each element in array.

        //simple for loop
        for (int i=0; i<marks.length; i++){
            System.out.println(i);
        }
    }
}
