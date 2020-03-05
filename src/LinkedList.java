public class LinkedList {
	Elem head;
	public LinkedList(int i) {
		head = new Elem(i);
	}
	public void printList(Elem e) {
		e=this.head;
		while(e!=null) {
			System.out.println(e);
			e=e.adress;
		}
	}
}
