package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Sejal Duhan
 * @author Feb 6,2024
 */
public class CardTrick {
    
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        Random random = new Random();

       for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1; // 1-13 for Ace to King
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)];
            hand[i] = new Card();
            hand[i].setValue(value);
            hand[i].setSuit(suit);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter suit (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int suitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[suitIndex];

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                match = true;
                break;
            }
        }

        if (match) {
            printInfo();
        } else {
            System.out.println("Sorry, no match!");
        }

        scanner.close();
    }

    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
