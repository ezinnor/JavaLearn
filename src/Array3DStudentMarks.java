public class Array3DStudentMarks {
    public static void main(String args[]){
        //There are three departments Electrical, civil, and computerScience
        //Each department consist of two students, and those two students have marks in three subjects in their
        //respective fields.
        int dpt =0;
        int student = 0;
        int total =0;
        int marks[][][] = {
                {{12,13,14},{98,56,34}},  //Electrical
                {{45,56,67},{90,91,92}},  //Civil
                {{11,19,20},{23,24,25}},   //Computer Science
        };

        //to iterate through we need 3 loops
        for(int i=0; i<3; i++){
            System.out.println("Department: "+ (dpt+1));
            for(int j=0; j<2; j++){
                System.out.print("Student :"+ (student+1) + "\t");
                for(int k=0; k<3; k++){
                    System.out.print(marks[i][j][k]+ "\t");
                    total = total + marks[i][j][k];
                }
                System.out.print("Total Marks: "+ total);
                System.out.println();

                student++;
                total = 0;
            }

            dpt++;
            student=0;
        }
    }
}
