import java.lang.reflect.Array;
import java.util.*;

public class string {

  public static boolean ispalendrom(String s) {
    s = s.toLowerCase();
    int n = s.length();
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < n; i++) {
      if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
        b.append(s.charAt(i));
      }
    }
    int k = b.length() - 1;
    for (int i = 0; i < b.length(); i++) {
      if (b.charAt(i) != b.charAt(k - i)) return false;
    }
    return true;
  }

  public static float shortestPath(String s) {
    int n = s.length();
    int x = 0;
    int y = 0;
    float ans = 0;
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c == 'S') {
        y--;
      } else if (c == 'N') {
        y++;
      } else if (c == 'W') {
        x--;
      } else {
        x++;
      }
    }
    ans = (float) Math.sqrt(x * x + y * y);
    return ans;
  }

  public static String Cutsrring(String s, int a, int b) {
    String c = "";
    for (int i = a; i < b; i++) {
      c += s.charAt(i);
    }
    return c;
  }

  public static String largestStr(String a, String b, String c) {
    if (
      a.compareToIgnoreCase(b) > 0 && a.compareToIgnoreCase(c) > 0
    ) return a; else if (
      b.compareToIgnoreCase(a) > 0 && b.compareToIgnoreCase(c) > 0
    ) return b; else return c;
  }

  public static String toUppercase(String s) {
    StringBuilder b = new StringBuilder();
    char ch = Character.toUpperCase(s.charAt(0));
    b.append(ch);

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == ' ' && i < s.length()) {
        b.append(s.charAt(i));
        i++;
        b.append(Character.toUpperCase(s.charAt(i)));
      } else {
        b.append(s.charAt(i));
      }
    }
    return b.toString();
  }

  public static String compressString(String s) {
    StringBuilder a = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      Integer count = 1;
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        count++;
        i++;
      }
      a.append(s.charAt(i));
      if (count > 1) {
        a.append(count);
      }
    }
    return a.toString();
  }

  public static int ovwlCount(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (
        s.charAt(i) == 'a' ||
        s.charAt(i) == 'e' ||
        s.charAt(i) == 'i' ||
        s.charAt(i) == 'o' ||
        s.charAt(i) == 'u'
      ) {
        count++;
      }
    }
    return count;
  }

  public static boolean isanagram(String s, String t) {
    char a[] = s.toCharArray();
    char b[] = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if (a.length != b.length) return false; else {
      for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
    }
    return true;
  }

  public static String removeDublicate(String s) {
    StringBuilder newstrin = new StringBuilder();
    boolean map[] = new boolean[26];
    for (int i = 0; i < s.length(); i++) {
      if (map[s.charAt(i) - 'a'] == false) {
        newstrin.append(s.charAt(i));
        map[s.charAt(i) - 'a'] = true;
      }
    }
    return newstrin.toString();
  }

  public static String reverse(String str) {
    StringBuilder str2 = new StringBuilder();
    int st = 0;
    int ed = str.length() - 1;
    while (st <= ed) {
      str2.append(str.charAt(ed));
      ed--;
    }
    return str2.toString();
  }

  public static void Reverse(String str, int i) {
    if (i == 0) {
      System.out.println(str.charAt(i));
      return;
    }
    System.out.print(str.charAt(i) + " ");
    Reverse(str, i - 1);
  }

  public static void swapi(String str[]) {
    int i = 0;
    int j = 1;
    System.out.println(str[j].compareTo(str[i]));
  }

  public static String revereseTheWord(String str) {
    //  StringBuilder str2=new StringBuilder();
    ArrayList<Integer> al = new ArrayList<>();
    al.add(0);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '.') {
        al.add(i);
      }
    }
    al.add(str.length());
    String s = "";
    for (int i = al.size() - 2; i > 0; i--) {
      s += str.substring(al.get(i) + 1, al.get(i + 1));
      s += '.';
    }
    s += str.substring(al.get(0), al.get(1));
    return s;
  }

  //********************* Soduku solver*************** */
  public static boolean isafe3(int soduku[][], int row, int col, int digit) {
    //code for column
    for (int i = 0; i <= 8; i++) {
      if (soduku[row][i] == digit) {
        return false;
      }
    }
    //code for row
    for (int j = 0; j <= 8; j++) {
      if (soduku[j][col] == digit) {
        return false;
      }
    }
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (soduku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean sodukuSolver(int soduku[][], int row, int col) {
    if (row == 9) {
      return true;
    }
    int nextrow = row;
    int nextcol = col + 1;
    if (col + 1 == 9) {
      nextrow = row + 1;
      nextcol = 0;
    }
    if (soduku[row][col] != 0) {
      return sodukuSolver(soduku, nextrow, nextcol);
    }
    for (int i = 1; i <= 9; i++) {
      if (isafe3(soduku, row, col, i)) {
        soduku[row][col] = i;
        if (sodukuSolver(soduku, nextrow, nextcol)) {
          return true;
        } else {
          soduku[row][col] = 0;
        }
      }
    }
    return false;
  }

  static void printsoduku(int arr[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int soduku[][] = {
      { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
      { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
      { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
      { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
      { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
      { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
      { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
      { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
      { 8, 2, 7, 0, 0, 9, 0, 1, 3 },
    };
    
    if (sodukuSolver(soduku, 0, 0)) {
      System.out.println("solution exists");
      printsoduku(soduku);
    } else {
      System.out.println("solution not exist");
    }
    //  swapi(str);

    // String str = new String("abcdefghijklmnopqrstuvwxyz");
    // int i=str.length()-1;
    // Reverse(str, i);
    // String a="apnnacollage";
    // System.out.println(removeDublicate(a));
    // System.out.println('b'-'a');
  }
}
