public class PassingValues {

    private int ID;

    PassingValues(int i){
        this.ID = i;
    }

    public void swap(PassingValues obj1, PassingValues obj2){
        int temp;
        temp = obj1.ID;
        obj1.ID = obj2.ID;
        obj2.ID = temp;
    }


    public static void main(String args[]){
//        make two objects
        PassingValues object1 = new PassingValues(20);
        PassingValues object2 = new PassingValues(10);
        System.out.println("Values of ID's before interchanging: "+ object1.ID + " "+ object2.ID);
        object1.swap(object1,object2);
        System.out.println("Values of ID's: "+ object1.ID + " "+ object2.ID);
    }

}
