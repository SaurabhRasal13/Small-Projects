import java.util.Scanner;

class Coach
{
	int guessNum;
	
	int guessNum()
	{
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Coach please Guess a Number :");
	  guessNum = scan.nextInt();
	  return guessNum;
	}
}

class Players
{
	int guessNum;
	
	int guessNum1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Rohit please guess a number :");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	int guessNum2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Surya please guess a number :");
		guessNum = scan.nextInt();
		return guessNum;
	}
	
	int guessNum3()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hardik please guess a number :");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromCoach;
	int numFromRohit;
	int numFromSuryakumar;
	int numFromHardik;
	
	void collectFromCoach()
	{
		Coach c=new Coach();
		numFromCoach=c.guessNum();
	}
	
	void collectFromPlayers()
	{
		Players rohit=new Players();
		Players surya=new Players();
		Players hardik=new Players();
		
		numFromRohit = rohit.guessNum1();
		numFromSuryakumar = surya.guessNum2();
		numFromHardik = hardik.guessNum3();
	}	
	void compare()
	{
		if( numFromCoach == numFromRohit)
		{
			if(numFromCoach == numFromSuryakumar && numFromCoach == numFromHardik)
			{
				System.out.println("All players have won the game!");
			}else if(numFromCoach == numFromSuryakumar)
			{
				System.out.println("Rohit and Suryakumar have won the game!");
			}else if(numFromCoach == numFromHardik)
			{
				System.out.println("Rohit and Hardik have won the game!");
			}else
			{
				System.out.println("Rohit have won the game!");
			}
		}else if(numFromCoach == numFromSuryakumar)
		{
			if(numFromCoach == numFromHardik)
			{
			System.out.println("Suryakumar and Hardik have won the game!");
			}else
			{
				System.out.println("Suryakumar have won the game!");
		    }
		}else if(numFromCoach == numFromHardik)
		{
			System.out.println("Hardik have won the game!");
		}else
		{
			System.out.println("Game Lost Please Play Again!!!!");
		}
	}
		
	
}

public class Guesser_Game {

	public static void main(String[] args) {
		
		Umpire u = new Umpire();
		u.collectFromCoach();
		u.collectFromPlayers();
		u.compare();
		
		
	}
}	









/*
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}


public class Guesser_Game {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();

	}

}
*/