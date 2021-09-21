package linkedlist;

import java.util.Objects;

/**
 * description: Jesopfu <br>
 * date: 2021/8/6 0:00 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class Josepfu {
    public static void main(String[] args) {
        CircleNode a1 = new CircleNode(1, "a1");
        CircleNode a2 = new CircleNode(2, "a2");
        CircleNode a3 = new CircleNode(3, "a3");
        CircleNode a4 = new CircleNode(4, "a4");
        CircleNode a5 = new CircleNode(5, "a5");
        CircleSingleLinkedList cc = new CircleSingleLinkedList();
        cc.add(a1);
        cc.add(a2);
        cc.add(a3);
        cc.add(a4);
        cc.add(a5);
        cc.show();
        System.out.println("===============================");
        cc.delete(1,2);
    }
}

class CircleSingleLinkedList{
    public CircleNode first;
    public void add(CircleNode circleNode){
        if(first == null){
            first = circleNode;
            first.next = circleNode;
        }else{
            /*  first
            CircleNode temp = first.next;
            first.next = circleNode;
            first.next.next = temp;*/
            CircleNode temp = first;
            while (!Objects.equals(temp.next,first)){
                temp = temp.next;
            }
            temp.next = circleNode;
            circleNode.next = first;
        }
    }

    public void delete(int num,int times){
        int count = 0;
        CircleNode temp = first;
        if(temp == null){
            System.out.println("LinkedList Is Empty!");
            return;
        }
        while (true){
            count++;
            if(count == num){
//                System.out.println(temp);
                break;
            }
            temp = temp.next;
        }
        count = 0;
        while(true){
            if(temp.next == temp){
                System.out.println(temp);
                break;
            }
            count++;
            if(count == times -1){
//                System.out.println(temp);
                System.out.println(temp.next);
                temp.next = temp.next.next;
                count = 0;
                temp = temp.next;
                continue;
            }
            temp = temp.next;
        }
    }

    public void show(){
        CircleNode temp = first;
            while (Objects.nonNull(temp)){
                System.out.println(temp);
                temp = temp.next;
                if(Objects.equals(temp,first)){
                    break;
                }
            }
    }
}
class CircleNode{
    public int id;
    public String name;
    public CircleNode next;

    public CircleNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleNode that = (CircleNode) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "CircleNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
