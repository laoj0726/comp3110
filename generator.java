package sudoku;

//PLEASE DON'T delete all commented code; a proof of time of work
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//my purpose was design a class to generate a random full sudoku every time
//the generator is called; however I failed. The algorithm could run but
//the optimization is way too poor; and I can't get more than 5 blocks of 3x3
//numbers on the map. I think it is because that the time complexity is roughly
//O(n^4) and the virtual machine always runs out of the memory? 
//then I have to use a stupid way; read prepared sudoku from txt file
//a thorough failure
public class generator {


	private final int[][] sudokuMap = new int[9][9];
	private int[][] sudokuAnswer = new int[9][9];
	private int[][] sudokuExam = new int[9][9];
	private int [][] sudokuTemp = new int[9][9];
	//private ArrayList<Integer> box;
	//private ArrayList<Integer> pool;
//	private ArrayList<Integer> row = new ArrayList<Integer>();
//	private ArrayList<Integer> column = new ArrayList<Integer>();
	
	private Random rand = new Random();

	
	public generator() throws IOException {
		Path path = Paths.get("src/sudoku/sudoku.txt");
		long line = Files.lines(path).count();
		//System.out.printf("I have %d lines \n",line);
		File sudoku = new File("src/sudoku/sudoku.txt");
		Scanner reader = new Scanner(sudoku);
		int randMap = rand.nextInt((int)(line / 9));
		//skip all previous questions with nextLIne
		for(int i = 0; i < (randMap - 1) * 9; i++) {
			reader.nextLine();
		}
		//get sudoku stored and quit the loop
		while(reader.hasNextInt()) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sudokuMap[i][j] = reader.nextInt();
				}
			}
			break;
		}
		
		//each box contains 0 - 9
		//init the map with all 0 first
//		for(int i=0; i<9; i++) {
//			for(int j=0; j<9; j++) {
//				sudokuMap[i][j] = 0;
//			}
//		}
		//push number in box(3x3) from left to right, top to bottom
//		fillBox();
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
		//try to let gc free the memory
//		box = null;
//		fillBox();
//		for(int i = 0; i < 3; i++) {
//			for(int j = 3; j < 6; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
		//the reason there is multiple repeating code is because I want to
		//see how many blocks of number I can generate
//		box = null;
//		fillBox();
//		for(int i = 0; i < 3; i++) {
//			for(int j = 6; j < 9; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		box = null;
//		fillBox();
//		for(int i = 3; i < 6; i++) {
//			for(int j = 0; j < 3; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		box = null;
//		fillBox();
//		for(int i = 3; i < 6; i++) {
//			for(int j = 3; j < 6; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
////		box = null;
//		fillBox();
//		for(int i = 3; i < 6; i++) {
//			for(int j = 6; j < 9; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		fillBox();
//		for(int i = 6; i < 9; i++) {
//			for(int j = 0; j < 3; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		fillBox();
//		for(int i = 6; i < 9; i++) {
//			for(int j = 3; j < 6; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		fillBox();
//		for(int i = 6; i < 9; i++) {
//			for(int j = 6; j < 9; j++) {
//				sudokuMap[i][j] = randNum(i,j);
//			}
//		}
//		int row;
//		int column;
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				fillBox();
//				for(int r = 0; r < 3; r++) {
//					for(int c = 0; c < 3; c++) {
//						sudokuMap[3*i + r][3*j + c] = randNum(3*i + r,3*j + c);
//						System.out.println("working on it");
//					}
//				}
//			}
//		}
	}
	//sudoku has 3 limitation; column, row and box. this is the available number collection
	//for block
//	private void fillBox() {
//		box = new ArrayList<Integer>();
//		for(int i = 1; i <10; i++) {
//			box.add(i);
//		}
//	}
	//this gather the set of available numbers from column and row
//	private void fillPool(int row, int column) {
//		pool = new ArrayList<Integer>();
//		for(int i = 1; i < 10; i++) {
//			pool.add(i);
//		}
//		for(int i = 0; i < row; i++) {
//			if(pool.contains(sudokuMap[i][column]))
//				pool.remove(new Integer(sudokuMap[i][column]));
//		}
//		for(int i = 0; i < column; i++) {
//			if(pool.contains(sudokuMap[row][i]))
//				pool.remove(new Integer(sudokuMap[row][i]));
//		}
//	}
	//the pool time complexity created here... tried to find the 
	//intersection of the set of box and pool
//	private int randNum(int row, int column) {
//		fillPool(row,column);
//		int randInt = -1;
//		int num = -1;
//		do {
//		randInt = rand.nextInt(pool.size());
//		num = pool.get(randInt);
//		}while(!box.contains(num));
//		box.remove(new Integer(num));
//		pool = null;
//		return num;
//	}
	//second version use validate instead; doesn't work good too
//	private int randNum(int row, int column) {
//		int randInt = -1;
//		int num = -1;
//		do {
//			randInt = rand.nextInt(box.size());
//			num = box.get(randInt);
//		}while(!validate(row,column,num));
//		box.remove(randInt);
//		return num;
//	}
	//for second version; same idea
//	private boolean validate(int row, int column, int num) {
//		for(int i = 0; i < row; i++) {
//			if(sudokuMap[i][column] == num)
//				return false;
//		}
//		for(int i = 0; i < column; i++) {
//			if(sudokuMap[row][i] == num)
//				return false;
//		}
//		return true;
//	}
	
	//use to print the sudoku to check if it works. if 
	//we want to get the sudoku to play; we should use
	//getSudoku method
	public void printMap() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("%d ", sudokuMap[i][j]);
			}
			System.out.println();
		}
	}
	//use this to get the sudoku map
	public int[][] getSudoku(){
		return sudokuMap;
	}
	public int[][] getSudokuAns(){
		return sudokuAnswer;
	}
	public int[][] getSudokuTep(){
		return sudokuTemp;
	}
	public int[][] getSudokuExam(){
		return sudokuExam;
	}
	//orignal line 46~52 and line 67~86
	public void GenBlank(){
		for(int i = 0; i < 9; i++) {
			for(int j = 0;j < 9; j++) {
				sudokuAnswer[i][j]=getSudoku()[i][j];
				sudokuTemp[i][j]=getSudoku()[i][j];//create a temp to modify
				
			}
		}
		int count=0;
		int MaxBlank = (int) (Math.random() * (64 - 1)) + 1;
		for(int i = 0; i < 9; i++) {
			int h = (int) (Math.random() * (9 - 1)) + 1;
			for(int j = 0;j < 9; j++) {
				int g = (int) (Math.random() * (9 - 1)) + 1;
				//Generate a balnk, and make sure The number of generated blanks will not exceed the maximum//
				if(sudokuMap[i][j]==sudokuMap[h][g] && count<=MaxBlank) {
					//Generate a half-width space as blank//
					System.out.printf("\u00A0");
					sudokuExam[i][j]= 0;
					sudokuTemp[i][j]=0;
					count++;
				}
				else {
				System.out.printf("%d",sudokuMap[i][j]);
				sudokuExam[i][j] = getSudoku()[i][j];
				}
			}
			System.out.println();
		}
}
}
