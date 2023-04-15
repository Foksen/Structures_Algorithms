import java.util.ArrayList;

public class MyHashSet<T> {
    private final ArrayList<ArrayList<T>> array;
    private final int capacity;

    public MyHashSet(int capacity) {
        this.capacity = capacity;
        array = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; ++i) {
            array.add(new ArrayList<>());
        }
    }

    public void add(T n) {
        int hCode = Math.abs(n.hashCode() % capacity);
        if (!array.get(hCode).contains(n)) {
            array.get(hCode).add(n);
        }
    }

    public boolean contains(T n) {
        int hCode = Math.abs(n.hashCode() % capacity);
        return array.get(hCode).contains(n);
    }

    public void remove(T n) {
        int hCode = Math.abs(n.hashCode() % capacity);
        array.get(hCode).remove(n);
    }
}
