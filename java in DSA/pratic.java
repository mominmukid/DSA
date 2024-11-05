import java.util.*;
public class pratic {

    // public static int Bsearch(int arr[],int key){
    //     int start=0;
    //     int end=arr.length-1;
        
    //     while(start <=end){
            
    //         int mid=(start+end)/2;
    //         if(arr[mid]==key){
    //             return mid;
    //         }else if(arr[mid]<key){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return-1;
    // }
        public static void pt(int n){
            for (int i=n; i<0;i--){
                for(int j=1;j<i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    public static void main(String []args){
     int n=5;
     pt(n);
    }
}
