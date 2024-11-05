import java.util.*;
public class Heapy{
      //    static class Heap{
      //       ArrayList<Integer>heap=new ArrayList<>();
         
      //         //this minheap
      //       public void add(int data){
      //          heap.add(data);
      //          int x=heap.size()-1;
      //          int par=(x-1)/2;

      //          while (heap.get(x)<heap.get(par)) {
      //             int temp=heap.get(x);
      //             heap.set(x,heap.get(par));
      //             heap.set(par, temp);
      //             x=par;
      //             par=(x-1)/2;
      //          }
      //       }

      //      public int peek(){
      //       return heap.get(0);
      //      }

      //      private void heapify(int i){
      //       int left=2*i+1;
      //       int right=2*i+2;
      //       int minidx=i;
      //       if(left<heap.size()&& heap.get(left) < heap.get(minidx)){
      //          minidx=left;
      //       }
      //       if( right<heap.size()&& heap.get(right) < heap.get(minidx)){
      //          minidx=right;
      //       }
      //       if(i !=minidx){
      //          int temp=heap.get(i);
      //          heap.set(i, heap.get(minidx));
      //          heap.set(minidx, temp);
      //          heapify(minidx);
      //       }
           
      //      }
      //      public  int remove(){
      //       //swap two number
      //       int data =heap.get(0);
      //          int temp=heap.get(0);
      //          heap.set(0, heap.get(heap.size()-1));
      //          heap.set(heap.size()-1, temp);

      //          //remove the the last element
      //       heap.remove(heap.size()-1);
      //       // set the heap
      //          heapify(0);
      //          return data;
      //      }
      //      public boolean isEmpty(){
      //         return heap.size()==0;
      //      }


      //      //this is max heap
      //      public void add2(int data){
      //       heap.add(data);
      //       int x=heap.size()-1;
      //       int par=(x-1)/2;

      //       while (heap.get(x)>heap.get(par)) {
      //          int temp=heap.get(x);
      //          heap.set(x,heap.get(par));
      //          heap.set(par, temp);
      //          x=par;
      //          par=(x-1)/2;
      //       }
      //    }

      //   public int peek2(){
      //    return heap.get(0);
      //   }

      //   private void heapify2(int i){
      //    int left=2*i+1;
      //    int right=2*i+2;
      //    int minidx=i;
      //    if(left<heap.size()&& heap.get(left) > heap.get(minidx)){
      //       minidx=left;
      //    }
      //    if( right<heap.size()&& heap.get(right) > heap.get(minidx)){
      //       minidx=right;
      //    }
      //    if(i !=minidx){
      //       int temp=heap.get(i);
      //       heap.set(i, heap.get(minidx));
      //       heap.set(minidx, temp);
      //       heapify2(minidx);
      //    }
        
      //   }
      //   public  int remove2(){
      //    //swap two number
      //    int data =heap.get(0);
      //       int temp=heap.get(0);
      //       heap.set(0, heap.get(heap.size()-1));
      //       heap.set(heap.size()-1, temp);

      //       //remove the the last element
      //    heap.remove(heap.size()-1);
      //    // set the heap
      //       heapify2(0);
      //       return data;
      //   }
      //   public boolean isEmpty2(){
      //      return heap.size()==0;
      //   }

      //    }
      public static void hepify(int arr [],int i,int n){
         int left=2*i+1;
         int right=2*i+2;
         int maxid=i;
         if(left<n && arr[left]>arr[maxid]){
            maxid=left;
         }
         if(right<n && arr[right]>arr[maxid]){
            maxid=right;
         }
        if (i != maxid) {
            int temp=arr[i];
            arr[i]=arr[maxid];
            arr[maxid]=temp;
            hepify(arr, maxid, n);

         }

      }

