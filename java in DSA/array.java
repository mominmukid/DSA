import java.util.*;

public class array {
   // public static int BinarySearch(int arr[], int key) {
   // int s = 0;
   // int e = arr.length - 1;
   // while (s <= e) {
   // int mid = (s + e) / 2;
   // if (arr[mid] == key) {
   // return mid;
   // }
   // if (arr[mid] < key) {
   // s = mid + 1;
   // } else {
   // e = mid - 1;
   // }

   // }
   // return -1;
   // }

   // public static void ReversArray(int[] arr) {
   // int f = 0;
   // int l = arr.length - 1;
   // while (f < l) {
   // int temp = arr[l];
   // arr[l] = arr[f];
   // arr[f] = temp;
   // f++;
   // l--;
   // }
   // for (int i = 0; i < arr.length; i++) {
   // System.out.print(arr[i] + " ");
   // }
   // }

   // public static void pairs_Array(int arr[]) {
   // for (int i = 0; i < arr.length; i++) {
   // for (int j = i + 1; j < arr.length; j++) {
   // System.out.print("(" + arr[i] + "," + arr[j] + ")");
   // }
   // System.out.println();
   // }
   // }

   // public static void print_Subarray(int arr[]) {
   // int ts = 0;
   // for (int i = 0; i < arr.length; i++) {
   // for (int j = i; j < arr.length; j++) {
   // for (int k = i; k <= j; k++) {
   // System.out.print(arr[k] + ",");
   // }
   // ts++;
   // System.out.println();
   // }
   // System.out.println();
   // }
   // System.out.println(ts);
   // }

   // public static int max_Sum(int arr[]) {

   // int sum = 0;
   // int maxsum = Integer.MIN_VALUE;
   // for (int i = 0; i < arr.length; i++) {
   // for (int j = i; j < arr.length; j++) {
   // sum = 0;
   // for (int k = i; k <= j; k++) {
   // sum += arr[k];

   // }
   // System.out.println(sum);
   // if (maxsum < sum) {
   // maxsum =sum;
   // }

   // }
   // }
   // return maxsum;
   // }
   // public static int prifix(int arr[]){
   // int sum=0;
   // int maxsum=Integer.MIN_VALUE;
   // int prifix[]=new int[arr.length];
   // prifix[0]=arr[0];
   // for(int i=1;i<prifix.length;i++){
   // prifix[i]=prifix[i-1]+arr[i];
   // }
   // for (int i=0;i<arr.length;i++){
   // for(int j=i;j<arr.length;j++){
   // sum=i==0?prifix[j]:prifix[j]-prifix[i-1];
   // }
   // if(maxsum <sum){
   // maxsum=sum;
   // }
   // }
   // return maxsum;
   // }
   // public static long kadans(int arr[]){
   // long max_sum=Integer.MIN_VALUE;
   // long crrsum=0;
   // for(int i=0;i<arr.length;i++){
   // crrsum=crrsum+arr[i];
   // max_sum=Math.max(crrsum,max_sum);
   // if(crrsum<0){
   // crrsum=0;
   // }
   // }

   // return max_sum;
   // }
   // public static int kds (int arr[]){
   // int currsum=0;
   // int maxsum=Integer.MIN_VALUE;
   // for(int i=0;i<arr.length;i++){
   // currsum+=arr[i];
   // }
   // if(currsum <0){
   // currsum=0;
   // }
   // return maxsum;
   // }

   public static int TrappWater( int height []){
   int n=height.length;
   int leftmax[]=new int[n];
   leftmax[0]=height[0];
   for(int i=1;i<n;i++){
   leftmax[i]=Math.max(height[i], leftmax[i-1]);
   }
   int rightmax[]=new int[n];
   rightmax[n-1]=height[n-1];

   for(int i=n-2;i>=0;i--){
   rightmax[i]=Math.max(height[i], rightmax[i+1]);
   }
   int Trappwater=0;
   for(int i=0;i<n;i++){
   int waterlevel=Math.min(leftmax[i], rightmax[i]);
   Trappwater += (waterlevel-height[i]);
   }
   return Trappwater;
   }
   // public static int RmoveDublicate(int nums[],int val){
   // int cout=0;
   // for(int i=0;i<nums.length;i++){
   // if(nums[i]!=val){
   // nums[cout]=nums[i];
   // cout++;
   // }

