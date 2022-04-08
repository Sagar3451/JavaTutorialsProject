package collections.jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Iterator;



public class DiceGame {

	private static int NumberOfPlayers;
	private static int NumberOfDice;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter Number of players");
		NumberOfPlayers = sc.nextInt();
		
		System.out.println("Enter Number of Dice");
		NumberOfDice = sc.nextInt();
		
		System.out.println("NumberOfPlayers - "+NumberOfPlayers);
		System.out.println("NumberOfDice - "+NumberOfDice);
		
		ArrayList<String> PlayerName = new ArrayList<String>(NumberOfPlayers);
		ArrayList<Integer> PlayerScore = new ArrayList<Integer>(NumberOfPlayers);
		
		sc.nextLine();
		for(int i=0; i<=NumberOfPlayers-1; i++) {
			System.out.println("Enter Player "+i+" Name");
			PlayerName.add(i, sc.nextLine());
			PlayerScore.add(i, 0);
		}
		System.out.println("Size PlayerName- "+PlayerName.size());
		System.out.println("Size PlayerScore- "+PlayerScore.size());
		
	CC : do {
			for(int j=0; j<=NumberOfPlayers-1; j++) {
				
				System.out.println("Player "+PlayerName.get(j)+" Press Enter Key To Role Dice..!!");
				sc.nextLine();
				int score =0;
				for(int x=0; x<=NumberOfDice-1; x++) {
					int throwNum=(int)(Math.random()*6+1);
					System.out.println("Dice "+x+" - "+throwNum);
					score += throwNum;
				}
				
				
				PlayerScore.set(j, PlayerScore.get(j)+score);
				System.out.println(PlayerName.get(j)+" Scored "+score +" And Your Total Score Is "+PlayerScore.get(j));
				if(Collections.max(PlayerScore)>=30) {
					System.out.println(PlayerName.get(j)+" Wone The Match!!! And Your Total Score Is "+PlayerScore.get(j));
					break CC;
				}
			  }
			} while(Collections.max(PlayerScore)<=30); 
			
		
	
		
		
//		CC:	while(Collections.max(PlayerScore)<=30) {
//
//			for(int j=0; j<=NumberOfPlayers-1; j++) {
//				if(Collections.max(PlayerScore)>=30) {
//					System.out.println(PlayerName.get(j-1)+" Wone The Match!!! And Your Total Score Is "+PlayerScore.get(j-1));
//					break CC;
//				}
//				
//				System.out.println("Player "+PlayerName.get(j)+" Press Enter Key To Role Dice..!!");
//				sc.nextLine();
//				int score = (int)(Math.random()*6+1);
//				PlayerScore.set(j, PlayerScore.get(j)+score);
//				System.out.println(PlayerName.get(j)+" Scored "+score +" And Your Total Score Is "+PlayerScore.get(j));
//			}
//			
//		}

	}

}
