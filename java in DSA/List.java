
public class List {
  public static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int  size;

  public void AddFrist1(int data){
    Node newnode=new Node(data);
    if(head==null){
      head=tail=newnode;
      newnode.next=null;
      size++;
      return;
    }
    newnode.next=head;
    head=newnode;
    size++;
  }
  
  public void add(int idx,int data ){
    Node newnode=new Node(data);
    if(head==null){
      head=tail=newnode;
      newnode.next=null;
      size++;
      return;
    }
    Node temp=head;
    for(int i=0;i<idx-1;i++){
      temp=temp.next;
    }
    newnode.next=temp.next;
    temp.next=newnode;
    size++;
  }
  public int RemoveFrist1(){
    int val=head.data;
    if(size==0){
      System.out.println("he list is empty");
      return Integer.MIN_VALUE;
    }
    if(size==1){
      head=tail=null;
      size=0;
      return val;
    }
    Node temp=head.next;
    head.next=null;
    head=temp;
    size--;
    return val;
  }
  public int removeLast1(){
    int val=tail.data;
    if(size==0){
      System.out.println("he list is empty");
      return Integer.MIN_VALUE;
    }
    if(size==1){
      head=tail=null;
      size=0;
      return val;
    }
    Node temp=head;
    
    for(int i=0;i<size-2;i++){
      temp=temp.next;
    }
    temp.next=null;
    size--;
    return val;
  
  }
  public void print(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"=>");
        temp=temp.next;
    }
    System.out.println("null");
  }
  public int isSesrch(int key){
    Node temp=head;
    int i=0;
    if(temp.data==key){
      return i;
    }
    while (temp !=null) {
      if(temp.data==key){
        return i;
      }
      temp=temp.next;
      i++;
    }
    return -1;
  }

    public int recarsivSearch(int key, Node head){
      if(head==null){
        return -1;
      }
      if(head.data==key){
        return 0;
      }
      int idx=recarsivSearch(key, head.next);
      if(idx==-1){
        return-1;
      }
      return idx+1;
    }
     
    public void reverse(){
      Node curr=tail=head;
      Node pre=null;
      Node next;
      while (curr!=null) {
         next=curr.next;
         curr.next=pre;
         pre=curr;
         curr=next;
      }
      head=pre;
    }
    public void removeNthNode(int n){
      if(n==size){
        head=head.next;
        return;
      }
      Node temp=head;
      for(int i=1;i<=size-n-1;i++){
        temp=temp.next;
      }
     
      temp.next=temp.next.next;
    }
      // slow fast aproch to find the mid
    public Node midNode(){
      Node slow=head;
      Node fast=head;
      while (fast != null && fast.next !=null) {
        slow=slow.next;
        fast=fast.next.next;
      }
     
      return slow;
    }

     public boolean isPlandrom(){
      if(head==null && head.next==null){
        return true;
      }
      //find mid 
     Node mid=midNode();
     // reverse the half list
       Node prNode=null;
       Node curr=mid;
       Node next;
       while (curr != null) {
          next=curr.next;
          curr.next=prNode;
            prNode=curr;
            curr=next;
       }
       Node right=prNode;
       Node left=head;
       while(right !=null ){
         if(right.data!=left.data){
          return false;
         }
         left=left.next;
         right=right.next;
       }
       return true;
     }

       public boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast !=null && fast.next !=null){
          slow=slow.next;
          fast=fast.next.next;
          if(slow == fast){
            return true;
          }
        }
        return false;
       }

       public void RemoveCycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast !=null && fast.next !=null){
          slow=slow.next;
          fast=fast.next.next;
          if(slow == fast){
            cycle=true;
            break;
          }
        }
        if(cycle==false){
          return;
        }
          slow=head;
            Node pre=null;
            while(slow!=fast){
              pre=fast;
              slow=slow.next;
              fast=fast.next; 
        }
        pre.next=null;
       }





       public void addLast1(int data){
        Node NewNode=new Node(data);
        if(head==null){
          head=tail=NewNode;
          NewNode.next=null;
          size++;
          return;
        }
        tail.next=NewNode;
        tail=NewNode;
        
        size++;
      }
    public static void main(String[] args) {
        List lk=new List();
        // lk.AddFrist1(5);
        // lk.AddFrist1(4);
        // lk.AddFrist1(3);
        // lk.AddFrist1(2);
        // lk.AddFrist1(1);
       
        
       
        

        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
      
      //  int key=1;
      //  Node temp=head;
      // System.out.println(lk.recarsivSearch(key,temp));
      // lk.reverse();
      // lk.removeNthNode(2);
      // System.out.println(lk.size);
      // lk.print();
      // System.out.println(lk.midNode());
      // System.out.println(lk);
              lk.RemoveCycle();
              // lk.print();
        System.out.println(lk.iscycle());
    }
}
