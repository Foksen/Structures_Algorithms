import java.util.Arrays;
import java.util.Random;

public class ArraysTest {       // Arrays - класс для работы с массивами
    public ArraysTest() {
        Integer[] e = new Integer[10];
        java.util.Arrays.fill(e, 1000);     // fill - заполнить массив значениями
        System.out.println(java.util.Arrays.toString(e));   // toString - преобразовать массив в строку

        Random random = new Random();
        Integer[] f = new Integer[10];
        for (int i = 0; i < f.length; ++i) {
            f[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(f));
        Arrays.sort(f);         // Фун-я сортировки
        System.out.println(Arrays.toString(f));

        System.out.println(Arrays.binarySearch(f, 15));     // Бинарный поиск числа в массиве (должен быть отсортирован)
        System.out.println(Arrays.equals(e, f));                // Сравнивает 2 массива по содержимому

        Arrays.sort(f, new LastDigitComp());            // Компоратор
        System.out.println(Arrays.toString(f));
        /*
        Arrays.sort(f, new Comparator<Integer>() {      // Анонимный класс
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        Arrays.sort(f, (o1, o2) -> {                    // Анонимная фун-я
        });
         */
    }
}
