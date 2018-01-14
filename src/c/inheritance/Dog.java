package c.inheritance;

/**
 * Created by Hyunjung on 2018. 1. 14..
 */
public class Dog extends Animal {
    public Dog() {
        System.out.println("Dog here!");
    }

    public void move(int distance, String direction) {
        System.out.println("dog moved "+distance+"steps to "+direction+" and he was really fast");
    }

    public void bark(int limit) {
        for(int count=1; count<limit; count++) {
            System.out.println("dog barks!");
        }
    }
}