   // }
   // return cout;
   // }

   // public static int searchInsert(int[] nums, int target) {
   // int start=0;
   // int end=nums.length-1;
   // while(start<= end){
   // int mid=(start+end)/2;
   // if(nums[mid]==target){
   // return mid;
   // }if(nums[mid]<target){
   // start=mid+1;
   // }else{
   // end=mid-1;
   // }
   // }
   // return start;
   // }
   // public static boolean ifinArray(int arr[]){
   // for(int i=0;i<arr.length-1;i++){
   // for(int j=i+1;j<arr.length;j++){
   // if(arr[i]==arr[j]){
   // return true;
   // }
   // }
   // }
   // return false;
   // }

   // public static void mergeSortedarray(int nums1[],int m,int nums2[],int n){
   // int p=m-1;
   // int q=n-1;
   // int l[]=new int [m+n];
   // for(int i=l.length-1;i>=0;i--){
   // int val1= p>=0?nums1[p]:Integer.MIN_VALUE;
   // int val2= q>=0?nums2[q]:Integer.MIN_VALUE;
   // if(val1 >val2){
   // l[i]=nums1[p];
   // p--;
   // }else{
   // l[i]=nums2[q];
   // q--;
   // }
   // }
   // for(int i=0 ;i<l.length;i++){
   // System.out.print(l[i]);
   // }
   // }

   // public static int Mostwater(int height[]){
   // int a=0;
   // int b=height.length-1;
   // int maxwater=0;
   // while(a<b){
   // int mincurrwater=Math.min(height[a],height[b]);
   // int currwater=mincurrwater*(b-a);
   // maxwater=Math.max(currwater, maxwater);
   // if(height[a]>height[b]){
   // b--;
   // }else{
   // a++;
   // }
   // }
   // return maxwater;
   // }

   // public static int ThreeClosetsum(int nums[],int target){
   // Arrays.sort(nums);
   // int res=0;
   // int gap=Integer.MAX_VALUE;
   // for(int i=0;i<nums.length-2;i++){
   // int lf=i+1;
   // int ri=nums.length-1;
   // while(lf<ri){
   // int sum=nums[i]+nums[ri]+nums[lf];
   // if(sum<target){
   // lf++;
   // int ngap=target-sum;
   // if(ngap<gap){
   // gap=ngap;
   // res=sum;
   // }
   // }else if(sum>target){
   // ri--;
   // int ngap=sum-target;
   // if(ngap<gap){
   // gap=ngap;
   // res=sum;

   // }
   // }else{
   // return sum;
   // }

   // }
   // }
   // return res;
   // }
   // public static void nextPermutetion(int nums[]){
   // int l=nums.length;
   // int n=l-2;
   // while(n>=0){
   // if(nums[n]<nums[n+1]) break;
   // n--;
   // }
   // if(n<0){
   // Arrays.sort(nums);
   // for(int i=0;i<l;i++){
   // System.out.print(nums[i]);
   // }
   // return;
   // }

   // for(int i=l-1;i>n;i--){
   // if(nums[i]>nums[n]){
   // int temp=nums[i];
   // nums[i]=nums[n];
   // nums[n]=temp;
   // break;
   // }
   // }
   // Arrays.sort(nums,n+1,l);

   // for(int i=0;i<l;i++){
   // System.out.print(nums[i]);
   // }
   // }

   // public static int searchRotetedArray(int nums[],int target){
   // int n=nums.length;
   // int start=0;
   // int end=n-1;
   // while(start<=end){
   // int mid=(start+end)/2;
   // if(nums[mid]==target){
   // return mid;
   // }
   // if(nums[start]<=nums[mid]){
   // if(target<nums[mid] && target>=nums[start]){
   // end=mid-1;
   // }
   // else{
   // start=mid+1;
   // }
   // }else{
   // if(target>nums[mid]&& target<=nums[end]){
   // start=mid+1;
   // }else{
   // end=mid-1;
   // }
   // }
   // }
   // return-1;

   // }

