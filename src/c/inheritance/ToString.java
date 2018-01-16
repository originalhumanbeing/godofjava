package c.inheritance;

/**
 * Created by Hyunjung on 2017. 10. 30..
 */
public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus "+obj);
    }

    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus "+this);
    }

    public String toString() {
        return "ToString class";
    }
}
