import java.util.*;

public class ll1 {
 Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=next;
        }
    }
   


public void addfirst(String data){
    Node nn = new Node(data);
    if(head==null){
        head = nn;
        return;
    }
    nn.next=head;
    head=nn;
}

public void addlast(String data){
    Node nn = new Node(data);
    if(head==null){
        head = nn;
        return;
    }
    Node cn=head;
    while(cn.next!=null){
        cn=cn.next;
    }
    cn.next=nn;
}


public void printlist(){
    if(head==null){
        System.out.println("list is empty");
    }
   
    Node cn = head;
    while(cn!=null){
        System.out.print(cn.data + " ");
        cn=cn.next;
    }
    System.out.println("");
}
public static void main(String args[]){

    ll1 list= new ll1();

     list.addfirst("hey");
    
   
    list.addlast("this");
     list.addlast("is");
      list.addlast("linked");
       list.addlast("list");

       list.printlist();

}
}