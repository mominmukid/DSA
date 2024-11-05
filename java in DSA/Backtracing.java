import java.util.Scanner;

public class Backtracing {
  public static void prinarr(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
    public static void fillTheArray(int arr[],int i,int num){
        if(i==arr.length){
            prinarr(arr);
            return;
        }
        arr[i]=num;
        fillTheArray(arr, i+1, num+1);
        arr[i]=arr[i]-2;
    }

    public static void findSubset(String str,int i,String ans){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        //kaam
        // charecter yes choise
        findSubset(str, i+1, ans+str.charAt(i));
      // charecter no choise
      findSubset(str, i+1, ans);
        
    }


    public static void permutetion(String str,String ans){
       if(str.length()==0){
        System.out.print(ans+" ");
       }
       for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        String newstr=str.substring(0, i)+str.substring(i+1);
        permutetion(newstr, ans+curr);
       }
    }




//******************NQueen Start ************************* */


    public static boolean isSafe(char board[][],int row,int col){
        //code for up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
            // code for digonal left up
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            //code for digonal right up
            for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
                if(board[i][j]=='Q'){
                    return false;
                }
            }
            return true;
    }
    public static void nQueensAllpermutetin(char board[][],int row){
        if(row==board.length){
            printQueen(board);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='Q';
            nQueensAllpermutetin(board, row+1);
            board[row][i]='X';
            }
        }
    }


    public static boolean nQueensAllpermutetinonesol(char board[][],int row){
        if(row==board.length){
           count++;
            return true;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
            board[row][i]='Q';
           if( nQueensAllpermutetinonesol(board, row+1)){
             return true;
           }
            board[row][i]='X';
            }
        }
        return false;
    }

    public static boolean isSafe2(char board[][],int row,int col){
        //code for up
        // for(int i=row-1;i>=0;i--){
        //     if(board[i][col]=='Q'){
        //         return false;
        //     }
        // }
            // code for digonal left up
            for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
                if(board[i][j]=='$'){
                    return false;
                }
            }
            //code for digonal right up
            for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
                if(board[i][j]=='$'){
                    return false;
                }
            }
            return true;
    }
    public static void nQueensAllpermutetinCount(char board[][],int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
             board[row][i]='Q';
            nQueensAllpermutetinCount(board, row+1);
            board[row][i]='X';
            }
        }
    }

   public static long count=0;
    public static void nKnightplace(char board[][],int row){
        if(row==board.length){
           count++;
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe2(board, row, i)){
                board[row][i]='$';
                nKnightplace(board, row+1);
                board[row][i]='X';
            }
        }
    }
  
//*********************************NQueen End******************** */

//******************grid ways */

public static int gridWays(int i,int j,int n,int m){
    if(i==n-1 || j==m-1){//last cell condition
        return 1;
    }else if(i==n || j==m){ //boundray condition
      return 0;
    }
    int w1=gridWays(i+1, j, n, m);
    int w2=gridWays(i, j+1, n, m);
    return w1+w2;
}





    public static void printQueen(char arr[][]){
        System.out.println("------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }



















       public static boolean isSafe5(char [][] board, int row ,int col,char digi ){
        for(int i=0;i<=8;i++){
            if(board[i][col]==digi)return false;
        }
        for(int i=0;i<=8;i++){
            if(board[row][i]==digi)return false;
        }
        int st=(row*3)/3;
        int ed=(col*3)/3;
        for(int i=st;i<st+3;i++){
            for(int j=ed;j<ed+3;j++){
                if(board[i][j]==digi){
                    return false;
                }
            }
        }
        return true;
       }
    public static boolean soduku(char board[][],int row,int col){
        if(row==9){
            return true;
        }
            int nextrow=row;
            int nextcol=col+1;
            if(col+1==9){
                nextrow=row+1;
            nextcol=0;
            }
            if(board[row][col]=='.'){
               return soduku(board, nextrow, nextcol);
            }

            for(char i=1;i<=9;i++){
                char j=i;
                if(isSafe5(board, row, col,i)){
                    board[row][i]=i;
                    if(soduku(board, nextrow, nextcol)){
                        return true;
                    }else{
                        board[row][col]='.';
                    }
                }
            }
            return false;
        }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
     char board1[][]={
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
     };


    //    int n=10,m=10;
    //    System.out.println(gridWays(0, 0, n, m));

soduku(board1, 0, 0);





    //     int n=sc.nextInt();
    //  char board[][]=new char[n][n];
    //  for(int i=0;i<board.length;i++){
    //     for(int j=0;j<board.length;j++){
    //         board[i][j]='X';
    //     }
    // }
    //   if( nQueensAllpermutetinonesol(board,0)==true){
    //     System.out.println("Solution is posible ");
    //     printQueen(board);
    //   }else{
    //     System.out.println("Solution is not possible");
      

    // nKnightplace(board, 0);
    // System.out.println(count)

//   nQueensAllpermutetinCount(board,0);  
//   System.out.println(count);


        // String str="ABC";
        // permutetion(str,"");

        // findSubset(str, 0, "");

    //   int arr[]=new int [5];
    //   int i=0;
    //   int j=1;
    //   fillTheArray(arr, i, j);
    //   prinarr(arr);

     
     

    }
    
}
