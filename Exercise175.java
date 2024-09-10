public class Exercise175 {
	class ListNode {
		int val;
		ListNode next;
		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}
	public class Solution {
	public static ListNode head = newListNode(10);
	public static void main(String[] args) {
		head.next = newListNode(20);
		head.next.next = newListNode(30);
		head.next.next.next = newListNode(40);
		head.next.next.next.next = newListNode(50);
		ListNode p = head;
		System.out.println("Original Linked List:");
		printList(p);
		System.out.println("\nAfter deleting the fouth node, Linked list becomes:");
		deleteNode(head.next.next.next);
		p = head;
		printList(p);
	}
	private static Exercise175.ListNode newListNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void deleteNode(ListNode node) {
		if (node.next != null) {
			int temp = node.val;
			node.val = node.next.val;
			node.next.val = temp;
			node.next = node.next.next;
		} else {
			ListNode p = head;
			while (p.next.val != node.val) {
				p = p.next;
			}
			p.next = null;
		}
	}
	static void printList(ListNode p) {
		while (p != null) {
			System.out.print(p.val);
			if (p.next != null) {
				System.out.print("->");
			}
			p = p.next;
		}
	}
	}
}

