public class testBook {

public static void main(String[] args) {

Book first = new Book();
Book second = new Book("Harry Potter and the Philosopher's Stone",1997);
	
first.setTitle("The Hobbit");
first.setPubYear(1937);

first.lendOut("Ms. McDougall");
second.lendOut("Ms. Samson");
	
second.bookReturned();
	
System.out.println(first.toString());
System.out.println(second.toString());	

}
}