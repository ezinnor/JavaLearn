public class MatrixArray2D {
    public static void main(String args[]){
        //you could take inputs with the help of scanner. i'm hard coding it.
        //make a 2d array
        int x[][] = {
                {1,2,3,4,5},
                {6,7,8,9,0},
                {11,12,13,14,15}
        };

        System.out.println("Now the same array in matrix form.:");
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print(x[i][j]+ "\t");
            }
            System.out.println();
        }

        //to find transpose of the matrix
        System.out.println("Transpose of the matrix.");
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.print(x[j][i]+ "\t");
            }
            System.out.println();
        }


    }
}
