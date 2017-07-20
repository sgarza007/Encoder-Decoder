import java.io.*;
public class Queue
{
        private Node r;
        public Queue()
        {
                r=null;
        }
        public boolean IsEmpty()
        {
                return (r==null);
        }
        public void enqueue(int newItem)
        {
                Node newNode=new Node(newItem);
                if(IsEmpty())
                {
                        newNode.setNext(newNode);
                        r=newNode;
                }
                else
                {
                        newNode.setNext(r.getNext());
                        r.setNext(newNode);
                        r=newNode;
                }
        }
        public int dequeue()
        throws RuntimeException
        {
                if(!IsEmpty())
                {
                        Node temp=r.getNext();
                        if(temp==r)
                        {
                                r=null;
                        }
                        else
                        {
                                r.setNext(temp.getNext());
                        }
                        return temp.getItem();
                }
                else
                {
                        throw new RuntimeException();
                }
        }
        public int peek()
        throws RuntimeException
        {
                if(!IsEmpty())
                {
                        return (r.getNext().getItem());

                }
                else
                {
                        throw new RuntimeException();
                }
        }
}
