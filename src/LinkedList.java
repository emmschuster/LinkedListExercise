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
		//überprüfung ob index kleiner 0 oder länger als es überhaupt gibt also not länger getlenght
		//wenn es neu ist dann head=head.adress;
		Elem dElem=head;
		Elem lastElem=null;
		while(i>0) {
			lastElem=dElem;
			dElem=dElem.adress;
			i--;
		}
		lastElem.adress=dElem.adress;
	}
}