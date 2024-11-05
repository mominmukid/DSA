public class sorting {
    public static void bobblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void salection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int pri = i - 1;
            while (pri >= 0 && arr[pri] > curr) {
                arr[pri + 1] = arr[pri];
                pri--;

            }
            arr[pri + 1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Countsotr(int arr[]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            lar = Math.max(lar, arr[i]);
        }
        int count[] = new int[lar + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void DessendingBooble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void DESsalectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int lar = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[lar] < arr[j]) {
                    lar = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lar];
            arr[lar] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSortDescending( int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int minPos = turn;
            for (int j = turn+1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

            public static void desInsetionsort(int arr[]){
                for(int i=1;i<arr.length;i++){
                    int curr=arr[i];
                    int pri=i-1;
                        while (pri>=0 && arr[pri]<curr) {
                            arr[pri+1]=arr[pri];
                            pri--;
                        }
                        arr[pri+1]=curr;
                }
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]);
                }
            }

            public static void CountDeseningsort(int arr[]){
                int lar=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                    lar=Math.max(lar, arr[i]);
                }
                int count[]=new int [lar+1];
                for(int i=0;i<arr.length;i++){
                    count[arr[i]]++;
                }
                int j=0;
                for(int i=count.length-1;i>=0;i--){
                    while (count[i]>0) {
                        arr[j]=i;
                        j++;
                        count[i]--;
                    }

                }
                for (int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
            }
    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bobblesort(arr);
        // salection(arr);
        // insertion(arr);
        // Countsotr(arr);
        // DessendingBooble(arr);
        // DESsalectionSort(arr);
        // selectionSortDescending(arr);
        // desInsetionsort(arr);
       CountDeseningsort(arr);

    }
}
