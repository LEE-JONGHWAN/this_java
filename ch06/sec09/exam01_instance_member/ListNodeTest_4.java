package sec09.exam01_instance_member;

public class ListNodeTest_4 {

	public static void main(String[] args) {
		ListNode[] nodes = new ListNode[4];
		
		for (int i = 0; i < 4; i++) {
			nodes[i] = new ListNode(10 * (i+1));
			// next 필드는 항상 null!
		}
		printList(nodes[0]); // 스택같이 동작. => 20, 10 순으로 출력.
	}

	private static void printList(ListNode node) {
		ListNode curr = node;
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	private static ListNode insertData(ListNode head, int data) {
		ListNode node = new ListNode(data);
		node.setNext(head); 
		return node;
	}

}
