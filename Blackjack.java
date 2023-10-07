import java.util.Scanner;

public class Blackjack {
 public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
      
      
      System.out.println("Welcome to the Java Casino");
      System.out.println("Do you have a knack for Black Jack \nWe shall see... \n...Ready Press anything to start");
      scan.nextLine();

      System.out.println("You get a ");
      int userCard1 = randomCard();
      System.out.println(cardString(userCard1));
      
      System.out.println("and a ");
      int userCard2 = randomCard();
      System.out.println(cardString(userCard2));
      

    int cardTotal = Math.min(userCard1, 10) + Math.min(userCard2, 10);
      System.out.println("Your card total is: " + cardTotal);

      System.out.println("Ready to see the dealers hand? Press Enter");
      scan.nextLine();

      System.out.println("The dealer shows ");
      int dealerCard = randomCard();
      System.out.println(cardString(dealerCard));

      System.out.println("And has a face down card");
      System.out.println(faceDownCard());
      int dealerCard2 = randomCard();

      int dealerTotal = Math.min(dealerCard, 10) + Math.min(10, dealerCard2);

      String decision = hitOrStay();

      while(decision.equals("hit")){
        System.out.println("You hit and the card you go is ");
        int hitCard = randomCard();
        System.out.println(cardString(hitCard));
        int newCardTotal = Math.min(hitCard, 10) + cardTotal;
        
        System.out.println("Your total is: " + newCardTotal);
        cardTotal = newCardTotal;
       
        if(newCardTotal > 21){
          System.out.println("Bust! You lose!");
          System.exit(0);
        } else{
          decision = hitOrStay();
        }
        }
        if(decision.equals("stay")){
          System.out.println("Dealer's turn");
          
          System.out.println("The dealer's hand is ");
          System.out.println(cardString(dealerCard));
          
          System.out.println("And a ");
          
          System.out.println(cardString(dealerCard2));
          

          

          System.out.println("Dealer total is: " + dealerTotal);

          if(dealerTotal < 17){
            int dealerHitCard = randomCard();
            System.out.println("The dealer hits and draws a ");
            System.out.println(cardString(dealerHitCard));
            int dealerNewTotal = dealerTotal + dealerHitCard;
            dealerTotal = dealerNewTotal;
            System.out.println("The dealers new total is " + dealerNewTotal);
              if(dealerNewTotal > 21){
                System.out.println("Bust! Dealer Loses!");
              }
            for(int i = dealerNewTotal; i <= 17; i +=dealerHitCard){
              System.out.println("The Dealer hits and draws a ");
              dealerHitCard = randomCard();
              System.out.println(cardString(dealerCard));
              dealerNewTotal = dealerTotal + dealerHitCard;
              System.out.println("The dealer new total is " + dealerNewTotal);
              dealerTotal = dealerNewTotal;
              if(dealerNewTotal > 21){
                System.out.println("Bust! Dealer Loses! You win!");
                System.exit(0);

                
              



            }
          }
          
        }


        }
        if(dealerTotal > cardTotal){
          System.out.println("Computer wins! Better luck next time");
        } else if(cardTotal > dealerTotal){
          System.out.println("You win!");
        }
      


      
      




      
      
      
      

      
         
    }
    public static int randomCard(){
        int randomRoll = (int)(Math.random()*13+1);
      return randomRoll;}
        
    public static String cardString(int cardNumber){  
      switch(cardNumber){
        case 1: {
         return
         "   _____\n"+
         "  |A _  |\n"+ 
         "  | ( ) |\n"+
         "  |(_'_)|\n"+
         "  |  |  |\n"+
         "  |____V|\n";

        }case 2: {
         return           
         "   _____\n"+              
          "  |2    |\n"+ 
          "  |  o  |\n"+
          "  |     |\n"+
          "  |  o  |\n"+
          "  |____Z|\n";
        
        }case 3:{return
        "   _____\n" +
        "  |3    |\n"+
        "  | o o |\n"+
        "  |     |\n"+
        "  |  o  |\n"+
        "  |____E|\n";

        }case 4:{return
         "   _____\n" +
         "  |4    |\n"+
         "  | o o |\n"+
         "  |     |\n"+
         "  | o o |\n"+
         "  |____h|\n";

        }case 5:{return
          "   _____ \n" +
          "  |5    |\n" +
          "  | o o |\n" +
          "  |  o  |\n" +
          "  | o o |\n" +
          "  |____S|\n";

        }case 6:{return
          "   _____ \n" +
          "  |6    |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  | o o |\n" +
          "  |____6|\n";

        }case 7:{return
    
          "   _____ \n" +
          "  |7    |\n" +
          "  | o o |\n" +
          "  |o o o|\n" +
          "  | o o |\n" +
          "  |____7|\n";

        }case 8:{return
  
          "   _____ \n" +
          "  |8    |\n" +
          "  |o o o|\n" +
          "  | o o |\n" +
          "  |o o o|\n" +
          "  |____8|\n";
   
        }case 9:{return
          "   _____ \n" +
          "  |9    |\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |____9|\n";

        }case 10:{return
          "   _____ \n" +
          "  |10  o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |o o o|\n" +
          "  |___10|\n";
  
        }case 11:{return

          "   _____\n" +
          "  |J  ww|\n"+ 
          "  | o {)|\n"+ 
          "  |o o% |\n"+ 
          "  | | % |\n"+ 
          "  |__%%[|\n";
  
        } case 12:{return

          "   _____\n" +
          "  |Q  ww|\n"+ 
          "  | o {(|\n"+ 
          "  |o o%%|\n"+ 
          "  | |%%%|\n"+ 
          "  |_%%%O|\n";
    
        } case 13:{return
          "   _____\n" +
          "  |K  WW|\n"+ 
          "  | o {)|\n"+ 
          "  |o o%%|\n"+ 
          "  | |%%%|\n"+ 
          "  |_%%%>|\n";
         

     } default:{
         return " "; 
     }
     
 }
    }

public static String faceDownCard(){
  return
    "   _____\n"+
    "  |     |\n"+ 
    "  |  J  |\n"+
    "  | JJJ |\n"+
    "  |  J  |\n"+
    "  |_____|\n";
}
public static String hitOrStay(){
  System.out.println("Would you like to 'hit' or 'stay'?");
  String option = scan.nextLine();
  while(!(option.equals("hit")||option.equals("stay"))){
    System.out.println("Please type 'hit' or 'stay'");
    option = scan.nextLine();
  }
  return option;
}
  
  

  }
 
    
  
  




