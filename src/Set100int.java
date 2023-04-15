public class Set100int {
    private boolean array[] = new boolean[101];
    public void add(int index) {
        array[index] = true;
    }
    public boolean contains(int index) {
        return array[index];
    }
    public void remove(int index) {
        array[index] = false;
    }
}
