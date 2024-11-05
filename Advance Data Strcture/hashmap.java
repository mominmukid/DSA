import java.util.*;

// import BinTree.InnerBinTree.info;
public class hashmap {
    // public static class HashMap<k,v>{
    // private class Node{
    // k key;
    // v val;
    // public Node(k key,v val){
    // this.key=key;
    // this.val=val;
    // }
    // }
    // private int n;
    // private int N;
    // private LinkedList<Node> b[];

    // @SuppressWarnings("unchecked")

    // public void MyHashMap() {
    // this.N=4;
    // this.b=new LinkedList[4];
    // for(int i=0;i<4;i++){
    // this.b[i]=new LinkedList<>();
    // }
    // }

    // private int hashfun( k key){
    // int hf=key.hashCode();
    // return Math.abs(hf)%N;
    // }

    // private int searchidx(k key,int bi){
    // LinkedList<Node> ll=b[bi];
    // int dataidx=0;
    // for(int i=0;i<ll.size();i++){
    // Node node=ll.get(i);
    // if(key == node.key){
    // return dataidx;
    // }
    // dataidx++;
    // }
    // return -1;
    // }

    // private void rehash(){
    // LinkedList<Node>oldbuc[]=b;
    // b=new LinkedList[N*2];
    // N=N*2;
    // for (int i=0;i<b.length;i++){
    // b[i]=new LinkedList<>();
    // }
    // for(int i=0;i<oldbuc.length;i++){
    // LinkedList<Node>ll=oldbuc[i];
    // for(int j=0;j<ll.size();j++){
    // Node node=ll.remove();
    // put(node.key, node.val);
    // }
    // }

    // }

    // public void put(k key, v value) {
    // int bi=hashfun(key);
    // int di=searchidx(key,bi);

    // if(di != -1){
    // Node node=b[bi].get(di);
    // node.val=value;
    // }else{
    // b[bi].add(new Node(key,value));
    // n++;
    // }

    // double lamda=(double)n/N;
    // if(lamda>2.0){
    // rehash();
    // }

    // }

    // public int get(int key) {

    // }

    // public void remove(int key) {

    // }
    // }

    // public static int fristocorsnce(String s){

    // HashMap<Character,Integer>map=new HashMap<>();
    // for(int i=0;i<s.length();i++){
    // char ch=s.charAt(i);
    // if(map.containsKey(ch)){
    // map.put(ch,map.get(ch)+1);

    // }else{
    // map.put(ch, 1);
    // }
    // map.put(key, map.get);

    // }

    // Set<Integer>valuSet=map.valuSet();
    // for(Integer key :valuSet){
    // if(map.get(key)==1){
    // return key;
    // }
    // }
    // return -1;

    // }

    static boolean dp[][];
    // public static boolean cheakpld(int i,int j,String s){
    // if(i>j){
    //     return true;
    // }
    // if(dp[i][j]!= -1){
    //     return dp[i][j]==1;
    // }
    //     if(s.charAt(i) !=s.charAt(j)){
    //         dp[i][j]=0;
    //         return false;
    //     }
    // return cheakpld(i+1, j-1, s);
    // }
    // public static int  subString(String s){
    //     int n=s.length();
    //     int count=0;
    //     // dp=new int[n][n];
    //     // Arrays.stream(dp).forEach(a -> Arrays.fill(a, -1));
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
    //       if(cheakpld(i,j,s)){
            
    //         count++;
    //       }

    //     }
    // }
    // return count;
    // }
  
    public static int ispalndrom(String s){
         int n=s.length();
         int count=0;
         dp=new boolean[n][n];
        
      for(int L=1;L<=n;L++){
        for(int i=0;i+L-1<n;i++){
            int j=L+i-1;
           if(i==j){
            dp[i][j]=true;
           }else if(i+1 ==j){
           dp[i][j]=(s.charAt(i)==s.charAt(j));
           }else{
            dp[i][j]=(s.charAt(i)==s.charAt(j)&& dp[i+1][j-1]);
           }
           if(dp[i][j]){
            count++;
           }
        }
      }
      return count;
    }
    
    public static void main(String[] args) {
        String s="aaa";
        System.out.println(ispalndrom(s));
       



        // HashMap<String,Integer>map=new HashMap<>();
        // map.put("india", 100);
        // map.put("pak", 20);
        // map.put("us", 50);

        // String s="leetcode";
        // System.out.print(fristocorsnce(s));
    //     int arr[] = { 3, 8, 15, 32, 64 };
    //     int n = arr.length;
    //     int dp[] = new int[n];
    //     Arrays.fill(dp, 1);
    //     Arrays.sort(arr);
    //     int maxsize = 1, maxidx = 0;
    //     for (int i = 1; i < n; i++) {
    //         for (int j = 0; j < i; j++) {
    //             if (arr[i] % arr[j] == 0) {
    //                 dp[i] = Math.max(dp[i], dp[j] + 1);
    //                 if (dp[i] > maxsize) {
    //                     maxsize = dp[i];
    //                     maxidx = i;

    //                 }
    //             }
    //         }
    //     }
    //     List<Integer> result = new ArrayList<>();
    //    int num=arr[maxidx];
    //    for(int i=maxidx;i>=0;i--){
    //     if(num%arr[i]==0&& dp[i]==maxsize){
    //         result.add(arr[i]);
    //         num=arr[i];
    //         maxsize--;
    //     }
    //    }
    
    //     // System.out.println(result);
    //     System.out.println(result);
    
    }
}
