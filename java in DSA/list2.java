import java.util.LinkedList;

public class list2 {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }

  }

  static Node head;

  public Node marge(Node left, Node right) {
    Node marges = new Node(-1);
    Node temp = marges;
    while (left != null && right != null) {
      if (left.data < right.data) {
        temp.next = left;
        left = left.next;
        temp = temp.next;
      } else {
        temp.next = right;
        right = right.next;
        temp = temp.next;
      }
    }
    while (left != null) {
      temp = left;
      left = left.next;
      temp = temp.next;
    }
    while (right != null) {
      temp = right;
      right = right.next;
      temp = temp.next;
    }
    Node curr = marges.next;
    return curr;
  }

  public Node isMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public Node sorts(Node head) {
    if (head == null && head.next == null) {
      return head;
    }
    // find the mid
    Node mid = isMid(head);
    // right part
    Node right = mid.next;
    mid.next = null;
    // left part
    Node leftside = sorts(head);
    Node rightpart = sorts(right);
    return marge(leftside, rightpart);

  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(4);
    list.addFirst(8);
    list.addFirst(1);
    list.addFirst(3);
    list.addFirst(5);
    System.out.println(list);

  }
}