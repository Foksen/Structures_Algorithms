public class MyHasSetTest {
    public MyHasSetTest() {
        MyHashSet<Integer> myHashSet = new MyHashSet<>(10);
        myHashSet.add(512);
        myHashSet.add(9802342);
        myHashSet.add(742);
        myHashSet.add(-582);
        System.out.println(myHashSet.contains(-582));
    }
}
