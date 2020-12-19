import java.util.LinkedList;

public class LinkedQueue<T> extends AbstractQueue<T>  {
    public LinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override

    public T peek() {
        if(queue == null) {
            return null;
        }else{
            return queue.get(0);
        }
    }

    @Override
    public T poll() {
        if (queue == null)
            return null;
        T element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public boolean offer(T element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }
}
