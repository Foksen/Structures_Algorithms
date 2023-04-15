public class DefaultArrayTest {
    public DefaultArrayTest() {
        int[] a = {1, 2, 3, 4, 5};      // Стандартный масств в Java
        int[] b = a.clone();            // Чтобы скопировать не ссылку, а содержимое массива используем .close()
                                        // Копировать каждый элемент через цикл - дольше. Используем .close() или arraycopy()
        a[2] = 99;
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; ++i) {
            System.out.println(b[i] + " ");
        }

        System.out.println();

        int[] c = {1, 2, 3, 4, 5};
        int[] d = c;
        c[2] = 99;
        for (int i = 0; i < a.length; ++i) {
            System.out.println(c[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; ++i) {
            System.out.println(d[i] + " ");
        }
    }
}
