public class sum {
    
    // public static void sumarray(int num[]){
    //     int currsum=0;
    //     int maxsam =Integer.MIN_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         for (int j=i; j<num.length;j++){
    //             currsum=0;
    //             for(int k=i;k<j;k++){
    //                 currsum=currsum+num[k];
    //                 if(currsum>maxsam){
    //                     maxsam=currsum;
    //                 }
    //             }
    //             System.out.print("the sum of number="+currsum);
    //             System.out.println();
    //         }
            
    //     }
    //     System.out.println("the max sum="+maxsam);

//  }
public static void squr(int s){
    for(int i=s;i<=200;i++ ){
        System.out.println(i*i+" is the square of "+i);
    }

}
 public static void main(String []args){
    int num[]={2,4,6,8,10};
    // sumarray(num);

    squr(1);
 }

}