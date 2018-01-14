package c.inner;

import java.util.EventListener;

/**
 * Created by Hyunjung on 2017. 10. 31..
 */
public class MagicButton {
    public MagicButton() {

    }
    private EventListener listener;
    public void setListener(EventListener listener) {
        this.listener = listener;
    }
//    public void onClickProcess() {
//        if(listener!=null) {
//            listener.onClick();
//        }
//    }
}
