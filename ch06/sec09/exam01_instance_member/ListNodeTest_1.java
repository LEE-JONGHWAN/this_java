package sec09.exam01_instance_member;

public class ListNodeTest_1 {

	public static void main(String[] args) {
		ListNode head = null;  // 0
		head = insertData(10, head);
		head = insertData(20, head);
		print(head);
	}

	private static void print(ListNode head) {
		ListNode curr = head;
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}
	
	/**
	 * 자료 저장 노드를 만들고, 노드의 다음 노드를 설정한다.
	 * @param data 저장할 자료
	 * @param next 노드의 다음 노드
	 * @return 만든 (새) 노드
	 */
	private static ListNode insertData(int data, ListNode next) {
		ListNode node = new ListNode(data);
		node.setNext(next); 
		return node;
	}

}
