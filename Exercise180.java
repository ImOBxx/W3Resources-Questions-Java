
public class Exercise180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l = newListNode(10);
		l.next = newListNode(20);
		l.next.next = newListNode(30);
		l.next.next.next = newListNode(40);
		l.next.next.next.next = newListNode(50);
		System.out.print("\nOriginal Linked list:");
		printList(l);
		ListNode p = swap_pairs(l);
		System.out.println("\n\nAfter swapping, Linked list becomes:");
			printList(p);
	}
	public static ListNode swap_pairs(ListNode head) {
		ListNode temp = newListNode(0);
		temp.next = head;
		head = temp;
		while (head.next != null && head.next.next != null) {
			ListNode a = head.next;
			ListNode b = head.next.next;
			head.next = b;
			a.next = b.next;
			b.next = a;
			head = a;
		}
		return temp.next;
	}
	private static Exercise180.ListNode newListNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	static void printList(ListNode p) {
		while (p != null) {
			System.out.println(p.val);
			if (p.next != null) {
				System.out.println("->");
			}
			p = p.next;
		}
	}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
			}
		}
}

