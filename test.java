package sudoku;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class test {
	//use to create n random numbers between min to max//
	/*public static int[] randomCommon(int min, int max, int n){
		if (n > (max - min + 1) || max < min) {
			return null;
		}
		int[] result = new int[n];
		int count = 0;
		while(count < n) {
			int num = (int) (Math.random() * (max - min)) + min;
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if(num == result[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				result[count] = num;
				count++;
			}
		}
		return result;
	}*/

	public static void main(String[] args) throws IOException {
		
		generator game = new generator();
		int input;
		/*int[][] sudokuAnswer = new int[9][9];
		int[][] sudokuExam = new int[9][9];
		int [][] sudokuTemp = new int[9][9];*/
		//the maximum number of blank//
		int MaxBlank = (int) (Math.random() * (64 - 1)) + 1;
		//game.printMap();//
		
		int[] sudokuInput = new int[MaxBlank];
		
		//create a answer to compare//
		/*for(int i = 0; i < 9; i++) {
			for(int j = 0;j < 9; j++) {
				sudokuAnswer[i][j]=game.getSudoku()[i][j];
				sudokuTemp[i][j]=game.getSudoku()[i][j];//create a temp to modify
				
			}
		}*/
		
		Scanner scan = new Scanner(System.in);
		 
		//check the answer is work or not//
		/*for(int i = 0; i < 9; i++) {
			for(int j = 0;j < 9; j++) {
				System.out.printf("%d", sudokuAnswer[i][j]);
			}
			System.out.println();
		}*/
		
		//print the sudoku for the player//
		//and save this version into a array//
		
		/*int count=0;
		for(int i = 0; i < 9; i++) {
			int h = (int) (Math.random() * (9 - 1)) + 1;
			for(int j = 0;j < 9; j++) {
				int k = (int) (Math.random() * (9 - 1)) + 1;
				//Generate a blank, and make sure The number of generated blanks will not exceed the maximum//
				if(game.getSudoku()[i][j]==game.getSudoku()[h][k] && count<=MaxBlank) {
					//Generate a half-width space//
					//System.out.printf("\u00A0");
					sudokuExam[i][j]= 0;
					sudokuTemp[i][j]=0;
					count++;
				}
				else {
				//System.out.printf("%d",game.getSudoku()[i][j]);
				sudokuExam[i][j] = game.getSudoku()[i][j];
				}
			}
			//System.out.println();
		}*/
		game.GenBlank();
		//let player to enter number//
		int countI=0;
		boolean flag = true;
		boolean win=false;
		int empty =0;
		while(flag) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.printf("%d", game.getSudokuTep()[i][j]);
				}
				System.out.println();
			}
			int r,c;
			System.out.println("Enter 0 0 0 when you are done\n");
			System.out.println("Please enter your answer for a blank: ");
			System.out.println("Enter a row: \n");
			r = scan.nextInt();
			System.out.println("Enter a column: \n");
			c = scan.nextInt();
			System.out.println("Enter the number: \n");
			input = scan.nextInt();
			
			//allow user to exit
			if(r==0 && c==0 && input==0) {
				flag =true;
				break;
			}
			//check if spot is open
			if(game.getSudokuTep()[r-1][c-1]==0) {
				game.getSudokuTep()[r-1][c-1]=input;
			}
			else {
				System.out.println("spot is taken");
			}

//			sudokuInput[countI]=input;
//			countI++;
//			if(countI==MaxBlank){
//				flag = false;
//			}
		}
		//to check if sudoku is correct
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++){
				if(game.getSudokuTep()[i][j]!=game.getSudokuAns()[i][j]) {
					win=false;
					break;
				}
				else {
					win=true;
					break;
				}
			}
		}
		if(win==false) {
			System.out.println("you are loser\n");
			//print out the correct sudoku
			System.out.println("CORRECT SUDOKU SOLUTION");
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.printf("%d",game.getSudokuAns()[i][j]);
				}
			}
			System.out.println();
		}
		else {
			System.out.println("you are sudoku god");
		}
		
		
		//put the input to the array sudokuExam//
//		int countw =0;
//		for (int i=0; i<9 ;i++) {
//			for(int j=0; j<9; j++) {
//				if(sudokuExam[i][j]==0) {
//					sudokuExam[i][j]=sudokuInput[countw];
//					countw++;
//				}
//			}
//		}
		
		//check the answer correct or not//
		
//		for (int i=0; i<9 ;i++) {
//			for(int j=0; j<9; j++) {
//				if(sudokuExam[i][j] !=sudokuAnswer[i][j]) {
//					System.out.println("QAQ\tYour answer is wrong");
//					break;
//				}
//			}
//		}
	}
}
