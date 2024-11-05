
public class LinkedList{
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
    public Node marge(Node left,Node right){
        Node marges= new Node(-1);
        Node temp=marges;
        while(left !=null && right !=null){
            if(left.data < right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left !=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right != null){
            temp.next =right;
            right=right.next;
            temp=temp.next;
        }
       
        return marges.next;
    }

    public Node isMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public  Node issort(Node head){
        if(head == null || head.next==null){
            return head;
        }
        //find the mid 
         Node mid=isMid(head);
        //right part
          Node right=mid.next;
          mid.next=null;
      //left part
          Node leftside=issort(head);
          Node rightside=issort(right);
          return marge(leftside,rightside);

    }

      public void zigzag(Node head){
        // finding the mid
        Node mid=isMid(head);
        //reverse the second half
        Node pre=null;
        Node curr=mid.next;
        mid.next=null;
        Node nex;
        while(curr !=null){
          nex=curr.next;
          curr.next=pre;
          pre=curr;
          curr=nex;
        }
         Node rh=pre;
         Node lh=head;
         Node leftnext=null;
         Node rightnext=null;
         while(rh != null && lh != null){
             leftnext=lh.next;
             lh.next=rh;
             rightnext=rh.next;
             rh.next=leftnext;
             lh=leftnext;
             rh=rightnext;
         }
      }
          public void renoveMN(int m,int n){
            Node temp=head;
            for(int i=0;i<n-1;i++){
              temp=temp.next;
            }
            for(int i=0;i<n;i++){
            temp.next=temp.next.next;
           
            size--;
            }
            Node tem=head;
            for(int i=0;i<size-m-1;i++){
                tem=tem.next;
            }
            tem.next=null;
          }

          public void swap(int x,int y){
            if(head== null || head.next ==null || x==y){
              return;
            }
            Node preX=null;
            Node currX=head;
            while(currX !=null && currX.data ==x){
              preX=currX;
              currX=currX.next;
            }
            Node currY=head;
            Node preY=null;
            while(currY !=null || currY.data ==y){
              preY=currY;
              currY=currY.next;
            }
              preX.next=currY;
              Node temp=currY.next;
              currY.next=currX.next;
              preY.next=currX;
              currX.next=temp;
          }

          public Node pairSwap(Node head){
            Node dummy=new Node(0);
            dummy.next=head;
            Node point=dummy;
            while(point.next != null && point.next.next != null){
              // identify the node
              Node swap1=point.next;
              Node swap2=point.next.next;
              // swaping 
              swap1.next=swap2.next;
              swap2.next=swap1;
              // 
              point.next=swap2;
              point=swap1;
            }
            return dummy.next;
          }
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        // LinkedList l = new LinkedList();
        l.addLast(6);
        l.addLast(3);
        l.addLast(5);
        l.addLast(2);
        l.addLast(1);
        l.addLast(4);


        // ll.addLast1(5);
        // ll.addLast1(6);
        // ll.addLast1(7);
        // ll.addLast1(8);
        // ll.addLast1(9);
        // ll.addLast1(10);
        // ll.addLast1(11);
        // ll.addLast1(12);
        // ll.addLast1(13);
        // ll.addLast1(14);
        // ll.addLast1(15);
        // ll.addLast1(16);
        // ll.addLast1(17);


        // ll.issort(head);
        // System.out.println(ll.issort(head));
        // ll.print();
    // System.out.println(ll);
    // System.out.println(head.data);

        // ll.head=ll.issort(head);
        // ll.print();
        // ll.zigzag(head);
        // ll.print();
      //   ll.pairSwap( head);
      //  ll.print();
    }

    }
