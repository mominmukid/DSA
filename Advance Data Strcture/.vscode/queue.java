import java.util.*;


public class queue {
    public static void printzigzag(Queue<Integer> q){
        Queue<Integer>q2=new LinkedList<>();
        int n=q.size()/2;
        for(int i=0;i<n;i++){
            q2.add(q.remove());
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }
        
    }
  public static void reerseq(Queue<Integer>q){
    Stack<Integer>s=new Stack<>();
    while (!q.isEmpty()) {
        s.add(q.remove());
    }
    while (!s.isEmpty()) {
        q.add(s.pop());
    }
   
  }


  
    public static void main(String args[]){
        Deque<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        // reerseq(q);
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }
        System.out.println(q);
    }
}
