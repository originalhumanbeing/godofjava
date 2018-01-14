package c.inner;

/**
 * Created by Hyunjung on 2017. 10. 31..
 */
public class OuterOfInner {
    class Inner {
        private int value = 0;
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
