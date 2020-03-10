public class LinkedList {
	Elem head;
	public LinkedList(int i) {
		this.head = new Elem(i);
	}
	public void printList() {
		Elem currentHead = this.head;
		while (currentHead.adress != null) {
			System.out.print(currentHead.zahl);
			currentHead=currentHead.adress;
		}
	}
	public void addElement(int e) {
		Elem newZahl=new Elem(e);
		newZahl.adress=this.head;
		this.head=newZahl;
	}
	public int getlenghtList () {
		int laenge = 0;
		Elem currentHead = this.head;
		while(currentHead.adress != null) {
			laenge+=1;
			currentHead = currentHead.adress;
		}
		return laenge;
	}
}