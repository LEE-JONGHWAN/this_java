package sec09.exam01_instance_member;

public class ListNodeTest {

	public static void main(String[] args) {
		ListNode head = null;  // 0
		head = insertData(head, 10);
		head = insertData(head, 20);
		print(head);
	}

	private static void print(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	private static ListNode insertData(
				ListNode head, int data) {
		ListNode node = new ListNode(data);
		
		node.setNext(head); 
		
		return node;
	}

}
