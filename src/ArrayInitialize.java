/**
 * Created by Hyunjung on 2017. 10. 23..
 */
public class ArrayInitialize {
    static String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "August", "September", "Oct", "Nov", "Dec"};

    public static void main(String[] args) {
        ArrayInitialize array = new ArrayInitialize();
        System.out.println(array.getMonth(3));
    }

    public String getMonth(int monthInt) {

        return month[monthInt+1];
    }
}
