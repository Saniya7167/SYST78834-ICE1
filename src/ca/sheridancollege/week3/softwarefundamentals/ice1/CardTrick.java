/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Saniya Hussain
 * @modified by Saniya Hussain
 *
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();

         //Generate card value
         Random rValue = new Random();
         int lowest = 1;
         int highest = 14;
         int cardValue = rValue.nextInt(highest - lowest) + lowest;
         c.setValue(cardValue);


         //Generate suit
         Random rSuit = new Random();
         int low = 1;
         int high = 5;
         int cardSuit = rSuit.nextInt(high - low) + low;

         if (cardSuit == 1) {
            c.setSuit("Spades");
         }
         if (cardSuit == 2) {
            c.setSuit("Hearts");
         }
         if (cardSuit == 3) {
            c.setSuit("Diamonds");
         }
         if (cardSuit == 4) {
            c.setSuit("Clubs");
         }

         //add card to magic Hand array
         magicHand[i] = c;
      }

      //Temporary magic hand print
      //System.out.println(magicHand[0].getValue() + " " + magicHand[0].getSuit());
      //System.out.println(magicHand[1].getValue() + " " + magicHand[1].getSuit());
      //System.out.println(magicHand[2].getValue() + " " + magicHand[2].getSuit());
      //System.out.println(magicHand[3].getValue() + " " + magicHand[3].getSuit());
      //System.out.println(magicHand[4].getValue() + " " + magicHand[4].getSuit());
      //System.out.println(magicHand[5].getValue() + " " + magicHand[5].getSuit());
      //System.out.println(magicHand[6].getValue() + " " + magicHand[6].getSuit());

      //Take user input
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter Card Number (1-13) ");
      int userCardvalue = obj.nextInt();

      Scanner obj1 = new Scanner(System.in);
      System.out.print("Enter Card Suit (Spades Hearts Diamonds or Clubs) ");
      String userCardsuit = obj1.nextLine();

      //Check if user's card exist in the magicHand
      boolean ifExist = false;
      for (int j = 0; j < magicHand.length; j++) {

         if (magicHand[j].getSuit().equals(userCardsuit) && magicHand[j].getValue() == userCardvalue) {
            ifExist = true;
            break;
         }
      }

      if (ifExist == true) {
         System.out.println("Magic Hand contains your chosen card");
      }
      else {
         System.out.println("Magic Hand does not contain your chosen card");
      }

   }

}
