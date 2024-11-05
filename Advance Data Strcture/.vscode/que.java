import java.util.Deque;
import java.util.LinkedList;

public class que {
    // static class stack {
    //     Deque<Integer>q=new LinkedList<>();

    //     public boolean isEmpty(){
    //         return q.size()==0;
    //     }
    //     public void push(int data){
    //         q.addLast(data);
    //     }
    //     public int pop(){
    //         return q.removeLast();
    //     }
    //     public int peek(){
    //         return q.getLast();
    //     }
    // }
    public static class queue {
         Deque<Integer>d=new LinkedList<>();

         public boolean isEmpty(){
           return d.isEmpty();
         }
         public void push(int data){
            d.addLast(data);
         }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
       queue s=new queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.remove();
        while (!s.isEmpty()) {
            System.out.print(s.remove()+" ");

        }

    }
    
}
