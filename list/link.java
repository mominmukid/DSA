
public class link {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data) {
        Node NewNode = new Node(data);
        if (head == null) {
            head = tail = NewNode;
            size++;
            return;
        }
        tail.next = NewNode;
        tail = NewNode;
        size++;
    }

    public void print(Node head) {
        Node temp = head;
        if (head == null) {
            System.out.print("null");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node marge(Node left, Node right) {
        Node mar = new Node(-1);
        Node temp = mar;
        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }
        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }
        return mar.next;
    }

    public static Node isMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node mergeSort(Node head) {
        // add your code here
        if (head == null || head.next == null) {
            return head;
        }
        // find the mid
        Node mid = isMid(head);
        // seprate the array
        Node right = mid.next;
        mid.next = null;
        // call the recarsive
        Node leftside = mergeSort(head);
        Node rightside = mergeSort(right);

        // call the marge fungtion
        return marge(leftside, rightside);
    }

    // public Node marge2(Node left,Node right){
    // Node marges= new Node(-1);
    // Node temp=marges;
    // while(left !=null && right !=null){
    // if(left.data < right.data){
    // temp.next=left;
    // left=left.next;
    // temp=temp.next;
    // }else{
    // temp.next=right;
    // right=right.next;
    // temp=temp.next;
    // }
    // }
    // while(left !=null){
    // temp.next=left;
    // left=left.next;
    // temp=temp.next;
    // }
    // while(right != null){
    // temp.next =right;
    // right=right.next;
    // temp=temp.next;
    // }

    // return marges.next;
    // }

    // public Node isMid2(Node head){
    // Node slow=head;
    // Node fast=head.next;
    // while(fast != null && fast.next != null){
    // slow=slow.next;
    // fast=fast.next.next;
    // }
    // return slow;
    // }

    // public Node issort(Node head){
    // if(head == null || head.next==null){
    // return head;
    // }
    // //find the mid
    // Node mid=isMid2(head);
    // //right part
    // Node right=mid.next;
    // mid.next=null;
    // //left part
    // Node leftside=issort(head);
    // Node rightside=issort(right);
    // return marge2(leftside,rightside);

    // }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int a1 = nums1.length; 
             int b1 = nums2.length;  
             int c1 = a1 + b1;
             int res[]=new int[c1];
             double median=-1;
             int st=0;
             int ed=0;
             int k=0;
             while(st<nums1.length && ed<nums2.length){
                if(nums1[st]<nums2[ed]){
                    res[k++]=nums1[st];
                    st++;
                }else{
                     res[k++]=nums1[ed];
                    ed++;
                }
            }

                while(st <nums1.length){
                    res[k++]=nums1[st++];
                }
                
                while(ed <nums2.length){
                    res[k++]=nums2[ed++];
                }
                if(c1%2!=0){
                 return median=res[res.length/2];
                }else{
                    return median=res[res.length/2];
                }

            }
                
            
      
            
        
    public static void main(String[] args) {
        // link l = new link();
        // l.addLast(6);
        // l.addLast(3);
        // l.addLast(5);
        // l.addLast(2);
        // l.addLast(1);
        // l.addLast(4);

        // l.print(head);
        // l.head = l.mergeSort(l.head);
        // l.print(head);
      int arr[]={1,2,3,4,5};
      int arr1[]={6,7,8,9,10,11,12};
     System.out.println(findMedianSortedArrays(arr,arr1)); 
    }
}