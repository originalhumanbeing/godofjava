package c.inheritance;

import java.lang.reflect.Member;

/**
 * Created by Hyunjung on 2017. 10. 30..
 */
public class Equals {
    public static void main(String[] args) {
        Equals thisObject = new Equals();
        thisObject.equalMEthod();
        thisObject.equalMethod2();
    }
    public void equalMEthod() {
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1==obj2){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
    public void equalMethod2() {
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1.equals(obj2)) {
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
