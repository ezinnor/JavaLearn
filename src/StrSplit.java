public class StrSplit {
    public static void main(String args[]){
        //take any string which has to be broken.
        String s1 = "This is a string which will be broken into pieces.";

        //String array to store the pieces.
        String sArray[];

        sArray = s1.split("which");
        //loop to show the string array
        for (int i=0; i<sArray.length; i++){
            System.out.println(sArray[i]);
        }
    }
}
