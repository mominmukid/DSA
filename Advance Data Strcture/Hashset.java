import java.util.*;

public class Hashset {

    public static class Node {
          int data;
          Node next;
          Node(int data){
            this.data=data;
            this.next=next;
          }
        
    }
   public static String getstart(HashMap<String,String>map1){
    HashMap<String, String> map2 = new HashMap<>();
    for(String key:map1.keySet()){
      map2.put(map1.get(key), key);
    }
    for(String key:map1.keySet()){
        if(!map2.containsKey(key)){
            return key;
        }
    }
    return null;
   
   }
   public static int getSumK(int arr[],int k){
    HashMap<Integer,Integer>map=new HashMap<>();
    int n=arr.length;
    int sum=0;
    int ans=0;
    map.put(0, 1);
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(map.containsKey(sum-k)){
            ans+=map.get(sum-k);
        }
        map.put(sum, map.getOrDefault(sum,0)+1);

    }
    return ans;

   }
   public static int getZeroSum(int arr[]){
    HashMap<Integer,Integer>map=new HashMap<>();
    int n=arr.length;
    int len=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<n;i++){
         sum+=arr[i];
        if(map.containsKey(sum)){
           len=Math.max(len, i-map.get(sum));
        }else{
            map.put(sum, i);
        }
    }
    return len;
   }
     public static boolean issearch(Node head,int key){
        if(head==null){
            return false;
        }
        if(head.data==key){
            return true;
        }
       return issearch(head.next,key);

     }
     public static String sortChar(String s){
        TreeMap<Character,Integer>map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>bucket[]=new List[s.length()+1];
        for(Character key:map.keySet()){
          int frq=map.get(key);
          if(bucket[frq]==null){
            bucket[frq]=new ArrayList<>();
          }
          bucket[frq].add(key);

        }

        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!= null){
                for(Character c:bucket[i]){
                for(int j=0;j<map.get(c);j++){
                    sb.append(c);
                }
            }
        }
    }
    return sb.toString();
     }
public static void reverseString(String s){
    String sb[]=s.split(" ");
    for(int i=0;i<sb.length;i++){
       String str=sb[i];
        int st=0;int ed=str.length()-1;
        while(st<=ed){
           char temp=str.charAt(st);
            
          st++;
          ed--;
        }
    }

}
public static int size(Node head){
    Node temp=head;
    int s=0;
    while (temp !=null) {
        s++;
        temp=temp.next;
    }
    return s;
}

public static Node interSectionOfList(Node head1,Node head2){
   int l1=size(head1);
   int l2=size(head2);
   int d=0;
   Node ptr1;
   Node ptr2;
   if(l1>l2){
        d=l1-l2;
        ptr1=head1;
        ptr2=head2;
   }else{
    d=l2-l1;
    ptr2=head1;
    ptr1=head2;
   }
   while (d>0) {
    if(ptr1==null){
        return null;
    }
    ptr1 =ptr1.next;
    d--;
   }

   while (ptr1!=null && ptr2 !=null) {
    if(ptr1.data==ptr2.data){
        return ptr1;
    }
    ptr1=ptr1.next;
    ptr2=ptr2.next;
   }
   return null;
}
public static Node find(Node head1,Node head2){
    Set<Node>set=new HashSet<>();
    Node temp=head1;
    while (temp != null) {
        set.add(temp);
        temp=temp.next;
    }
    temp=head2;
    while (temp != null) {
        if(set.contains(temp)){
            return temp;
        }
        temp=temp.next;
    }
    return null;
}
public static void s(int grid[][]){
  
}

    public static void main(String[] args) {
       Node head1=new Node(1);
       head1.next=new Node(2);
       head1.next.next=new Node(3);
       head1.next.next.next=new Node(4);
       head1.next.next.next.next=new Node(5);
       head1.next.next.next.next.next=new Node(6);

       Node head2=new Node(9);
       head2.next=new Node(10);
       head2.next.next=new Node(5);
       head2.next.next.next=new Node(6);

        // System.out.println(find(head1, head2));


        // String a="123";
        // char b='1';
        // int c=Integer.parseInt(a);
        // int d=(int )b;
        // System.out.println(c+d);
    int dp[][][]=new int [5][5][5];
    // for(int ow :dp){
        Arrays.fill(dp, -1);
    // }
  


        //   String s="hello world kay hai kuch nahi";
        //   System.out.print(sortChar(s));

        //   Integer arr[]={1,3,5,66,6};
        //   Arrays.sort(arr,Comparator.reverseOrder());

         



        // LinkedList<Integer>ll=new LinkedList<>();
        // Node head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // LinkedList<Integer>ll2=new LinkedList<>();
        // Node head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=new Node(4);
        // head.next.next.next.next=new Node(5);
        // head.next.next.next.next.next=new Node(6);
        // System.out.println(issearch(head, 7));

        // int arr[]={10,2,-2,20,10};
        // int k=-10;
        // System.out.println(getSumK(arr,k));

     
        // HashMap<String, String> map1 = new HashMap<>();
        // map1.put("che", "Ben");
        // map1.put("mum", "del");
        // map1.put("goa", "che");
        // map1.put("del", "goa");
      
        // String start=getstart(map1);
        // System.out.print(start);
        // for(String key:map1.keySet()){
        //     System.out.print("->"+map1.get(start));
        //     start=map1.get(start);
        // }
          





        // TreeSet<String>set=new TreeSet<>();
        // set.add("pune");
        // set.add("pune");
        // set.add("nager");
        // set.add("jalna");
        // set.add("mumbai");
        // set.add("jaipur");

        // Iterator it=set.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        // for(String s:set){
        // System.out.println(s);
        // }
        // int arr[]={7,3,9};
        // int arr1[]={6,3,9,2,9,4};
        // HashSet<Integer>set=new HashSet<>();
        // for(int i=0;i<arr1.length;i++){
        // set.add(arr1[i]);
        // }

        // for(int i=0;i<arr.length;i++){
        // set.add(arr[i]);
        // }
        // System.out.print("union = "+set.size()+"--> ");
        // //second half
        // for(Integer i:set){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // set.clear();

        // for(int i=0;i<arr1.length;i++){
        // set.add(arr1[i]);
        // }

        // int enter=0;

        // for(int i=0;i<arr.length;i++){
        // int curr=arr[i];
        // if(set.contains(curr)){
        // enter++;
        // System.out.print( curr+" ");
        // set.remove(curr);
        // }

        // }
        // System.out.println();

        // System.out.println(enter);


    }

}
