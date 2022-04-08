package collections.jv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class GenCollection {
static	int numbOfPlayers;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Type Number Of players.. ");
		numbOfPlayers= Integer.valueOf(sc.nextLine());
		
		int playerNameAndScore[][] = new int[numbOfPlayers][2];
		
		for(int i=0; i<=numbOfPlayers-1; i++) {
				System.out.println("Enter Player "+i+" Name");
				playerNameAndScore[i][0] =sc.nextInt();
				playerNameAndScore[i][1] =1;
		}
		
		System.out.println("Let the Geam Begin..!!");
		sc.nextLine();
	cc:	while(GetHighestScollOfPlayers(playerNameAndScore)<=30) {
			for(int i=0; i<=numbOfPlayers-1; i++) {
				if(GetHighestScollOfPlayers(playerNameAndScore)>=30) {
					System.out.println("Player "+playerNameAndScore[i-1][0]+" You Won the Game!!! With Total Score"+playerNameAndScore[i-1][1]);
					
					break cc;
				}
				System.out.println("Player "+playerNameAndScore[i][0]+" Press Any Key!");
				sc.nextLine();
				int score = (int)(Math.random()*6+1);
				
				playerNameAndScore[i][1] =playerNameAndScore[i][1]+score;
				System.out.println("Player "+playerNameAndScore[i][0]+" You scored "+score+" your Total Is "+playerNameAndScore[i][1]);
		}
			
		}
		

	}

	private static int GetHighestScollOfPlayers(int[][] playerNameAndScore) {
		List<Integer> scores = new ArrayList<Integer>(numbOfPlayers);
		
		for(int i=0; i<=numbOfPlayers-1; i++) {
			scores.add((Integer) playerNameAndScore[i][1]);
		}
		
		
		return Collections.max(scores);
		 
	}

	

}
