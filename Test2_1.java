package cn.it.zuo;

public class Test2_1 {
	public void printCommonPart(Node head1, Node head2){
		System.out.println("Common Part");
		while(head1 != null && head2 != null){
			if (head1.value > head2.value) {
				head1 = head1.next; 
			}else if(head1.value < head2.value){
				head2 = head2.next;
			}else{
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		System.out.println();
	}

}
