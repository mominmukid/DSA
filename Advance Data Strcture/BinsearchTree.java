import java.util.*;

public class BinsearchTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (val > root.data) {
            root.right = insert(root.right, val);

        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static boolean isSrarch(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return isSrarch(root.left, key);
        }
        if (key > root.data) {
            return isSrarch(root.right, key);
        }
        return false;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node findInorderSucessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data < key) {
            root.right = delete(root.right, key);
        } else if (root.data > key) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node Is = findInorderSucessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.data >= low && root.data <= high) {
            int a = rangeSumBST(root.left, low, high) + 1;
            int b = rangeSumBST(root.right, low, high) + 1;
            return a + b;
        } else if (root.data <= high) {
            return rangeSumBST(root.left, low, high) + 1;
        } else {
            return rangeSumBST(root.right, low, high) + 1;
        }
    }

    public static void printpath(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void path(Node root, ArrayList<Integer> l) {
        if (root == null) {
            return;
        }
        l.add(root.data);
        if (root.left == null && root.right == null) {
            printpath(l);
            return;
        }
        path(root.left, l);
        path(root.right, l);
        l.remove(l.size() - 1);
    }

    public static boolean isvalidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return (isvalidBST(root.left, min, root) && isvalidBST(root.right, root, max));

    }

    public static Node mirrorTree(Node root) {
        if (root == null) {
            return null;
        }
        Node lft = mirrorTree(root.left);
        Node rht = mirrorTree(root.right);
        root.left = rht;
        root.right = lft;
        return root;
    }

    public static Node blanceBST(int arr[], int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        Node root = new Node(arr[mid]);
        root.left = blanceBST(arr, st, mid - 1);
        root.right = blanceBST(arr, mid + 1, ed);
        return root;

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder2(ArrayList<Integer> l, Node root) {
        if (root == null) {
            return;
        }
        inorder2(l, root.left);
        l.add(root.data);
        inorder2(l, root.right);
    }

    public static Node CreatBst(ArrayList<Integer> l, int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        Node root = new Node(l.get(mid));
        root.left = CreatBst(l, st, mid - 1);
        root.right = CreatBst(l, mid + 1, ed);
        return root;
    }

    public static Node balnceBST(Node root) {
        ArrayList<Integer> l = new ArrayList<>();
        inorder2(l, root);
        root = CreatBst(l, 0, l.size() - 1);
        return root;

    }

    public static class info3 {
        boolean isvalid;
        int size;
        int min;
        int max;

        public info3(boolean isvalid, int size, int min, int max) {
            this.isvalid = isvalid;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int MaxBS = 0;

    public static info3 largestBst(Node root) {
        if (root == null) {
            return new info3(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        info3 lft = largestBst(root.left);
        info3 rht = largestBst(root.right);
        int size = (lft.size + rht.size) + 1;
        int max = Math.max(lft.max, Math.max(root.data, rht.max));
        int min = Math.min(lft.min, Math.min(root.data, rht.min));

        if (root.data <= lft.max || root.data >= rht.min) {
            return new info3(false, size, min, max);
        }
        if (lft.isvalid && rht.isvalid) {
            MaxBS = Math.max(MaxBS, size);
            return new info3(true, size, min, max);
        }
        return new info3(false, size, min, max);

    }

    public static void isinorder(ArrayList<Integer> l1, ArrayList<Integer> l2, Node root1, Node root2) {
        if (root1 == null || root2 == null) {
            return;
        }
        isinorder(l1, l2, root1.left, root2.left);
        l1.add(root1.data);
        l2.add(root2.data);
        isinorder(l1, l2, root1.right, root2.right);
    }

    public static Node crtBST(ArrayList<Integer> l, int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        Node root = new Node(l.get(mid));
        root.left = crtBST(l, st, mid - 1);
        root.right = crtBST(l, mid + 1, ed);
        return root;
    }

    public static Node Marge(Node root1, Node root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        isinorder(l1, l2, root1, root2);
        l1.addAll(l2);
        Collections.sort(l1);
        Node root = crtBST(l1, 0, l1.size() - 1);
        return root;
    }

    public static void is(Node root) {
        if (root == null) {
            return;
        }
        is(root.left);
        System.out.print(root.data + " ");
        is(root.right);
    }

    public static ArrayList<Integer>Temp(int temp[]) {
        ArrayList<Integer>l=new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for (int i =temp.length-1; i>=0 ; i--) {
            int curr = temp[i];
            while (!s.isEmpty() && curr >= temp[s.peek()]) {
                s.pop();
                
            }
            if (!s.isEmpty()) {
                l.add(s.peek()-i);
            } 
            s.push(i);
        }
        return l;
    }



    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int ans=0;
        for(int i=start;i<n;i++){
            arr[i]=i;
        }
       
            if(start%2==0){
                for(int i=start;i<n-1;i++){
                    if(arr[i]%2==0){
                     ans=arr[i]^arr[i+1];
                    }
                    return ans;
                }
              }
              
              else{
               for(int i=start;i<n-1;i++){
                    if(arr[i]%2 !=0){
                     ans=arr[i]^arr[i+1];
                    }
                    return ans;
        }
    }
    return -1;
}


    public static void main(String[] args) {
        int temp []={30,40,50};
       System.out.println( Temp(temp));

        // int value[] = {3,5,6,8,10,11,12};
        // Node root = new Node( 50);
        // root.left = new Node( 30);
        // root.left.left = new Node( 5);
        // root.left.right = new Node( 20);
        // root.right = new Node( 60);
        // root.right.left = new Node( 45);
        // root.right.right = new Node( 70);
        // root.right.right.left = new Node( 65);
        // root.right.right.right = new Node(80);
        // largestBst(root);
        // System.out.println( MaxBS);

        // Node root1 = new Node(2);
        // root1.left = new Node(1);
        // root1.right = new Node(4);

        // Node root2 = new Node(9);
        // root2.left = new Node(3);
        // root2.right = new Node(12);

        // Node root = Marge(root1, root2);
        // is(root);

        // Node root= blanceBST(value, 0, 6);
        // Node root = null;
        // for (int i = 0; i < value.length; i++) {
        // root = insert(root, value[i]);
        // }
        // printInRange(root, 3, 7);
        // ArrayList<Integer>l=new ArrayList<>();
        // path(root,l);
        // System.out.println(isvalidBST(root, null, null));
        // mirrorTree(root);
        // inorder(root);
        // preorder(root);
        List<Integer>l=new ArrayList<>();
        ma

    }

}
