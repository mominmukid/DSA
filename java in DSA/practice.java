// import java.util.Scanner;

public class practice {

  // public static boolean isSafe(char board [][], int row){
  //   if(boa)
  // }
  // public static void nQueen(char board [][],int row){
  //   if(row == board.length){
  //   //  printBoard(board);
  //   return;
  //   }
  //   // column loop
  //   for(int j=0;j<board.length;j++){
  //     board[row][j]='Q';
  //     nQueen(board, row+1);
  //     board[row][j]='X';
  //   }
  // }
  //   public static void printBoard(char board[][]){
  //     for (int i=0;i<=board.length;i++){
  //       for(int j=0;j<board.length;j++){
  //         System.out.println(board[i][j]);
  //       }
  //       System.out.println();
  //     }
  //   }
  // public static void pt(int n){
  //   for (int i=1; i<n;i++){
  //       for(int j=1;j<n-i+1;j++){
  //           System.out.print(j);
  //       }
  //       System.out.println();
  //   }

  // }
  // public static void zero_One_pattern(int n){
  //   for (int i=0;i<n;i++){
  //     for(int j=0;j<i;j++){
  //       if((i+j)%2 ==0){
  //         System.out.print("0 ");
  //       }else{
  //         System.out.print("1 ");
  //       }
  //     }
  //     System.out.println();
  //   }
  // }
    // public static void butterly_Pattrn(int n){
    //   for(int i=1;i<=n;i++){
    //       for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //       }
    //       for(int j=1;j<=2*(n-i);j++){
    //         System.out.print("  ");
    //       }
    //        for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //       }
    //       System.out.println();
    //   }
    //   for(int i=n;i>=1;i--){
    //       for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //       }
    //       for(int j=1;j<=2*(n-i);j++){
    //         System.out.print("  ");
    //       }
    //        for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //       }
    //       System.out.println();
    //   }
    // }

    // public static void Rombas(int n){
    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=(n-i);j++){
    //       System.out.print("  ");
    //     }
    //     for (int j=1;j<=n;j++){
    //       System.out.print("* ");
    //     }
    //     System.out.println();
    //   }

    // }
      //   public static void hollow_Rombas(int n){
      //      for(int i=1;i<=n;i++){
      //   for(int j=1;j<=(n-i);j++){
      //     System.out.print("  ");
      //   }
      //   for (int j=1;j<=n;j++){
      //       if(i==1 || j==1 || i==n || j==n){
      //         System.out.print("* ");
      //       }else{
      //         System.out.print("  ");
      //       }
      //   }
      //   System.out.println();
      // }

      //   }
      public static void diamond(int n){
         for(int i=1;i<=n;i++){
          for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
          }
          for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
          }
          System.out.println();
         }
         for(int i=n;i>=1;i--){
          for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
          }
          for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
          }
          System.out.println();
         }
      }
      public static void number_Piramid(int n){
        for(int i=1;i<=n;i++){
          for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
          }
          for(int j=1;j<=(2*i)-1;j++){
            System.out.print(i);
          }
          System.out.println();
         }
      }

  public static void main(String[] args) {
     int n=5;
  number_Piramid(n);
  }
}
