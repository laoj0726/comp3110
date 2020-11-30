package tictactoe;

import java.util.Scanner;
class Main {
	  
	public static void main(String[] args) {
		
		//create a 3 by 3 2d board
		char[][] board = new char[3][3];
		
		//create an empty board
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		//get the players name
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to tic tac toe");
		System.out.print("Player 1, what is your name? ");
		String p1 = in.nextLine();
		System.out.print("Player 2, what is your name? ");
		String p2 = in.nextLine();


		boolean player1 = true;

		//game loop
		boolean game = false;
		while(!game) {
			System.out.println("Board:");
			for(int i = 0; i < 3; i++) {
				//The inner for loop prints out each row of the board
				for(int j = 0; j < 3; j++) {
					System.out.print(board[i][j]);
				}
				//This print statement makes a new line so that each row is on a separate line
				System.out.println();
			}

			//print the players turn
			if(player1) {
				System.out.println(p1 + "'s Turn (x):");
			} 
			else {
				System.out.println(p2 + "'s Turn (o):");
			}
			//setting which player is which character
			char c = '-';
			if(player1) {
				c = 'x';
			} 
			else {
				c = 'o';
			}
			int row,col;
			while(true) {
				//Ask the user for what position they want to place their x or o
				System.out.print("Enter a row number (1,2 or 3): ");
				row = in.nextInt()-1;
				System.out.print("Enter a column number (1,2, or 3): ");
				col = in.nextInt()-1;

				//check if inputs are valid
				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("Not a valid move");
				
				//check if input is already taken
				} 
				else if(board[row][col] != '-') {
					System.out.println("Spot is already taken");
				
				}
				else {
					break;
				}
			
			}

			//set row and col to specific spots
			board[row][col] = c;

			//check if player has winning condition
			if(checkWinner(board) == 'x') {
				System.out.println(p1 + " is winner");
				game = true;
			} 
			else if(checkWinner(board) == 'o') {
				System.out.println(p2 + " is winner");
				game = true;
			} 
			else {

				//if no player wins, check if the board is full, resulting in tie
				if(fullBoard(board)) {
					System.out.println("tie game");
					game = true;
				} 
				else {
					//this is to keep switching the players
					player1 = !player1;
				}
			}
		}
		//Draw the board at the end of the game
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			//next line for the next row of tic tac toe
			System.out.println();
		}
  }

	//this will determine who is the winner
	public static char checkWinner(char[][] board) {
		
		//check row for each case
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}
		//check each column for each case
		for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}
		//check diagonals for each case
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}
		//return nothing if not met
		return ' ';

	}

	//check if board is full, therefore a tie game
	public static boolean fullBoard(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}