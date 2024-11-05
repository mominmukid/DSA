import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class trie {
//     public static class Node {
//         Node child[]= new Node [26];
//         boolean eow=false;
//         int frq;
//                      Node(){
//             for(int i=0;i<26;i++){
//                 child[i]=null;
//             }
//         }
//     }
//         static Node head=new Node();
//         public static void add(String s){
//             Node curr=head;
//             for(int i=0;i<s.length();i++){
//                 int id=s.charAt(i)-'a';
//                 if(curr.child[id]==null){
//                     curr.child[id]=new Node();
//                     curr.frq=1;
//                     curr=curr.child[id];
//                 }else{
//                     curr=curr.child[id];
//                     curr.frq++;
//                 }
               
//             }
//             curr.eow=true;
//         }
//   public static boolean issearch(String key){
//     Node curr=head;
//     for(int i=0;i<key.length();i++){
//         int id=key.charAt(i)-'a';
//         if(curr.child[id]==null){
//             return false;
//         }
//         curr=curr.child[id];
//     }
//     return curr.eow==true;
//   }
  
//   public static boolean wordBreakProbkem(String s){
//     if(s.length()==0){
//         return true;
//     }
//    for(int i=1;i<=s.length();i++){
//     if(issearch(s.substring(0,i))&&wordBreakProbkem(s.substring(i))){
//         return true;
//     }
//    }
//    return false;
//   }


public static class Node{
     Node child[]=new Node[26];
     boolean eow=false;
     int frq;
     Node(){
        for(int i=0;i<26;i++){
            child[i]=null;
        }
        frq=1;
     }
}
static Node root=new Node();
public static void add(String s){
    Node curr=root;
    for(int i=0;i<s.length();i++){
        int id=s.charAt(i)-'a';
        if(curr.child[id]==null){
            curr.child[id]=new Node();
        }else{
            curr.child[id].frq++;
        }
        curr=curr.child[id];
    }
    curr.eow=true;
}

    public static void findPrifix(Node root,String ans,ArrayList<String> arr){
        if(root==null){
            return ;
        }
        if(root.frq==1){
           arr.add(ans);
            return;
        }
        for(int i=0;i<26;i++){
            if(root.child[i] != null){
                findPrifix(root.child[i], ans+(char)(i+'a'),arr);
            }
        }
    }
    public static boolean startWithProblem(String key){
        Node curr=root;
            for(int i=0;i<key.length();i++){
                int id=key.charAt(i)-'a';
                if(curr.child[id]==null){
                    return false;
                }
                curr=curr.child[id];
            }
            return true;
    }
     public static int countUniqueSubstring(Node root){
        if(root==null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.child[i]!=null){
               count+= countUniqueSubstring(root.child[i]);
            }
        }
       return count+1;

     }



     public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
     }
    //   public static int frequentElement(int arr[]){
    //     int temp[]=new int[100001];
    //     for(int i:arr)temp[i]++;
    //     int frq=0,ans =-1;
    //     for(int i=0;i<arr.length;i++){
    //         int n=arr[i];
    //         if(i%2==0 && frq<temp[n]){
    //             frq=temp[n];
    //             ans=temp[n];
    //         }
    //     }
    //   }
        public static String ans="";
    public static void longestPrefix(Node root,StringBuilder temp){
        if(root==null){
            return ;
        }
        for(int i=0;i<26;i++){
            if(root.child[i]!=null && root.child[i].eow==true){
                char ch=(char)(i+'a');
                temp.append(ch);
                if(temp.length()>=ans.length()){
                    ans=temp.toString();
                }
                longestPrefix(root.child[i], temp);
                //backtrac 
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args){

      String s[]={"a","banana","app","appl","apple","apply","ap"};
      for(int i=0;i<s.length;i++){
        add(s[i]);
      }
      longestPrefix(root, new StringBuilder());
      System.out.println(ans);


        // System.out.println('a');
        
    //  String s[]={"apple","app","man","woman","mango"};
    //  String key="app";
    //  for(int i=0;i<s.length;i++){
    //     add(s[i]);
    //  }
    //  ArrayList <String>arr=new ArrayList<>();
    //  root.frq=-1;
    //  findPrifix(root, "",arr);
    //  for(int i=0;i<arr.size();i++){
    //    System.out.println(arr.get(i));
    //  }
    // String str="zab";
    //  for(int i=0;i<str.length();i++){
    //     String suff=str.substring( i);
    //     add(suff);
    //  }
    //  System.out.println(countUniqueSubstring(root));

    //    System.out.println('a'^'a');
    }
    
}
