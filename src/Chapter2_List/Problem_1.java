package Chapter2_List;

public class Problem_1 {

	public static class Node{
		public int value;
		public Node next;
		public Node(){this.next = null;}//初始化一个空链表
		public Node(int data){
			this.value = data;
		}
	}
	
	public void printCommonPart(Node head1, Node head2){
		System.out.print("Common Part: ");
		head1 = head1.next;//若是没有这两行，会输出：0，3，5.而0不应该输出
		head2 = head2.next;//
		while(head1!=null&&head2!=null){
			if(head1.value<head2.value){
				head1 = head1.next;
			}else if(head1.value>head2.value){
				head2 = head2.next;
			}else{
				System.out.print(head1.value + " ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		System.out.println();
	}
	
	//头插法
	public static Node CreateNewLinkedList1(Node head, int [] a){
		System.out.print("List is: ");
		for(int i=0;i<a.length;i++){
			Node p = new Node(a[i]);
			p.next = head.next;
			head.next = p;
			System.out.print(p.value+" ");
		}
		System.out.println();
		return head;
	}
	
	//尾插法
	public static Node CreatNewLinkedList2(Node head, int [] a){
		System.out.print("List is: ");
		Node r = head;
		for(int i= 0;i<a.length;i++){
			Node p = new Node(a[i]);
			r.next = p;
			p.next = null;
			r = r.next;
			System.out.print(p.value+" ");
		}
		System.out.println();
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,5,7,9};
		int [] b = {2,3,5,6,8};
		Node head1 = new Node();
		Node head2 = new Node();
		
		CreatNewLinkedList2(head1,a);
		CreatNewLinkedList2(head2,b);
		
		Problem_1 p1= new Problem_1();
		p1.printCommonPart(head1, head2);
		
		Problem_1 p= new Problem_1();
		p.printCommonPart(head1,head2);

	}

}
