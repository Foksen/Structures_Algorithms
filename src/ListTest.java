import java.util.*;

public class ListTest {
    public ListTest() {
        Queue<String> queue = new ArrayDeque<>();
        Stack<String> stack = new Stack<>();
        String[] strings = {"first", "second, third, fourth, fifth"};
        for (String str : strings) {
            queue.add(str);
            stack.push(str);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");        // .peek() - посмотреть первый элемент
        }
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
