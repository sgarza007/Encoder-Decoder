{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf830
{\fonttbl\f0\fnil\fcharset0 Menlo-Regular;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red255\green255\blue255;}
{\*\expandedcolortbl;;\csgenericrgb\c0\c0\c0;\csgenericrgb\c100000\c100000\c100000;}
\margl1440\margr1440\vieww28600\viewh18000\viewkind0
\deftab720
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab720\ri0\partightenfactor0

\f0\fs22 \cf2 \cb3 public class Node\
\{\
        private int item;\
        private Node next;\
        public Node(int newItem)\
        \{\
                item=newItem;\
                next=null;\
        \}\
        public Node(int newItem,Node newNode)\
        \{\
                item=newItem;\
                next=newNode;\
        \}\
        public int getItem()\
        \{\
                return item;\
        \}\
        public Node getNext()\
        \{\
                return next;\
        \}\
        public void setItem(int newItem)\
        \{\
                item=newItem;\
        \}\
        public void setNext(Node newNode)\
        \{\
                next=newNode;\
        \}\
\pard\pardeftab720\ri0\sl480\slmult1\partightenfactor0
\cf2 \}}