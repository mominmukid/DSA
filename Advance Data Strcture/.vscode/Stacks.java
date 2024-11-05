import java.util.*;

public class Stacks {
    
    
    //     public static  ArrayList<Integer>list=new ArrayList<>();
    //    public static boolean isempty(){
    //         return list.size()==0;
    //     }

    //     public void push(int data){
    //         list.add(data);
    //     }
    //     public int pop(){
    //         if(isempty()){
    //             return -1;
    //         }
    //         int top =list.get(list.size()-1);
    //         list.remove(list.size()-1);
    //         return top;
    //     }
    //     public int peek(){
    //         if (isempty()) {
    //             return -1;
    //         }
    //       int top =list.get(list.size()-1);
    //       return top;
    //     }
        public static class Node {
             int data;
             Node next;
             public Node(int data){
                this.data=data;
                this.next=null;
             }    
    }
    public static class Stack {
        public static Node head=null;     
        public static boolean isempty(){
            return head==null;
        }

        public void push(int data){
            Node newNode=new Node(data);
            if(isempty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isempty()){
                return-1;
            }
            int val=head.data;
             head=head.next;
            return val;
        }
        public int peek(){
            if (isempty()) {
                return -1;
            }
            int val=head.data;
            return val;
        }
    }

    public static void main(String[] args){
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
       while (!st.isempty()) {
        System.out.println(st.peek());
        st.pop();
       }
    }
}