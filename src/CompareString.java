public class CompareString {
    public static void main(String args[]){
        //make two strings to compare
        String s1 = "Hello";
        String s2 = "World";

        if(s1 == s2){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal.");
        }

        //Above if statements checks for object references.
        //while the below statements checks for string contents.

        if(s1.equals(s2)){
            System.out.println("Both strings are equal.");
        }else{
            System.out.println("Both strings are not equal.");
        }

        //checks whether string objects are immutable or not.
        s1 = s1+s2;
        System.out.println(s1);
    }
}
