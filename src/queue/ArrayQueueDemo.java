package queue;

/**
 * description: ArrayQueueDemo <br>
 * date: 2021/7/14 0:13 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(10);
        for (int i = 0; i <20 ; i++) {
            arrayQueue.addQueue(i);
        }
        arrayQueue.print();

        for (int i = 0; i <5 ; i++) {
            arrayQueue.takeQueue();
        }
        arrayQueue.print();
    }
}
class ArrayQueue{
    private int front;
    private int rear;
    private int maxSize;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
    }

    public boolean addQueue(int element){
        if(rear == maxSize){
            return false;
        }
        arr[rear++] = element;
        return true;
    }
    public boolean takeQueue(){
        if(front == rear){
            return false;
        }
        front++;
        return true;
    }

    public void print(){
        for (int i = front; i < rear; i++) {
            System.out.println(arr[i]);
        }
    }

}
