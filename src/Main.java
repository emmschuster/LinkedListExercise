public class Main {

	public static void main(String[] args) {
		System.out.println("Linked Lists");
		LinkedList l = new LinkedList(5);	//erste selement is der head
		l.addElement(10);
		l.addElement(15);
		l.addElement(20);
		l.addElement(25);
		System.out.println("L�nge der Liste:"+l.getlenghtList());
		l.printList();
		l.deleteElement(3);
		System.out.println("L�nge der Liste:"+l.getlenghtList());
		l.printList();
		l.addElement(55);
		System.out.println("L�nge der Liste:"+l.getlenghtList());
		l.printList();
	}

}