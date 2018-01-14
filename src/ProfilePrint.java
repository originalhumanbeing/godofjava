/**
 * Created by Hyunjung on 2018. 1. 10..
 */
public class ProfilePrint {
    byte age = 0;
    String name = "";
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public static void main (String [] args) {
        ProfilePrint profile = new ProfilePrint();

        profile.setAge((byte)30);
        profile.setMarried(false);
        profile.setName("Hyunjung");

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }
}
