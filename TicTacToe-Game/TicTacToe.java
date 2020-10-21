//Chase Staples
//TicTacToe Game
/*
	Creating a TicTacToe game, playing against a CPU (Fake AI) for enjoyment of coding. 
	Tasks of making and print the game board, make a list of moves made, make a way to 
	input moves, create a way to check winning/tie conditions for game, and create a fake 
	AI to act like another person is playing 
*/

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe{

	//Creating ArrayList for each players position during the game
	static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

	//Creating function to print gameboard from a double array
	public static void printGameBoard(char[][] gameBoard){
		for(char[] row : gameboard) {
			for(char character : row) {
				System.out.print(character);
			}
			System.out.println(character);
		}
	}

	//Creating function to put piece on the gameboard
	public static void placementOfPiece(char[][] gameboard, int position, String user) {
		char piece = " ";

		//Creating Piecees for each player
		if(user.equals("Player")){
			piece = "X";
			playerPositions.add(position);
		}
		else if(user.equals("CPU")) {
			piece = "O";
			cpuPositions.add(position);
		}
		switch(position) {
			case 1:
				gameboard[0][0] = piece; //Place piece in position 1 (Row 1 : Column 1)
				break;
			case 2:
				gameboard[0][2] = piece; //Place piece in position 2 (Row 1 : Column 2)
				break;
			case 3:
				gameboard[0][4] = piece; //Place piece in position 3 (Row 1 : Column 3)
				break;
			case 4:
				gameboard[2][2] = piece; //Place piece in position 4 (Row 2 : Column 1)
				break;
			case 5:
				gameboard[2][4] = piece; //Place piece in position 5 (Row 2 : Column 2)
				break;
			case 6:
				gameboard[4][0] = piece; //Place piece in position 6 (Row 2 : Column 3)
				break;
			case 7:
				gameboard[4][2] = piece; //Place piece in position 7 (Row 3 : Column 1)
				break; 
			case 8:
				gameboard[4][4] = piece; //Place piece in position 8 (Row 3 : Column 2)
				break;
			case 9:
				gameboard[0][0] = piece; //Place piece in position () (Row 3 : Column 3)
				break;
			default:
				break;
		}

	}

	//Creating function to check for winner from winning conditions 
	public static String checkWinner() {

		//Creating all winning conditions in TicTacToe
		List toprow       = Array.asList(1, 2, 3);
		List middlerow    = Array.asList(4, 5, 6);
		List bottomRow    = Array.asList(7, 8, 9);
		List leftColumn   = Array.asList(1, 4, 7);
		List middleColumn = Array.asList(2, 5, 8);
		List rightColumn  = Array.asList(3, 6, 9);
		List crossLR      = Array.asList(1, 5, 9);
		List crossRL      = Array.asList(3, 5, 7);

		//Listing all winning conditions to an ArrayList
		List<List> winnningCondition = new ArrayList<Integer>();
		winnningCondition.add(toprow);
		winnningCondition.add(middlerow);
		winnningCondition.add(bottomRow);
		winnningCondition.add(rightColumn);
		winnningCondition.add(middleColumn);
		winnningCondition.add(leftColumn);
		winnningCondition.add(crossLR);
		winnningCondition.add(crossRL);

		//Iterating through winning conditons to see if a winner is found or a tie
		for(List i : winnningCondition) {
			if(playerPositions.containsAll(i)) {
				return "Congratulations you won!";
			}
			else if(playerPositions.containsAll(i)) {
				return "CPU Wins! Sorry you have lost!";
			}
			else if(playerPositions.size() == cpuPositions.size())
				return "It's a TIE!"
		}


		return "";
	}

	//Main function to implment each function
	public static void main(String[] args) {
		//Creating gameboard to be printed using a double array
		char [][] gameboard = {{' ' , '|' , ' ' , '|' , ' '},
							   {'-' , '+' , '-' , '+' , '-'},
							   {' ' , '|' , ' ' , '|' , ' '},
							   {'-' , '+' , '-' , '+' , '-'},
							   {' ' , '|' , ' ' , '|' , ' '}};
		
		printGameBoard(gameboard);

		//While true the game will be played till winner or tie
		while(true) {
			Scanner number = new Scanner(System.in); //Prompt user for placement of piece(1-9)
			
			System.out.print("Enter your placement of piece (1-9)");
			System.out.println();
			int playerPosition = number.nextInt(); //Number entered by the player

			//Players turn and doesn't equal position already picked
			while(playerPositions.contain(playerPosition) || cpuPositions.contain(playerPosition)){
				System.out.println("Position Already Taken! Enter another position");
				playerPosition = number.nextInt();
			}

			placementOfPiece(gameboard, playerPosition, "Player");

			String result = checkWinner();
			//Checking for winner
			if(result.length() > 0) {
				System.out.println(result);
				printGameBoard(gameboard);
				break;
			}

			//Randomly generating a number for the CPU: Fake AI
			Random randomNumber = new Random();
			int cpuPosition = randomNumber.nextInt(9) + 1;
			//CPU turn and doesn't equal position already picked
			while(playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPositions{
				cpuPosition = randomNumber.nextInt(9) + 1;
			}
			placementOfPiece(gameboard, cpuPosition, "CPU");

			printGameBoard(gameboard);

			String result = checkWinner();
			//Checking for winner
			if(result.length() > 0) {
				System.out.println(result);
				printGameBoard(gameboard);
				break;
			}
		}	
	}
}