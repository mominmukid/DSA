import java.lang.reflect.Array;
import java.util.*;

public class DivideAndConqure {

    public static void margeSort(int arr[],int si,int ed){
        if(si>=ed){
            return;
        }
         int mid=si+(ed-si)/2;
         margeSort(arr, si, mid);
         margeSort(arr, mid+1, ed);
         marge(arr,si,mid,ed);

    }
   
    
public static void marge(int arr[],int si,int mid,int ed){
    int temp[]=new int [(ed-si)+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while (i<=mid && j<=ed) {
    if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
    }else{
        temp[k]=arr[j];
        j++;
    }
    k++;
}
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ed){
        temp[k++]=arr[j++];
    
}
for(k=0,i=si;k < temp.length;k++,i++){
    arr[i]=temp[k];
}
}



public static void quickSort(int arr[],int si,int ei){
    if(si>=ei)return;
 //////last index find
 int lidx=partition(arr,si,ei);
    quickSort(arr, si, lidx-1);
    quickSort(arr, lidx+1, ei);
}

public static int partition(int arr[],int si,int ed){
    int pivit=arr[ed];
    int i=si-1;
    for(int j=si;j<ed;j++){
    if(arr[j]<=pivit){
    i++;
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
    }
    }

    i++;
    int temp=pivit;
    arr[ed]=arr[i];
    arr[i]=temp;
    return i;
}

public static int searchSortedandRotetd(int arr[],int key){
    int si=0;
    int ei=arr.length-1;
    while (si<=ei) {
        int mid=si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[si]<=arr[mid] ){
            if(key<=arr[mid]&& key>=arr[si]){
            ei=mid-1;
            }else{
                si=mid+1;
            }
        }
       else{

        if(arr[ei]>=key && arr[mid]<=key){
            si=mid+1;
        }else{
            ei=mid-1;
        }
        }

    }
return-1;

}



public static void sortInString(String str[],int si,int ei){
    if(si>=ei){
        return;
    }
    //kaam
    int mid=si+(ei-si)/2;
    sortInString(str,si,mid);
    sortInString(str, mid+1, ei);
    marges(str,si,mid,ei);
}
public static void marges(String str[],int si,int mid,int ei){
    String str2[]=new String[ei-si+1];
    int i=si;
    int j=mid+1;
    int k=0;
    while(i<=mid && j<=ei){
        if((str[i].compareTo(str[j]))<1 ){
            str2[k]=str[i];
            i++;

        }else{
            str2[k]=str[j];
            j++;
        }
        k++;
    }
    while(i<=mid){
        str2[k++]=str[i++];
    }
    while(j<=ei){
        str2[k++]=str[j++];
    }
    for(k=0,i=si;k<str2.length;i++,k++){
        str[i]=str2[k];
    }
}

// public static void swap(String str[]){
//     for(int i=0;i<str.length;i++){
//         for(int j=i+1;j<str.length;j++){
//             if((str[i].compareTo(str[j]))>0 ){
//                 String temp=str[i];
//                 str[i]=str[j];
//                 str[j]=temp;

//             }
//         }
        
//     }
// public static void printarr(String str[]){
//     for(int i=0;i<str.length;i++){
//         System.out.print(str[i]+" ");
//     }
    
// }
public static int mejorityelement(int arr[]){

    //*********broute force aproch for the majority element  time  O(n^2) */
    // int major=arr.length/2;
    // for (int i=0;i<arr.length;i++){
    //     int count=0;
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[i]==arr[j]){
                
    //             count++;
    //             if(count>=major){
    //                 return arr[i];
    //             }
    //         }
    //     }
    // }
    // return -1;
    //**************** optimize approch for the majority time complicit O(n log n) */
     Arrays.sort(arr);
     int ans=arr[k];
     return ans;

}

      void merge(int arr[], int l, int m, int r)
    {
       
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
        //code here
        int mid =l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
 

    public static void main(String args[]){
     int arr[]={7,7,7,8,8,8};
     System.out.println(mejorityelement(arr));






            // int arr[]={3,3};
        //     String str[]={"sun", "earth", "mars", "mercury"};
        //     sortInString(str, 0, str.length-1);
        // printarr(str);
        // sortInString(str,0,str.length-1);
// System.out.println(searchSortedandRotetd(arr, 3));

        //   margeSort(arr,0,arr.length-1);
        // quickSort(arr, 0, arr.length-1);

        //   for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
          }
    }

    int temp[]=new int [(r-l)+1];
    int i=l;
    int j=m+1;
    int k=0;
    while (i<=m && j<=r) {
    if(arr[i]<arr[j]){
        temp[k]=arr[i];
        i++;
    }else{
        temp[k]=arr[j];
        j++;
    }
    k++;
}
    while(i<=m){
        temp[k++]=arr[i++];
    }
    while(j<=r){
        temp[k++]=arr[j++];
    
}
for(k=0,i=l;k < temp.length;k++,i++){
    arr[i]=temp[k];
}
}