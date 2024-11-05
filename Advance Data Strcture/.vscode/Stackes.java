  import java.util.*;;
public  class Stackes {
    public static void pushThe(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top=st.pop();
        pushThe(st, data);
        st.push(top);
    }
    public static String reverseStr(String str){
        Stack <Character> ch=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            ch.push(str.charAt(idx));
            idx++;
        }
        StringBuilder st=new StringBuilder("");
        while (!ch.isEmpty()) {
            char curr=ch.pop();
            st.append(curr);
        }
        return st.toString();
    }
    public static void reversInt(Stack<Integer>st){
            if(st.isEmpty()){
                return;
            }
            int top=st.pop();
            reversInt(st);
            pushThe(st, top);
    }


    public static void stockSpan(int arr[],int span[]){
        Stack <Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<arr.length;i++){
            int currprice=arr[i];
            while(!s.isEmpty() && currprice >arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
               int prehigh=s.peek();
               span[i]=i-prehigh;
            }
            s.push(i);
        }
    }
    public static void nextLargest(int arr[],int ans[]){
          Stack <Integer>s=new Stack<>();
          for(int i=arr.length-1;i>=0;i--){
            int curr=arr[i];
            while(!s.isEmpty() && curr>=arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
          }
    }

    public static int maxProft(int stock[]){
        int maxProft=0;
        for(int i=1;i<stock.length;i++){
            int currpro=0;
            if(stock[i]>stock[i-1]){
            currpro=stock[i]-stock[i-1];
            maxProft+=currpro;
            }
        }
        return maxProft;
    }

    public static void sprialMatrix(int mat[][]){
        // int ans[]=new int[mat.length+mat[0].length];
        // int k=0;
        int strow=0;
        int edrow=mat.length-1;
        int stcol=0;
        int edcol=mat[0].length-1;
        while(strow <= edcol && stcol <=edcol){
            //top
           for(int i=stcol;i<edcol;i++){
               System.out.print( mat[strow][i]+" ");
               
           }
           //right side
           for(int j=strow+1;j<=edrow;j++){
                System.out.print( mat[j][edcol]+" ");
           }
           //bottom
           for(int i=edcol-1;i>=stcol;i--){
                if(stcol==edcol){
                    break;
                }
              System.out.print(mat[edrow][i]+" ");
           }
           //left
           for(int j=edrow-1;j>strow+1;j--){
            if(strow==edrow){
                break;
            }
            System.out.println(mat[j][stcol]+" ");
           }
           stcol++;
           strow++;
           edcol--;
           edrow--;
        }
    }

    //   public static boolean validParanthisis(String str){
    //     Stack <Character> s=new Stack<>();
    //     if(str.length()==1){
    //         return false;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
    //             s.push(str.charAt(i));
    //         }else{
    //             if(s.isEmpty()){
    //                 return false;
    //             }
    //             else if(s.peek()=='(' && str.charAt(i)==')'){
    //                 s.pop();
    //             }
    //             else if(s.peek()=='[' && str.charAt(i)==']'){
    //                 s.pop();
    //             }
    //            else if(s.peek()=='{' && str.charAt(i)=='}'){
    //                 s.pop();
    //             }else{
    //                 return false;
    //             }
    //         }
    //     }
    //    if(!s.isEmpty()){
    //     return false;
    //    }
    //     return true;
    //   }

    //   public static boolean isvalid(String str){
    //     Stack<Character>s=new Stack<>();
    //     for(int i=0;i<str.length();i++){
    //         char ch=str.charAt(i);
    //         if(ch==')'){
    //             int count=0;
    //                 while( s.peek()!='('){
    //                     s.pop();
    //                     count++;
    //                 }
    //                 if(count<1){
    //                     return true;
    //                 }else{
    //                     s.pop();
    //                 }
    //         }else{
    //             s.push(ch);
    //         }
    //     }
    //     return false;
    //   }

    public  static int[] leftsmaller(int arr[],int ans[]){
        Stack <Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
                int curr=arr[i];
                while(!s.isEmpty() && curr<=arr[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=arr.length;
                }else{
                    ans[i]=s.peek();
                }
                s.push(i);
              }
              return ans;
        }
    

        public  static int[] rightsmaller(int arr[],int ans[]){
            Stack <Integer>s=new Stack<>();
        
            for(int i=0;i<arr.length;i++){
                    int curr=arr[i];
                    while(!s.isEmpty() && curr<=arr[s.peek()]){
                        s.pop();
                    }
                    if(s.isEmpty()){
                        ans[i]=-1;
                    }else{
                        ans[i]=s.peek();
                    }
                    s.push(i);
                  }
                  return ans;
            }

            public static int maxHistogram(int arr[]){
                int maxhost=Integer.MIN_VALUE;
                int rigtmin[]=new int[arr.length];
                int leftmin[]=new int[arr.length];
                rightsmaller(arr, rigtmin);
                leftsmaller(arr, leftmin);
                for(int i=0;i<arr.length;i++){
                    int width=leftmin[i]-rigtmin[i]-1;
                    int currh=arr[i]*width;
                    maxhost=Math.max(maxhost, currh);
    
                }
               return maxhost;
            }

            public static void trapwater(int arr[]){
                Stack <Integer>s=new Stack<>();
                int leftmax[]=new int[arr.length];
                int rightmax[]=new int [arr.length];
                for(int i=0;i<arr.length;i++){
                    int curr=arr[i];
                    while (!s.isEmpty() && curr >=s.peek()) {
                        s.pop();
                    }
                    if(s.isEmpty()){
                        leftmax[i]=arr[i];
                    }else{
                        leftmax[i]=s.peek();
                    }
                    s.push(curr);
                }

                    s=new Stack<>();
                for(int i=arr.length-1;i>=0;i--){
                    int curr=arr[i];
                    while (!s.isEmpty() && curr >=s.peek()) {
                        s.pop();
                    }
                    if(s.isEmpty()){
                      rightmax[i]=arr[i];
                    }else{
                        rightmax[i]=s.peek();
                    }
                    s.push(curr);

                }

                for(int i=0;i<arr.length;i++){
                    System.out.print(leftmax[i]+" ");
                }
                System.out.println();
                for(int i=0;i<arr.length;i++){
                    System.out.print(rightmax[i]+" ");
                }

                int tpwater=0;
                for(int i=0;i<arr.length;i++){
                    int waterlevel=Math.min(leftmax[i],rightmax[i]);
                    tpwater+=(waterlevel-arr[i]);
                }
                System.out.println(tpwater);
                }
            


                public static int maxWater(int[] height){
                    Stack<Integer> stack = new Stack<>();
                    int n = height.length;
                    int ans = 0;
                    for (int i = 0; i < n; i++) {
                    while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
                    int pop_height = height[stack.peek()];
                    stack.pop();
                    if (stack.isEmpty())
                    break;
                    int distance = i - stack.peek() - 1;
                    int min_height
                    = Math.min(height[stack.peek()],
                    height[i])
                    - pop_height;
                    ans += distance * min_height;
                    }
                    stack.push(i);
                    }
                    return ans;
                    }
    public static void main(String[] args) {


        int arr[]={7,0,4,2,5,0,6,4,0,5};
      System.out.println( maxWater(arr));
            // String str="(((a+b)+(c+d)))";
            // System.out.println(isvalid(str));

        // Stack<Integer>st=new Stack<>();
        // Stack<Integer> st=new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);

       
        // pushThe(st ,4);
    //    reversInt(st);
    //     while (!st.isEmpty()) {
    //         System.out.print(st.peek()+ "  ");
    //         st.pop();
    //     }

        
        // int arr[][]={
        //     {1,2,3,4, 5,  6},
        //     {7,8,9,10,11,12},
        //     {13,14,15,16,17},
        //     {18,19,20,21,22},
        //     {23,24,25,26,27}
        // };
        // sprialMatrix(arr);

    //    int arr[]={7,1,5,3,6,4};
    //    System.out.println(maxProft(arr));
       
       

         
         }
        }
    
    