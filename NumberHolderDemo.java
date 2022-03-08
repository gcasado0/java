
/*Given the following class, called NumberHolder,
write some code that creates an instance of the class,
initializes its two member variables,
and then displays the value of each member variable.*/

public class NumberHolderDemo {
    public static void main(String[] args) {
        NumberHolder n1 = new NumberHolder();
        n1.anInt = 1;
        n1.aFloat = 2.5f;
        System.out.println("integer: "+n1.anInt);
        System.out.println("float: "+n1.aFloat);

    }
    
}