      public static void heapSort(int arr[]){
         int n=arr.length;
         for(int i=n/2;i>=0;i--){
            hepify(arr,i,n);
         }

         for (int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            hepify(arr,0,i);
         }

      }


      
     public static void heapsortDes(int arr[]){
      int n=arr.length;
      for (int i=n/2;i>=0;i--){
         hepifyDes(arr, i, n);
      }

      for (int i=n-1;i>0;i--){
          int temp=arr[0];
          arr[0]=arr[i];
          arr[i]=temp;
          hepifyDes(arr,0,i);
      }
     }
     public static void hepifyDes(int arr[],int i,int n){
      int left=2*i+1;
      int right=2*i+2;
      int min=i;
      if(left<n && arr[left]<arr[min]){
         min=left;
      }
      if(right<n && arr[right]<arr[min]){
         min=right;
      }
      if(i != min){
         int temp=arr[i];
         arr[i]=arr[min];
         arr[min]=temp;
         hepifyDes(arr,min,n);
      }
     }

     public static class point implements Comparable<point>{
      int x;
      int y;
      int dssq;
      int idx;
      point(int x,int y,int dssq,int idx){
         this.x=x;
         this.y=y;
         this.dssq=dssq;
         this.idx=idx;
      }
      @Override
      public int compareTo(point p2){
         return this.dssq-p2.dssq;
      }

   }

   public static class solder implements Comparable<solder> {
        int sol;
        int idx;
        solder(int sol,int idx){
         this.sol=sol;
         this.idx=idx;
        }
        @Override
        public int compareTo(solder s2){
         if(this.sol==s2.sol){
            return this.idx-s2.idx;
         }else{
         return this.sol-s2.sol;
         }
        }
      
   }

   public static class pair implements  Comparable<pair> {
     int num;
     int idx;
     pair(int num,int idx){
      this.num=num;
      this.idx=idx;
     }
     @Override
     public int compareTo(pair p2){
      return p2.num-this.num;
     }
      
   }
    public static void main(String[] args){
         // int arr[][]={{3,3},{5,-1},{-2,4}};
         // int k=2;
         // PriorityQueue<point>pq=new PriorityQueue<>();
         // for(int i=0;i<arr.length;i++){
         //    int ds=arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1];
         //    pq.add(new point(arr[i][0], arr[i][1], ds, i));
         // }
         //  for(int i=0;i<k;i++){
         //    System.out.println("C"+pq.remove().idx);
         //  }
         // int arr[]={2,3,3,4,6};
         // PriorityQueue<Integer>pq=new PriorityQueue<>();
         // int cost=0;
         // for(int i=0;i<arr.length;i++){
         //    pq.add(arr[i]);
         // }
         // for(int i=0;i<pq.size();i++){
         //   int f1=pq.remove();
         //   int f2=pq.remove();
         //    cost+=f1+f2;
         //   pq.add(cost);
         // }
         
         // while (pq.size()>1) {
         //    int f1=pq.remove();
         //      int f2=pq.remove();
         //       cost+=(f1+f2);
         //      pq.add(f1+f2);
   
         // }
      //  System.out.println(cost);

   //    int arr[][]={
   //       {1,0,0,0},
   //       {1,1,1,1},
   //       {1,0,0,0},
   //       {1,0,0,0}
   //    };
   //    int k=0;
   //    PriorityQueue<solder>pq=new PriorityQueue<>();
   //  for(int i=0;i<arr.length;i++){
   //    int sum=0;
   //    for(int j=0;j<arr[0].length;j++){
   //         sum+=arr[i][j]==1?1:0;
   //    }
     
   //    pq.add(new solder(sum, i));
   //  }
   //  for(int i=0;i<pq.size();i++){
   //    System.out.println("L"+pq.remove().idx);
   //  }

   int arr[]={1,3,-1,-3,5,3,6,7};
   int k=3;
   int j=0;
         PriorityQueue<pair>pq=new PriorityQueue<>();
         int res[]=new int[arr.length-k+1];
         for(int i=0;i<k;i++){
            pq.add(new pair(arr[i],i));
         }
         res[j++]=pq.peek().num;

        for(int i=k;i<arr.length;i++){
         int curr=arr[i];
            while ( pq.size()>0 &&pq.peek().idx <=(i-k)) {
               pq.remove();
            }
            pq.add(new pair(curr,i));
               res[j++]=pq.peek().num;

        }
        for(int i=0;i<res.length;i++){
         System.out.print(res[i]);
        }
    
}
}