   // public static int[] SearchFristandLastindex(int[] nums, int target) {
   // int left = leftsearch(nums, target);
   // int right = rightsearch(nums, target);
   // return new int[] { left, right };
   // }

   // public static int leftsearch(int nums[], int target) {
   // int index = -1;
   // int start = 0;
   // int end = nums.length - 1;
   // while (start <= end) {
   // int mid = (end + start) / 2;
   // if (nums[mid] == target) {
   // index = mid;
   // end = mid - 1;
   // } else if (nums[mid] < target) {
   // start = mid + 1;
   // } else {
   // end = end - 1;
   // }
   // }
   // return index;
   // }

   // public static int rightsearch(int nums[], int target) {
   // int index = -1;
   // int start = 0;
   // int end = nums.length - 1;
   // while (start <= end) {
   // int mid = (end + start) / 2;
   // if (nums[mid] == target) {
   // index = mid;
   // start = mid + 1;
   // } else if (nums[mid] < target) {
   // start = mid + 1;
   // } else {
   // end = end - 1;
   // }
   // }
   // return index;
   // }
   // public static void roted(int arr[]){
   // int s=0;
   // int e=arr.length-1;
   // while (s<=e) {
   // int temp=arr[s];
   // arr[s]=arr[e];
   // arr[e]=temp;
   // s++;
   // e--;
   // }
   // for(int i=0;i<arr.length;i++){
   // System.out.print(arr[i]);
   // }
   // }

   // public static int buyandSellstock(int prices[]){
   // int buyprice=Integer.MAX_VALUE;
   // int max_profit=0;
   // for(int i=0;i<prices.length;i++){
   // if(buyprice<prices[i]){
   // int profit=prices[i]-buyprice;
   // max_profit=Math.max(max_profit,profit);
   // }else{
   // buyprice=prices[i];
   // }
   // }
   // return max_profit;
   // }

   // public static int kthlargestelement(int nums[],int k){
   // Arrays.sort(nums);
   // int lar=(nums.length-k);
   // int largest=nums[lar];
   // return largest;
   // }

   // public static int [] prouctofarrayexceptself(int nums[]){
   // int n=nums.length;
   // int prifixproductfromstart[]=new int [n];
   // int prifixproductfromend[]=new int[n];
   // int res[]=new int [n];
   // prifixproductfromstart[0]=nums[0];
   // for(int i=1;i<n;i++ ){
   // prifixproductfromstart[i]=prifixproductfromstart[i-1]*nums[i];
   // }
   // prifixproductfromend[n-1]=nums[n-1];
   // for(int i=n-2;i>=0;i--){
   // prifixproductfromend[i]=prifixproductfromend[i+1]*nums[i];
   // }
   // res[0]=prifixproductfromend[1];
   // res[n-1]=prifixproductfromstart[n-2];
   // for(int i=1;i<n-2;i++){
   // res[0]=prifixproductfromend[i-1]*prifixproductfromstart[1+1];
   // }
   // return res;
   // }
   // public static int maxprosubarray(int nums[]){
   // int ans=nums[0];
   // int ma=ans;
   // int mi=ans;
   // int n=nums.length;
   // for(int i=1;i<n;i++){
   // if(ma<0){
   // ma=mi;
   // }
   // ma=Math.max(nums[i],ma*nums[i]);
   // mi=Math.min(nums[i],nums[i]*mi);
   // ans=Math.max(ans,ma);
   // }
   // return ans;
   // }

   // public static int minInsortedRotetedArray(int nums[]) {
   //    int ans = Integer.MAX_VALUE;
   //    int st = 0;
   //    int ed = nums.length - 1;
   //    while (st <= ed) {
   //       int mid = (st + ed) / 2;
   //       if (nums[mid] >= nums[st]) {
   //          if (ans > nums[st]) {
   //             ans = nums[st];
   //             st = mid + 1;
   //          } else {
   //             st = mid + 1;
   //          }
   //       } else {
   //          if(ans>nums[mid]){
   //         ans = nums[mid];
   //         ed=mid-1;
   //          }
            
