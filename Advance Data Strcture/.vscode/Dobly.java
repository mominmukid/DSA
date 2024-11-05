  
  public class Dobly {
     static class Node {
          int data;
          Node next;
          Node pre;
          public Node(int data){
            this.data=data;
            this.next=null;
            this.pre=null;
          }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static Node pre;

    public void addfst(int data){
        Node newNode=new Node (data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
         newNode.next=head;
         head.pre=newNode;
         head=newNode;   
         size++;
    }
    public void addlst(int data){
      Node newNode=new Node (data);
      if(head ==null){
        addfst(data);
        return;
      }
      tail.next=newNode;
      newNode.pre=tail;
      tail=newNode;
      size++;
    }
    public int removefst(){
      int val=head.data;
      if(head==null){
        size=0;
        return Integer.MIN_VALUE;
       
      }
      if(size==1){
        head=tail=null;
        return Integer.MIN_VALUE;
      }
      Node temp=head.next;
       head=temp;
       head.pre=null;
       size--;
       return val;
    }

    public int removelst(){
      int val=tail.data;
      if(head==null){
        size=0;
        return Integer.MIN_VALUE;
      }
      if(size==1){
        head=tail=null;
        return Integer.MIN_VALUE;
      }
      Node temp=tail.pre;
      tail=temp;
      tail.next=null;
      size--;
      return val;
    }

     public void print(){
      if(head== null){
        System.out.println("the list is empty");
      }
      System.out.print("null<->");
          Node temp =head;
          while (temp !=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
          }
          System.out.println("null");
     }

     public void reverse(){
     Node pre=null;
     Node curr=head;
     Node next;
     while (curr !=null) {
      next=curr.next;
      curr.next=pre;
      curr.pre=next;
      pre=curr;
      curr =next;
     }
      head=pre;
     }
    public static void main(String[] args) {
        Dobly dl=new Dobly();
        
        dl.addlst(1);
        dl.addlst(2);
        dl.addlst(3);
        dl.addlst(4);
        dl.addlst(5);
       dl.reverse();
      // System.out.println( dl.removefst());
      //  System.out.println( dl.removefst()+" " +dl.removelst());
       dl.print();
    }
    
}