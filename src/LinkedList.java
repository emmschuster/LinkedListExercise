public class LinkedList {
	public Elem head;
	public LinkedList(int i) {
		this.head = new Elem(i);
	}
	public void printList() {
		Elem headJetzt = this.head;
		while (headJetzt.adress != null) {
			System.out.println(headJetzt.zahl+"	"+headJetzt.adress);
			headJetzt=headJetzt.adress;
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
	
	public void deleteElement (int i) {
		Elem dElem=head;
		Elem lastElem=null;
		if (i==0) {
			head=head.adress;
			return;
		}
		if (i<0) {
			System.out.println("negative numbers aren't allowed");
			return;
		}
		if (i>getlenghtList()) {
			System.out.println("number is bigger than the List is long");
			return;
		}
		while(i>0) {
			lastElem=dElem;
			dElem=dElem.adress;
			i--;
		}
		lastElem.adress=dElem.adress;
	}
}