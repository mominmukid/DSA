import java.util.ArrayList;

public class matrix {
    public static void findLargestAndSmallest(int arr[][]){
        int largest=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                largest=Math.max(arr[i][j],largest);
                small=Math.min(arr[i][j],small);
            }
        }
        System.out.println("Given matrix in largest element is "+largest+" and smallest element is "+small);
    }

     public static ArrayList<Integer> sprialMatrix(int matrix[][]){
        ArrayList <Integer>lt=new ArrayList<>();
        int stcol=0;
        int edcol=matrix[0].length-1;
        int strow=0;
        int edrow=matrix.length-1;
        while(stcol<=edcol && strow<=edrow){
            // code for top
            for(int j=stcol;j<=edcol;j++){
                lt.add(matrix[strow][j]);
                
            }
            //code for right col
            for(int i=strow+1;i<=edrow;i++){
               lt.add(matrix[i][edcol]);
            } 
            //code for bottom
            for(int j=edcol-1;j>=stcol;j--){
                if(strow == edrow){
                    break ;
                }
                lt.add(matrix[edrow][j]);
            }
            //code for left
            for(int i=edrow-1;i>=strow+1;i--){ 
                if(stcol == edcol){
                    break ;
                }
                lt.add(matrix[i][stcol]);
            }
            stcol++;
            strow++;
            edcol--;
            edrow--;
        }
        return lt;
     }
     public static int digonalSum(int arr[][]){
        int sum=0;
        // ************bruite force *****************
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(i==j){
        //             sum+=arr[i][j];
        //         }else if(i+j == arr.length-1){
        //             sum+=arr[i][j];
        //         }
        //     }
        // }
        //**************optimize***********
        for(int i=0;i<arr.length;i++){

            sum+=arr[i][i];
            if(i != arr.length-1-i){
                sum+=arr[i][arr.length-i-1];
            }
        }
        return sum;
     }
     public static boolean searchInMatrix(int matrix[][],int key){
        //**************this aproch top to bottom ****************\\
        if(matrix[0][0]==key){
            return true;
        }
       int strow=0;
       int stcol=matrix[0].length-1;
       while(strow<matrix.length && 0<stcol){
            if(matrix[strow][stcol]==key){
                System.out.println("the key at point= ("+strow+","+stcol+")");
                return true;
            }
            if(matrix[strow][stcol]>key){
               stcol--;
            }else{
                strow++;
            }
       }
       System.out.println("the key is not found");
      
       return false;


    //***********************aproch for bottom to top */
//     int row=matrix.length-1;
//     int col=0;
//     while (row>0 && col<matrix[0].length-1) {
//         if(matrix[row][col]== key){
//             System.out.println("the key at point= ("+row+","+col+")");
//             return true;
//         }
//         else if(matrix[row][col]>key){
//             row--;
//         }else{
//             col++;
        
//     }
// }
//     System.out.println("the key is not found");
//     // System.out.println(matrix[matrix.length-1][0]);
//     return false;
     
    }
    public static int printsum(int arr[][],int key){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    sum++;
                }
            }
        }
        return sum;
    } 
    public static int printsecondrowSum(int arr[][]){
        int i=1;
        int sum=0;
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];
        }
        return sum;
    }
    public static void Traspore(int arr[][]){
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
         }
         System.out.println();
        }
    }
    public static void digonalsum(int arr[][]){
        int n=arr.length;
        double di=0;
        int ans=0;
        for(int i=0;i<n;i++){
            double cdi=Math.sqrt(arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1]);
            if(cdi>di){
                if(cdi==di){
                    ans=Math.max(ans, arr[i][0]*arr[i][1]);
                }else{
                    ans=arr[i][0]*arr[i][1];
                    cdi=di;
                }

            }
        }
        System.out.println(ans);
    }
   public static void main(String[] args) {
     int arr[][]={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
    };
   System.out.println(sprialMatrix(arr)); 
     
    //  System.out.println(printsecondrowSum(arr));
    
    //  System.out.println(printsum(arr, key));
    //  System.out.println(searchInMatrix(arr,key)); 
    //  System.out.println(digonalSum(arr));
    //  sprialMatrix(arr);
    //  findLargestAndSmallest(arr);
   }
}
