import java.util.*;

public class Arraylist {
    public static void printlist (ArrayList<ArrayList<Integer>> mainlist){
        for (int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j));
            }
            System.out.println();
        }
    }

    public static int contenorMostater(ArrayList<Integer>list){
        int maxwater=Integer.MIN_VALUE;
        int curr=0;
            int st=0;
            int ed=list.size()-1;
        // burite force
        // for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         int mincol=Math.min(list.get(i),list.get(j));
        //         int width=j-i;
        //         curr=mincol*width;
        //         maxwater=Math.max(maxwater, curr);
        //     }
        // }
       while (st<=ed) {
        int currwater=Math.min(list.get(ed),list.get(st));
        int width=ed-st;
        curr=currwater*width;
        maxwater=Math.max(curr, maxwater);
        if(st<ed){
            st++;
        }else{
            ed--;
        }
       }
        return maxwater;
    }

    // public static int tpwater(ArrayList<Integer>height){
    //   ArrayList<Integer>leftmax=new ArrayList<>();
    //   int cur=height.get(0);
    //   leftmax.add(0,cur);
    //   for (int i=1;i<height.size();i++){
    //     int currdigt=Math.max(height.get(i),height.get(i-1));
    //       leftmax.add(i,currdigt);
    //   }
    //    ArrayList<Integer>rightmax=new ArrayList<>();
    //    int cur2=height.get(height.size()-1);
    //    rightmax.add(0,cur2);
    //    for(int i=height.size()-2;i>=0;i--){
    //     int curdigit=Math.max(height.get(i), height.get(i+1));
    //     rightmax.add(i,curdigit);
    //    }
    //     int tpwater1=0;
    //     for (int i=0;i<height.size();i++){
    //         int waterlevel=Math.max(leftmax.get(i),rightmax.get(i));
    //         tpwater1+=(waterlevel-height.get(i));
    //     }
    //     return tpwater1;
    // }

     public static void PairSum(ArrayList<Integer>list,int tar){

        //brute force
        //    for(int i=0;i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         int sum=list.get(i)+list.get(j);
        //         if(sum==tar){
        //             System.out.print("("+list.get(i)+","+list.get(j)+")");
        //             return;
        //         }
        //     }
        //    }
        ////optimize
        int st=0;
        int ed=list.size()-1;
        while (st<=ed) {
            int sum=list.get(st)+list.get(ed);
            if(sum==tar){
                System.out.print("("+list.get(st)+","+list.get(ed)+")");
              return;
            }else if(sum<tar){
                st++;
            }else{ed--;}
        }
     }

     public static void pairsumRoteted(ArrayList<Integer>list,int tar){
        int ed=-1;
        int n=list.size();

        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                ed=i;
                break;
            }
        }

        int st=ed+1;
       
        while (st!=ed) {
            if(list.get(st)+list.get(ed)==tar){
            //  System.out.print("("+list.get(st)+","+list.get(ed)+")");
            System.out.println("("+list.get(st)+","+list.get(ed)+")");
                // return;
            } if(list.get(st)+list.get(ed)<tar){
                st=(st+1)%n;
            }else{
                 ed=(n+ed-1)%n;
            }
        }

     }


     public static boolean isMonotonic(ArrayList<Integer>list){
       if(list.get(0)<list.get(list.size()-1)){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
       }

       }else{
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)<list.get(i+1)){
                return false;
            }
       }

       }
        
    return true;
}
     public static void Lonleynum(ArrayList<Integer>list){
        Collections.sort(list);
        ArrayList<Integer>newarr=new ArrayList<>();
      for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
        if(list.get(i+1)==list.get(j)){
            newarr.add(list.get(i));
        }
      }
    }
      System.out.println(newarr);
     }



public static int commenEle(ArrayList<Integer>list){
    ArrayList <Integer>list2=new ArrayList<>();
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        list2.add(list.get(i),1);
    }
    for(int i=0;i<list2.size();i++){
        max=Math.max(max,list2.get(i));
    }
    return max;
}
    public static void main(String args[]){
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(2);
        list1.add(3);
        // list1.add(1);
        // list1.add(10);
        // list1.add(0);
        // list1.add(9);
        // list1.add(7);
    //    Lonleynum(list1);
    // System.out.println(commenEle(list1));






        // PairSum(list1, tar);
        // int tar=15;
    //   pairsumRoteted(list1, tar); 
    System.out.println(isMonotonic(list1));
  
    }
    
}
