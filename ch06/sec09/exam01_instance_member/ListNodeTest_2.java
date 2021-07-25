package sec09.exam01_instance_member;

public class ListNodeTest_2 {

	public static void main(String[] args) {
		ListNode head = null;
		
		ListNode node = new ListNode(10);
		node.setNext(head);
		head = node;

		node = new ListNode(20);
		node.setNext(head);
		head = node;
		
		head = insertData(head, 30);
		print(head); // 스택같이 동작. => 20, 10 순으로 출력.
		
		head = insertData(head, 40);
		
//		print(node); // 스택같이 동작. => 20, 10 순으로 출력.
	}

	private static void print(ListNode node) {
		ListNode curr = node;
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
