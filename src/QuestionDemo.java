/*
 * INDIVIDUAL ASSIGNMENT WEEK 9 
 * if extending ChoiceQuestion class 
 * 	setQuestion - sets texts and sets answer (calls methods from superclass)
 *		set answer utilizes choices
 * 		setText
 * 		addChoice
 * 		need to write display method
 * 	 
 * 
 * if extending from Question class
 * 	setAnswer
 * 	setText
 * 
 */



import java.util.Scanner;

public class QuestionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
		
		ChoiceQuestion cq = new ChoiceQuestion();
		cq.setText("Inheritance is what kind of relationship?");
		cq.addChoice("has-a", false);
		cq.addChoice("is-a", true);
		cq.addChoice("dependent", false);
		
		
		//=================================================//
		
		TrueFalseQuestion tq = new TrueFalseQuestion();
		tq.setQuestion("Inheritance is a relationship", true);
		presentQuestion(tq);
		
		TrueFalseQuestion tq1 = new TrueFalseQuestion();
		tq1.setQuestion("Inheritance is a relationship", false);
		presentQuestion(tq1);
		
		
		

	}
	
	public static void presentQuestion(ChoiceQuestion q){
		q.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
	
	

}
