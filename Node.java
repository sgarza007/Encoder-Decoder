//author:Saul Garza
public class Node
{
        private int item;
        private Node next;
        public Node(int newItem)
        {
                item=newItem;
                next=null;
        }
        public Node(int newItem,Node newNode)
        {
                item=newItem;
                next=newNode;
        }
        public int getItem()
        {
                return item;
        }
        public Node getNext()
        {
                return next;
        }
        public void setItem(int newItem)
        {
                item=newItem;
        }
        public void setNext(Node newNode)
        {
                next=newNode;
        }
}
