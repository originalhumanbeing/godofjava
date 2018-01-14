import java.util.Arrays;

/**
 * Created by Hyunjung on 2018. 1. 11..
 */
public class ReferenceReturn2 {
    int returnInt = 0;

    public static void main(String[] args) {
//        ReferenceReturn2 ref = new ReferenceReturn2();
//        System.out.println("intReturn :" + ref.intReturn());
//        System.out.println("intReturn :" + ref.intReturn());

//        long a = 100000L;
//        a = callByValueTest(a);
//        System.out.println(a);

//        LongValue b = new LongValue(10000000L);
//        System.out.println(b.getVal() + "|"+ b.toString());
//        callByRefTest(b);
//        System.out.println(b.getVal());

        System.out.printf("%d + %d = %d %s", 1, 2, 1+2, "desc");
    }

    public int intReturn() {
        return returnInt++;
    }

    public static long callByValueTest(long longValue) {
        longValue += 100;
        return longValue;
    }

    public static void callByRefTest(LongValue longValue) {
        System.out.println(longValue.toString());
        longValue.setVal(longValue.getVal()+100);
    }


    public static void printAll(double aaa, long ... args) {
        for(long it : args) {
            System.out.println(it);
        }
    }




}

class LongValue {
    private long val;

    public long getVal() {
        return val;
    }

    public void setVal(long val) {
        this.val = val;
    }

    public LongValue(long val) {
        this.val = val;
    }
}