import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements; // Массив для хранения элементов [cite: 28]
    private int size;
    public MyArrayList() {
        this.elements = new Object[10];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

}