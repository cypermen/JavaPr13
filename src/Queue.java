public interface Queue<T> {
    T peek();
    T poll();
    T remove();
    boolean offer(T element);
    T element();
    boolean isEmpty();
}



