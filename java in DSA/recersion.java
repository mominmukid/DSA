import java.util.*;

public class recersion {

  public static void Desprintnum(int n) {
    if (n < 1) {
      return;
    }
    System.out.println(n + " ");
    Desprintnum(n - 1);
  }

  public static void printAsending(int i) {
    if (i > 10) {
      return;
    }
    System.out.print(i + " ");
    printAsending(i + 1);
  }

  public static int Factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int i = Factorial(n - 1);
    int fact = n * i;
    return fact;
  }

  public static int sumNnumber(int n) {
    if (n == 0) {
      return 0;
    }
    int csum = sumNnumber(n - 1);
    int sum = n + csum;
    return sum;
  }

  public static int prinFibonachi(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int f = prinFibonachi(n - 1) + prinFibonachi(n - 2);
    return f;
  }

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) return true;
    if (arr[i] > arr[i + 1]) {
      return false;
    }

    return isSorted(arr, i + 1);
  }

  public static int fristOcc(int arr[], int i, int key) {
    if (i == arr.length) return -1;
    if (arr[i] == key) return i;
    return fristOcc(arr, i + 1, key);
  }

  public static int lastOcc(int arr[], int i, int key) {
    if (i == arr.length) return -1;
    int j = lastOcc(arr, i + 1, key);
    if (j == -1 && arr[i] == key) {
      return i;
    }
    return j;
  }

  public static long power(int x, int n) {
    if (n == 0) return 1;
    long p = power(x, n - 1);
    long pow = x * p;
    return pow;
  }

  public static int ispower(int x, int n) {
    if (n == 0) return 1;
    if (n % 2 != 0) {
      int ft = ispower(x, n / 2);
      int pow = x * ft * ft;
      return pow;
    }
    int ft = ispower(x, n / 2);
    int pow = ft * ft;
    return pow;
  }

  public static boolean isana(String s, String t) {
    char a[] = s.toCharArray();
    char b[] = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if (a.length != b.length) {
      return false;
    }
    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }
    return true;
  }

  public static int tillingProelem(int flore) {
    if (flore == 0 || flore == 1) return 1;
    return tillingProelem(flore - 1) + tillingProelem(flore - 2);
  }

  public static void removeDublicate(
    String s,
    int st,
    StringBuilder newstrin,
    boolean map[]
  ) {
    if (st == s.length()) {
      System.out.println(newstrin);
      return;
    }
    char curr = s.charAt(st);
    if (map[curr - 'a'] != true) {
      map[s.charAt(st) - 'a'] = true;
      newstrin.append(s.charAt(st));
    }
    removeDublicate(s, st + 1, newstrin, map);
  }

  public static long friendPair(int n) {
    if (n == 1 || n == 2) return n;
    return friendPair(n - 1) + (n - 1) * friendPair(n - 2);
  }

  public static void printBinaryString(int n,int lasdig,String str){
    if(n==0){
        System.out.println(str);
        return;
    }
      printBinaryString(n-1,0,str+"0");
      if(lasdig==0){
        printBinaryString(n-1,1,str+"1");
      }
  }



  public static void printBinaryStringzero(int n,int lasdig,String str){
    if(n==0){
        System.out.println(str);
        return;
    }
      printBinaryString(n-1,0,str+"1");
      if(lasdig==0){
        printBinaryString(n-1,1,str+"0");
      }
  }
    public static void allOccurnce(int arr[],int i, int key ){
      //base case
      if(i==arr.length){
        return;
      }
        //kaam
        if(arr[i]==key){
           System.out.print(i+" ");
        }
        allOccurnce(arr, i+1, key);
    }
   public static void digiTOString(String number[],int num){
    if(num==0){
      return;
    }
    int lastdig=(num)%10;
      digiTOString(number, num/10);
      System.out.print(number[lastdig]+" ");
   }

   public static int subaet(String str,int n){
     if(n==0){
      return 1;
     }
     //kaam
     int w1=subaet(str, n-1);
       int ans=2*w1;
       return ans;
   }
    public static void towerOfHinoi(int n,String src,String help,String des){
      if(n==1){
        System.out.println("disk trasfer "+n+ " from "+src+" to "+des);
        return;
      }
        towerOfHinoi(n-1, src, des, help);
        System.out.println("disk trasfer "+n+ " from "+src+" to "+help);
        towerOfHinoi(n-1, help, src, des);
    }
    public static int towerofHonoi(int n,String src,String help,String des){
          if(n==1)return 1;
        int co=  towerofHonoi(n-1, src, des, help);
         int coi= towerofHonoi(n-1, help, src, des);
         int cou=co+coi;
          return cou;
    }
  public static void main(String args[]) {
        int n=3;
      System.out.println(towerofHonoi(n, "src", "help", "des"));  

  //  String str="abcab";
  //  int n=str.length();
  //  System.out.println(subaet(str,n));

   
  //  String number[]={"zero","one","two","three","four","five","six"
  // ,"seven","eight","nine"};
  //   int num=1215512;
  //   digiTOString(number,num);
    // System.out.println(1215%10);
   


    // int arr[]={3,2,4,5,6,2,7,2,2};
    // int i=0;
    // int key=2;
    // allOccurnce(arr, i, key);


    // printBinaryString(3,0," ");
    // System.out.println(friendPair(n));
    // int n[]={1,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,2};
    // int x=2;
    // int n=30;
    // System.out.println(ispower(x, n));
    // boolean map[] = new boolean[26];
    // StringBuilder newstrin = new StringBuilder();
    // String a = "apnnacollage";
    // int c = 0;
    // removeDublicate(a, c, newstrin, map);
    // Scanner sc=new Scanner(System.in);
    // int flore=sc.nextInt();
    // System.out.print(tillingProelem( flore));
  }
}
