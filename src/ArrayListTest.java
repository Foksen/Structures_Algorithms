import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public ArrayListTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println(arrayList.get(1));           // get() - доступ к элементу по индексу
        System.out.println(arrayList.size());           // size() - вывод размера
        System.out.println(arrayList.toString());       // Преобразовать в строку (arrayList делает это автоматом)
        arrayList.add(1, 999);             // add(index, elem) - вставить элемент по индексу
        System.out.println(arrayList);                  // Для arrayList автоматически вызывается toString()

        Collections.sort(arrayList);                    // Collections - класс для работы со структурами данных
                                                        // Arrays - класс для стандартных массивов
        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        System.out.println(arrayList.indexOf(20));      // Найти индекс первого элемента с заданным значением

        arrayList.set(1, 400);              // Изменить элемент по индексу
        for (var num : arrayList) {         // var - аналог auto в плюсах
            System.out.println(num);
        }

        arrayList.clear();                              // Очистка
        System.out.println(arrayList);
    }
}
