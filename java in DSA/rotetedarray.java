// import java.util.*;

import java.util.Scanner;

public class rotetedarray {

  public static int search(int A[], int l, int h, int key) {
    if (l > h) {
      return -1;
    }
    // element L1
    int mid = l + (h - l) / 2;
    if (A[mid] == key) {
      return mid;
    }
    if (A[l] <= A[mid]) {
      if (A[l] <= key && key <= A[mid]) {
        return search(A, l, mid - 1, key);
      } else {
        return search(A, mid + 1, h, key);
      }
    }
    //element L2
    else {
      if (A[mid] <= key && A[h] > key) {
        return search(A, mid + 1, h, key);
      } else {
        return search(A, l, mid - 1, key);
      }
    }
  }

  public static void main(String[] args) {
    int A[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
    System.out.print("Enter your expected key =");
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int tarIn = search(A, 0, A.length - 1, target);
    System.out.println("your given key at this index=" + tarIn);
  }
}
