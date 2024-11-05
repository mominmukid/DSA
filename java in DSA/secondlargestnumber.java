public class secondlargestnumber {
    public static void backtrac(int arr[],int i,int val){
        if(i==arr.length){
            printarr(arr);
            return;
        }
        arr[i]=val;
        backtrac(arr, i+1, val+1);
        arr[i]=arr[i]+2;
    }
 public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
 } 
    
    public static void main(String [] args){
       int arr[]= new int[5];
       int i=0;
       int val=2;
       backtrac(arr, i, val);
       printarr(arr);
    }

}