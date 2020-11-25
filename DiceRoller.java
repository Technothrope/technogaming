/*
 * DiceRoller.java
 * 
 * Copyright 2020 Terence Connors
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * Goal: Write a dice roller that asks what kind of dice to roll, how
 * many of them to roll, how to read the result, generates random
 * numbers, reads the results according to instructions, displays those
 * results.
 * 
 */
import java.util.*; 	//For Scanner

public class DiceRoller {
	
	public static void main (String[] args) {
		giveDiceRollerIntro();
		Scanner console = new Scanner(System.in);
		int diceType = selectDiceType(console);
		int diceQuantity = diceQuantity(console);
		int how2Roll = how2Roll(console);
		//int targetNumber = targetNumber(console);
		//int how2ReadTargetNumber = how2ReadTargetNumber(console);
		//int diceRoll = diceRoll(int diceType, int diceQuantity,
				//int how2Roll, int targetNumber, int how2ReadTargetNumber);
		//boolean rollAgain = rollAgain(console);
		//boolean useSameTarget = useSameTarget(console);
		//boolean exitDiceRoller = exitDiceRoller(console);
	}
	public static void giveDiceRollerIntro() {
		System.out.println("This is a system-agnostic dice roller.");
	}
	public static int selectDiceType(Scanner console) {
		System.out.println("How many sides does the die have? ");
		int diceType = console.nextInt();
		return diceType;
	}
	public static int diceQuantity(Scanner console) {
		System.out.println("How many dice need to be rolled? ");
		int diceQuantity = console.nextInt();
		return diceQuantity;
	}
	public static int how2Roll(Scanner console) {
		System.out.println("How should they be read? Enter \"1\" for");
		System.out.println("the highest value; \"2\" for the lowest");
		System.out.println("value; \"3\" for sum the values; or \"4\"");
		System.out.println("for quantities of a target number rolled.");
		int how2Roll = console.nextInt();
		return how2Roll;
	}
}
