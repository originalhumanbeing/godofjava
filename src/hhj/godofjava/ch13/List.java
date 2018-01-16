package hhj.godofjava.ch13;

/**
 * Created by Hyunjung on 2018. 1. 16..
 */
public interface List {
    public void add();
    public void update(int index, Object value);
    public void remove(int index);
    public Object search (int index);
}
