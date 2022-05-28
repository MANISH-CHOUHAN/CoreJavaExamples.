package com.ksj.sixthclass;

public class LinkedListImplementation {
    Node head;

    public void insert(int x) {
        Node new1 = new Node(x);
        if (head == null) {
            head = new1;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = new1;
        }


    }
    public void print()
    {
        Node temp= head;
        while (temp.next!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println(temp.value);
    }

    public void insertAfter(int insertAftervalue, int valueToInsert)
    {
      Node newNode=new Node(valueToInsert);
      Node tempNode=head;
      while (tempNode.next!=null)
      {

          if(tempNode.value==insertAftervalue)

          {
            newNode.next=tempNode.next;
            tempNode.next=newNode;

          }
          tempNode=tempNode.next;

      }
    }

    public void delete(int x)
    {
Node previousNode=head;
Node currentNode=head;
if (x==head.value)
{
    head=head.next;
}
    }

    public static void main(String[] args) {
        LinkedListImplementation ls=new LinkedListImplementation();
        ls.insert(2);
        ls.insert(3);
        ls.insert(4);
        ls.print();
        ls.insertAfter(2,6);
        ls.print();
        ls.delete(2);
        ls.print();

    }

}
