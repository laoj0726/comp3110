package game;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class mindQuiz {
    public static void main(String[] args) throws IOException{
        //first create the question list
        questionList list = new questionList();
        char user;
        //welcome, start or exit
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to our mind quiz!\nenter Y to continue "+
                " or N to exit");
        user = in.next().toUpperCase().charAt(0);
        //if user doesn't want to exit, then keep going until all questions
        //are done
        String choice;
        int score = 0;
        Random rand = new Random();
        int randInt;
        while(user != 'Y' && user != 'N') {
        	System.out.println("Wrong input! Please enter Y to continue or N to exit");
        	user = in.next().toUpperCase().charAt(0);
        }
        while(user != 'N' && list.getSize()>0){
        	randInt = rand.nextInt(list.getSize());
        	//for(int i = 0; i < list.getSize(); i++) {
            	System.out.println("Question : " + list.getQuestion(randInt).getQuestion());
            	System.out.println("Answer A: " + list.getQuestion(randInt).getAnswerA());
            	System.out.println("Answer B: " + list.getQuestion(randInt).getAnswerB());
            	System.out.println("Answer C: " + list.getQuestion(randInt).getAnswerC());
            	//System.out.println(list.getQuestion(i).getCorrectAnswer());
        	choice = in.next();
        	while(!choice.toUpperCase().equals("A") && !choice.toUpperCase().equals("B") && !choice.toUpperCase().equals("C") ) {
                System.out.println("Wrong input! Please enter A, B or C to answer the question:");
                choice = in.next();
               }
        		if(choice.toUpperCase().equals(list.getQuestion(randInt).getCorrectAnswer())){
        			System.out.println("Yea, you are right!");
        			score++;
        		} else
        			System.out.println("Sorry, the correct answer is : " + list.getQuestion(randInt).getCorrectAnswer());
        	//}
        	System.out.println("Continue? Y/N");
        	user = in.next().toUpperCase().charAt(0);
        	list.removeQuestion(randInt);
        }
       System.out.printf("Your score is :%d\n",score);
        }
}
