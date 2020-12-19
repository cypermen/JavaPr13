import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("Тестирование очереди на списке");
        LinkedQueue<Integer> lq = new LinkedQueue<>();
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        System.out.println("Пуста ли очередь - " + lq.isEmpty());
        lq.addAll(al);
        System.out.println("Пуста ли очередь - " + lq.isEmpty());
        System.out.println("Добавление в очередь");
        System.out.println(lq.offer(6));//добавляет элементы 6,7 в конец очереди. Если элемент удачно добавлен
        System.out.println(lq.offer(7));//возвращает true, иначе - false
        System.out.println(lq);
        System.out.println("Размер очереди - " + lq.size());
        System.out.println("Элемент из начала очереди - " + lq.peek());
        System.out.println("Удалённый элемент из начала очереди - " + lq.poll());
        System.out.println(lq + "\n\n");

        System.out.println("Тестирование очереди на массиве");
        ArrayQueue<Integer> aq = new ArrayQueue<>();
        System.out.println("Пуста ли очередь - " + aq.isEmpty());
        System.out.println("Добавление в очередь");
        System.out.println(aq.offer(1));
        System.out.println(aq.offer(2));
        System.out.println(aq.offer(3));
        System.out.println(aq);
        System.out.println("Размер очереди - " + aq.size());
        System.out.println("Элемент из начала очереди - " + aq.peek());
        System.out.println("Удалённый элемент из начала очереди - " + aq.poll());
        System.out.println(aq + "\n\n");
    }
}
