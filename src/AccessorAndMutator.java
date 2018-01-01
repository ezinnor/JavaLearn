public class AccessorAndMutator {
    private String name;
    private int age;

    AccessorAndMutator(){
        this("Pradeep", 22);
        this.access();
    }

    public AccessorAndMutator(String name, int i) {
        this.name = name;
        this.age = i;
    }

    private void access(){
        System.out.println("The name and age are: "+ name +" "+ age);
    }
    //Accessor methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Mutator methods.
    public void setName(String s){
        this.name = s;
    }
    public void setAge(int i){
        this.age = i;
    }

    public static void main(String args[]){
        AccessorAndMutator pradeep = new AccessorAndMutator();

//        calling accessor and mutator methods.
        pradeep.setName("Pradeep Choudhary");
        pradeep.setAge(22);

        System.out.println(pradeep.getName());
        System.out.println(pradeep.getAge());

    }
}
