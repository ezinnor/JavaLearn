public class ReturningMethod {

    private String name;
    private float salary;
    private  float tax = 0;

    ReturningMethod(String n, float s){

        this.name = n;
        this.salary = s;
    }

    public void sayHello(){
        System.out.println("Hello there.");
    }

    // Make a static method and try to call instance variable from it
    public  void acces(){
        System.out.println("The value of tax is: "+ tax);
    }

    ReturningMethod calculateTax (ReturningMethod object) {
//        Where 11% is tax.
        tax = 11/100 * object.salary;
        return object;
    }

    // Main class
    public static void main(String args[]){

        ReturningMethod pradeep = new ReturningMethod("Pradeep Chodhary", 30000);

        pradeep.sayHello();
        ReturningMethod newObject = pradeep.calculateTax(pradeep);
        newObject.sayHello();
        System.out.println(newObject.tax);
        newObject.acces();
//        ReturningMethod.acces();
//        System.out.println(ReturningMethod.tax);

    }



}
