package linkedlist;

/**
 * description: SingleLinkedList <br>
 * date: 2021/8/4 0:22 <br>
 * author: lgc <br>
 * version: 1.0 <br>
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        PersonNode a1 = new PersonNode(7, "a1");
        PersonNode a2 = new PersonNode(2, "a2");
        PersonNode a3 = new PersonNode(6, "a3");
        PersonNode a4 = new PersonNode(4, "a4");
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(a1);
        singleLinkedList.addByOrder(a2);
        singleLinkedList.addByOrder(a3);
        singleLinkedList.addByOrder(a4);
        singleLinkedList.showLinkedList();
    }
}

class SingleLinkedList{
    PersonNode headNode = new PersonNode(0,"");

    public  void add(PersonNode personNode){
        PersonNode temp = headNode;
        while(true){
            if(temp.next == null){
                break;
            }
                temp = temp.next;
        }
        temp.next = personNode;
    }

    public void addByOrder(PersonNode personNode){
        PersonNode temp = headNode;
        while (true){
            if(temp.next == null){
                temp.next = personNode;
                break;
            }else if(temp.next.id > personNode.id ){
                personNode.next = temp.next;
                temp.next = personNode;
                break;
            }
            temp = temp.next;
        }
    }

    public void showLinkedList(){
        PersonNode temp = headNode.next;
         while(true){
             if(temp == null){
                 break;
             }else{
                 System.out.println(temp);
                 temp = temp.next;
             }
         }
    }
}
class PersonNode{
    int id;
    String name;
    PersonNode next;
    public PersonNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
