package sec09.exam01_instance_member;

public class ListNodeTest_3 {

	public static void main(String[] args) {
		ListNode head = null;
		
		ListNode node10 = new ListNode(10);
		ListNode node20 = new ListNode(20);
		ListNode node30 = new ListNode(30);
		ListNode node40 = new ListNode(40);

		node40.setNext(node30);
		node30.setNext(node20);
		node20.setNext(node10);
		
		head = node40;
		print(head); // 스택같이 동작. => 20, 10 순으로 출력.
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
