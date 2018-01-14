/**
 * Created by Hyunjung on 2018. 1. 11..
 */
public class ManageHeight {

    int gradeHeights[][];

    public static void main(String[] args) {
        ManageHeight manager = new ManageHeight();
        manager.initData();

//        for (int i=0; i<5; i++) {
//            System.out.println("Class No.: "+(i+1));
//            manager.printHeight(i);
//        }
        int count = 0;
        while (count < 5) {
            System.out.println("Class No.: " + (count + 1));
            manager.printAverage(count);
            count++;
        }
    }

    public void initData() {
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }

    public void printHeight(int classNo) {
        int length = gradeHeights[classNo].length;
        for (int j = 0; j < length; j++) {
            System.out.println(gradeHeights[classNo][j]);
        }
    }

    public void printAverage(int classNo) {
        double total = 0;
        int length = gradeHeights[classNo].length;
        for (int k = 0; k < length; k++) {
            total += gradeHeights[classNo][k];
        }
        double ave = total / length;
        System.out.println(ave);
    }
}
