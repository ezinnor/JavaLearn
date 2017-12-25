public class StringMethods {
    public static void main(String args[]){
        String s1 = "Pradeep";
        String s2 = "Choudhary";

        //concat
        String s3 = s1.concat(s2);
        System.out.println(s3);

        //length
        int len = s3.length();
        System.out.println("the length of string s3 is: "+ len);

        //compare to method
        int compare = s1.compareTo(s2);
        if(compare == 0){
            System.out.println("Both strings are equal.");
        }else if(compare == 1){
            System.out.println("First string is bigger.");
        }else{
            System.out.println("Second string is bigger.");
        }

        //equals
        boolean tellWhichIsBigger = s1.equals(s2);
        if(tellWhichIsBigger == true){
            System.out.println("Both strings are equal.");
        }else{
            System.out.println("Both strings are not equal.");
        }


        //starts with and ends with
        boolean startWith = s1.startsWith(s2);
        boolean endsWith = s1.endsWith(s2);

        String s5 = "This is a math book.";
        String s6 = "math";

        //indexof method
        int indexOf = s5.indexOf(s6);
        System.out.println(indexOf);

        //replace method
        String s7 = s5.replace('o', 'z');
        System.out.println(s7);

        //substring for extracting out part of strings
        String s8 = s5.substring(9);
        System.out.println(s8);
        //substring from one index to another.
        String s9 = s5.substring(5,10);
        System.out.println(s9);

        //toLowerCase and toUpperCase method
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());

        //and there are many more, like trim, getChars, Split etc.
    }
}
