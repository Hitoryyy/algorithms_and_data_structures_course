package Home_Work_4;

import java.util.Iterator;

public interface ListIterator<T> extends Iterator<T> {
    void reset();
    boolean atEnd();
    boolean atBegin();
    T deleteCurrent();
    void insertAfter(T c);
    void insertBefore(T c);
    T getCurrent();
}
