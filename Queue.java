{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\csgenericrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720\ri0\partightenfactor0

\f0\fs22 \cf2 import java.io.*;\
public class Queue\
\{\
        private Node r;\
        public Queue()\
        \{\
                r=null;\
        \}\
        public boolean IsEmpty()\
        \{\
                return (r==null);\
        \}\
        public void enqueue(int newItem)\
        \{\
                Node newNode=new Node(newItem);\
                if(IsEmpty())\
                \{\
                        newNode.setNext(newNode);\
                        r=newNode;\
                \}\
                else\
                \{\
                        newNode.setNext(r.getNext());\
                        r.setNext(newNode);\
                        r=newNode;\
                \}\
        \}\
        public int dequeue()\
        throws RuntimeException\
        \{\
                if(!IsEmpty())\
                \{\
                        Node temp=r.getNext();\
                        if(temp==r)\
                        \{\
                                r=null;\
                        \}\
                        else\
                        \{\
                                r.setNext(temp.getNext());\
                        \}\
                        return temp.getItem();\
                \}\
                else\
                \{\
                        throw new RuntimeException();\
                \}\
        \}\
        public int peek()\
        throws RuntimeException\
        \{\
                if(!IsEmpty())\
                \{\
                        return (r.getNext().getItem());\
\
                \}\
                else\
                \{\
                        throw new RuntimeException();\
                \}\
        \}\
\}\
}