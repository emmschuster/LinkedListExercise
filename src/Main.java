public class Main {

	public static void main(String[] args) {
		System.out.println("Linked Lists");
		LinkedList l = new LinkedList(5);	//erste selement is der head
		l.addElement(10);
		l.addElement(15);
		l.addElement(20);
		l.addElement(25);
		System.out.println("Lenghts: "+l.getlenghtList());
		System.out.println("Print List:");	//und deleten noch
		l.printList();
		System.out.println("\n3. Element wird gelöscht : ");
		l.deleteElement(2);
		System.out.println("Jetzige Länge: "+l.getlenghtList());
		l.printList();
	}

}