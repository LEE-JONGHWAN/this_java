package sec09.exam01_instance_member;

public class ListNode {
	private int data;  // 4 바이트
	private ListNode next = null;  // 4 바이트
	
	public ListNode(int data) {
		super();
		this.data = data;
	}

	public ListNode(int data, ListNode next) {
		super();
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}


	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	
	
}
