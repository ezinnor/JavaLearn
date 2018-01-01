public class GetCharAndSplit {
    public static void main(String args[]){
        String msg = "This is a text message. ";
        char arr[] = new char[20];
        msg.getChars(4,10,arr,0);

        //print it out.
        System.out.println(arr);
    }
}
