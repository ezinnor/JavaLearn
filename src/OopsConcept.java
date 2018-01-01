public class OopsConcept {

    // Properties of a person, also called variables.
    String name; //his name
    int age;     //his age.


    // Actions done by that person
    void talk(){
        System.out.println("See i'm taking with you dude.");
    }

    void eat(){
        System.out.println("I'm now eating my dinner.");
    }

    void running(){
        System.out.println("I'm running in the park front of my house.");
    }

    // and many more methods to define his actions.


    // This is main method or function.
    public static void main(String args[]){

        // this is where you declare your objects.
        OopsConcept pradeep = new OopsConcept();

        // now object will be able to call methods inside of its class.
        pradeep.talk();
        pradeep.eat();
        pradeep.running();


    }
}
