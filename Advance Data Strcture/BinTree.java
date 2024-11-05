import java.util.*;

public class BinTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class InnerBinTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node NewNode = new Node(nodes[idx]);
            NewNode.left = buildTree(nodes);
            NewNode.right = buildTree(nodes);
            return NewNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }

        }

        public static int HeightTree(Node root) {
            if (root == null) {
                return 0;
            }
            int leftheight = HeightTree(root.left);
            int rightheight = HeightTree(root.right);
            int Height = Math.max(leftheight, rightheight) + 1;
            return Height;
        }

        public static int countNode(Node root) {

            // itretive form
            // Queue <Node>q=new LinkedList<>();
            // q.add(root);
            // q.add(null);
            // int sum=0;
            // while (!q.isEmpty()) {
            // Node currNode=q.remove();
            // if(currNode==null){
            // if(q.isEmpty()){
            // break;
            // }
            // }

            // else{
            // sum+= currNode.data;
            // if(currNode.left !=null){
            // q.add(currNode.left);
            // }
            // if(currNode.right!=null){
            // q.add(currNode.right);
            // }
            // }

            // }
            // return sum;

            // Recuesive form
            if (root == null) {
                return 0;
            }
            int ls = countNode(root.left);
            int rs = countNode(root.right);
            return ls + rs + root.data;

        }

        public static int diamiterTree(Node root) {
            if (root == null) {
                return 0;
            }
            int ld = diamiterTree(root.left);
            int rd = diamiterTree(root.right);
            int lh = HeightTree(root.left);
            int rh = HeightTree(root.right);
            int selfdia = (lh + rh + 1);
            int he = Math.max(ld, rd);
            return Math.max(he, selfdia);
        }

        public static class info {
            int dim;
            int ht;

            public info(int dim, int ht) {
                this.dim = dim;
                this.ht = ht;
            }
        }

        public static info diameter(Node root) {
            if (root == null) {
                return new info(0, 0);
            }
            info ld = diameter(root.left);
            info rd = diameter(root.right);
            int dim = Math.max(ld.ht + rd.ht + 1, Math.max(ld.dim, rd.dim));
            int ht = Math.max(ld.ht, rd.ht);
            return new info(dim, ht);

        }
    }

    public static Boolean isIden(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }
        if (!isIden(root.left, subroot.left))
            return false;
        if (!isIden(root.right, subroot.right))
            return false;
        return true;
    }

    public static boolean subtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIden(root, subroot))
                return true;
        }
        return subtree(root.left, subroot) || subtree(root.right, subroot);
    }

    static class info2 {
        Node node;
        int hd;

        public info2(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new info2(root, 0));
        q.add(null);
        int min = 0, max = 0;
        while (!q.isEmpty()) {
            info2 curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new info2(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new info2(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void kThLevel(Node root, int level, int k) {
        // recersive form
        // if(root==null){
        // return;
        // }
        // if(level==k){
        // System.out.print(root.data+" ");
        // return;
        // }
        // kThLevel(root.left, level+1, k);
        // kThLevel(root.right, level+1, k);

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    level++;
                }
            } else {
               
                if (level != k) {
                    System.out.print(root.data);
                 

                    if (curr.left != null) {
                        kThLevel(root.left, level, k);
                    }
                    if (curr.right != null) {
                        kThLevel(root.right, level, k);
                    }
                }else{
                    System.out.print(root.data+" ");
                }

            }
            
        }
    }
    public static boolean lowestAnsister1(Node root,int n1,ArrayList<Node>l1){
        if(root==null){
            return false;
        }
        l1.add(root);
        if(root.data==n1){
            return true;
        }
        boolean fl=lowestAnsister1(root.left, n1, l1);
        boolean rl=lowestAnsister1(root.right, n1, l1);
        if(fl ||rl){
            return true;
        }
        l1.remove(l1.size()-1);
        return false;
    }

    public static int lowestAnsister(Node root,int n1,int n2){
        ArrayList<Node>l1=new ArrayList<>();
        ArrayList <Node>l2=new ArrayList<>();
          lowestAnsister1(root,n1 , l1);
          lowestAnsister1(root,n2 ,l2);

          int i=0;
           for(;i<l1.size()&& i< l2.size();i++){
            if(l1.get(i)!= l2.get(i)){
                break;
            }
           }
           Node lca=l1.get(i-1);
           return lca.data;
    }
    public static Node lca(Node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftlca=lca(root.left, n1, n2);
        Node rightlca=lca(root.right, n1, n2);
        if(rightlca==null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }

    public static int dis(Node root,int  n1){
        if(root==null){
            return -1;
        }
        if(root.data==n1){
            return 0;
        }
       int lft= dis(root.left, n1);
       int right= dis(root.right, n1);
        if(lft == -1 && right == -1){
            return -1;
        }else if(lft== -1){
            return right+1;
        }else{
           return lft+1;
        }
    }
    public static int ditance(Node root,int  n1,int n2){
       Node lca1= lca(root, n1, n2);
        int dis1=dis(lca1, n1);
        int dis2=dis(lca1, n2);
        return dis1+dis2;
    }

    public static int kthAnsister(Node root,int n,int k){
        if(root == null){
            return -1;
        }
       if(root.data==n){
        return 0;
       }
       int lft=kthAnsister(root.left, n, k);
       int rht=kthAnsister(root.right, n, k);
       if(lft == -1 && rht==-1){
        return -1;
       }
       int max=Math.max(lft, rht);
       if(max+1 ==k){
        System.out.println(root.data);
       }
       return max+1;
    }
    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }

        int suml=sumTree(root.left);
        int sumr=sumTree(root.right);
        int data=root.data;
        int newlft=root.left==null?0:root.left.data;
        int newrht=root.right==null?0:root.right.data;
        root.data=(newlft+suml)+(newrht+sumr);
        return data;

    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        // int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1};
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.left=new Node(8);

        // sumTree(root);
        // preorder(root);
          
    //   kthAnsister(root, 4, 2);

        //   System.out.println(ditance(root, 4,5));

    //    System.out.println( lca(root, 4, 5).data);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);
        // System.out.println(subtree(root, subroot));
        // topView(root);
        // kThLevel(root, 0, 3);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.println(diameter(root).dim);

        // root.left.left=new Node(4);
        // root.left.left.left=new Node(9);
        // root.left.left.left.left=new Node(10);
        // root.left.right=new Node(5);
        // root.left.right.right=new Node(6);
        // root.left.right.right.right=new Node(7);

        // InnerBinTree tree=new InnerBinTree();
        // Node root=tree.buildTree(nodes);
        // System.out.println(tree.countNode(root));
        // System.out.print(tree.diamiterTree(root));
        // System.err.println(tree.diameter(root).dim);

    }
}
