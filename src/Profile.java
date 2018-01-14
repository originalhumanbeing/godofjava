/**
 * Created by Hyunjung on 2018. 1. 8..
 */
public class Profile {
    String name = "";
    int age;

    public static void main(String [] args) {
        Profile myProfile = new Profile();
        myProfile.setName("Min");
        myProfile.setAge(20);
        myProfile.printName();
        myProfile.printAge();
//        String nameName = myProfile.sayMyName("hyunjung");
//        String ageAge = myProfile.sayMyAge(30);
//        System.out.println(nameName+"\n"+ageAge);
    }

    public void setName(String str) {
        name = str;
    }
//    public String sayMyName(String name) {
//        return "My name is"+' '+name;
//    }

    public void setAge(int val) {
        age = val;
    }

    public void printName() {
        System.out.println("my name is "+name);
    }

    public void printAge() {
        System.out.println("my age is "+age);
    }
//    public String sayMyAge(int age) {
//        return "My age is"+' '+age;
//    }
}
