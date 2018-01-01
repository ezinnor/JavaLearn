import java.util.Scanner;

public class HashCodeOfObject {
    private String name;
    private int age;

    public void message(){
        System.out.println("Hello my name is "+ name + " and I am "+ age + " years old.");

    }

    HashCodeOfObject(String name, int age){

        this.name = name;
        this.age = age;
    }



    public static void main(String args[]){
        String s = args[0];
        int i = Integer.parseInt(args[1]);
        String s2 = args[2];
        int i2 = Integer.parseInt(args[3]);
        HashCodeOfObject pradeep = new HashCodeOfObject(s, i);
        HashCodeOfObject anuskha = new HashCodeOfObject(s2,i2);
        Scanner input = new Scanner(System.in);


        pradeep.message();
        anuskha.message();

        System.out.println("And this is the hash code of object pradeep: "+ pradeep.hashCode());
        System.out.println("And this is the has code of object anuksha" + anuskha.hashCode());
    }
}

class AnotherClass {
    public static void main(String args[]){

//        HashCodeOfObject deepu = new HashCodeOfObject();
//
//        deepu.message();


    }
}
