class Book {
	private String bookName;
	///...
	public void setBookName (String setBookName) {
		bookName = setBookName;
	}
	public void printBookName () {
		System.out.println(bookName);
	}
	//...
}

class AdvancedBook extends Book {
	private String prerequisiteKnowledge;
	//...
	public void setPrerequisiteKnowledge (String setPrerequisiteKnowledge) {
		prerequisiteKnowledge = setPrerequisiteKnowledge;			
	}
	public void printPrerequisiteKnowledge () {
		System.out.println(prerequisiteKnowledge);
	}
	//...
}

public class practice {
	public static void main(String[] args) {
		Book book1 = new Book();
		AdvancedBook advancedBook1 = new AdvancedBook();
		
		book1.setBookName("The Best Book");
		advancedBook1.setBookName("Super Advanced Physics");	
		
		advancedBook1.setPrerequisiteKnowledge("Knowledge of normal advanced physics");
		
		book1.printBookName();
		advancedBook1.printBookName();
		advancedBook1.printPrerequisiteKnowledge();
		
	}
}