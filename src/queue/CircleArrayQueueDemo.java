package queue;

/**
 * description: CircleArrayQueueDemo <br>
 * date: 2021/7/15 23:48 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArrayQueueDemo circleArrayQueue = new CircleArrayQueueDemo(5);
        for (int i = 0; i < 5; i++) {
//           circleArrayQueue.removeElement();
           circleArrayQueue.addElement(i);
        }
        circleArrayQueue.print();
        System.out.println(circleArrayQueue.currentSize());
        System.out.println("==============================");
        for (int i = 0; i < 3; i++) {
            circleArrayQueue.removeElement();
        }
        circleArrayQueue.print();
        System.out.println(circleArrayQueue.currentSize());
        System.out.println("==============================");
        for (int i = 0; i < 5; i++) {
//           circleArrayQueue.removeElement();
            circleArrayQueue.addElement(i);
        }
        circleArrayQueue.print();
        System.out.println(circleArrayQueue.currentSize());
        System.out.println("==============================");
        for (int i = 0; i < 3; i++) {
            circleArrayQueue.removeElement();
        }
        circleArrayQueue.print();
        System.out.println(circleArrayQueue.currentSize());
    }
    int rear;
    int front;
    int [] arr;
    int size;
    public CircleArrayQueueDemo(int size){
        this.size = size+1;
        this.arr = new int[size+1];
    }
    private boolean isEmpry(){
        return rear == front;
    }
    private boolean isFull(){
        return (rear - front + 1)%size == 0;
    }
    private boolean addElement(int element){
        if(isFull()){
            System.out.println("队列已满！");
            return false;
        }
        arr[rear] = element;
            rear = (rear+1)%size;
        return true;
    }
    private boolean removeElement(){
        if(isEmpry()){
            System.out.println("队列为空！");
            return false;
        }
            front = (front+1)%size;
        return true;
    }
    private void print(){
        for (int i = front; i < front + currentSize(); i++) {
            System.out.println(arr[i%size]);
        }
    }
    private int currentSize(){
        return (rear - front + size)%size;
    }
}
