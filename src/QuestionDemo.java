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
		
		

	}

}
