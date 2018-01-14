/**
 * Created by Hyunjung on 2018. 1. 8..
 */
public class Calculator2 {
    public static void main(String [] args) {
        Calculator2 cal = new Calculator2();

        int a = 2;
        int b = 3;

        int addedAnswer = cal.add(a, b);
        int subtractedAnswer = cal.subtract(a, b);
        int devidedAnswer = cal.devide(a, b);
        int multipledAnswer = cal.multiple(a, b);

        System.out.println(a+"+"+b+"="+addedAnswer+"\n"+
                a+"-"+b+"="+subtractedAnswer+"\n"+
                a+"/"+b+"="+devidedAnswer+"\n"+
                a+"*"+b+"="+multipledAnswer+"\n");
    }

    public int add (int a, int b) {
        return a+b;
    }

    public int subtract (int a, int b) {
        return a-b;
    }

    public int devide (int a, int b) {
        return a/b;
    }

    public int multiple (int a, int b) {
        return a*b;
    }
}