   //          ed = mid - 1;
   //       }
   //    }
   //    return ans;
   // }
   // public static int mininsortedroted(int nums[]){
   //    int n=nums.length;
   //    int ans=Integer.MAX_VALUE;
   //    int st=0;
   //    int ed=n-1;
   //    while (st<=ed) {
   //       if(nums[st]<nums[ed]){
   //          ans=Math.min(nums[st],ans);
   //         return ans;
   //       }
   //       int mid=(st+ed)/2;
   //       if(nums[mid]>=nums[st]){
   //          ans=Math.min(nums[st],ans);
   //          st=mid+1;
   //       }else{
   //          ans=Math.min(nums[mid],ans);
   //          ed=mid-1;
   //       }
   //    }
   //    return ans;
   // }

   // public static int missingNumber(int nums[]){
   //    int n=nums.length+1;
   //    int curr=0;
   //    for(int i=0;i<nums.length;i++){
   //       curr+=nums[i];
   //    }
   //    int miss=((n*(n+1))/2)-curr;
   //    return miss;
   // }
   //   public static boolean containublicate(int nums[]){
   //    Arrays.sort(nums);
   //    for(int i=0;i<nums.length-1;i++){
   //       if(nums[i]==nums[i+1]){
   //          return true; 
   //       }
   //    }
   //    return false;
   //   }

   public static int[] lastDiditPluse(int arr[]){
      int n=arr.length;
      for(int i=n-1;i>=0;i--){
        int  lastdigit=arr[i];
          lastdigit++;
      }
     return arr;
   }
   public static int maxCost(int nums[]){
      int minc=0;
      int minl=0;
      for(int i=0;i<nums.length;i++){
         if(nums[i]<0 && nums[i]!=0){
            minc++;
         }else if(nums[i]>0 && nums[i]!=0) {
            minl++;
         }
      }
      int res=Math.max(minc, minl);
      return res;
   }
   public static int[] intersectonOfTwoArray(int nums1[],int nums2[]){
      int n=Math.max(nums1.length,nums2.length);
      int k=0;
      int res[]=new int[n];
      for(int i=0;i<nums1.length;i++){
         for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
               res[k]=nums2[j];
               k++;
            }
         }
         
      }
      return res;
   }
   public static int maxprofitStock(int stock []){
        int maxpr=0;
        for(int i=1;i<stock.length;i++){
      if(stock[i]>stock[i-1])
            maxpr+=(stock[i]-stock[i-1]);
        }
        return maxpr;
   }
   public static void main(String[] args) {
   //    int arr1[] = {8,5,4,3,2,1,0,9};
   //   System.out.println(TrappWater(arr1));




      // System.out.println(intersectonOfTwoArray(arr1, arr2));
      // System.out.println(maxCost(arr));
      //  System.out.println(lastDiditPluse(arr)); 
      // int tar=9;

      // int key=6;
      // System.out.println( BinarySearch(arr ,key));
      // print_Subarray(arr);

      // System.out.print("given array maxsum is="+max_Sum(arr));
      // System.out.print("given array maxsum is="+kadans(arr));
      // System.out.println(kadans(arr ));
      // System.out.println(TrappWater(arr));

      // System.out.println( RmoveDublicate(arr,key));
      // System.out.println(searchInsert(arr,tar));
      // System.out.println(ifinArray(arr));

      // mergeSortedarray(arr1,m,arr2,n);

      // System.out.println(Mostwater(arr));
      // System.out.println(ThreeClosetsum(arr,target));
      // nextPermutetion(arr);
      // System.out.println(searchRotetedArray(arr,target));
      // System.out.println(SearchFristandLastindex(arr, target));
      // roted(arr);
      // System.out.println(buyandSellstock(arr));
      // System.out.println(kthlargestelement(arr, k));
      // System.out.println(prouctofarrayexceptself(arr));
      // System.out.println(maxprosubarray(arr));
      // System.out.println(minInsortedRotetedArray(arr));
         // System.out.println(mininsortedroted(arr));
         // System.out.println(threeSum(arr, k));
         // System.out.println(missingNumber(arr));
         // System.out.println(containublicate(arr));
         char arr[]={'1','1','3','4','5'};
         for(char i=0;i<=4;i++){
            
             System.out.println(arr[i]);
         }
         
   }
}