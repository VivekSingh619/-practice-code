import java.util.Scanner;
public class Game{
    public static void main(String [] args){
      start();
    }
    
    public static void start(){
        //INTRO
      System.out.println("This is a Guessing game");
      System.out.println("Enter a word and some hints");                   
      System.out.println("and let other players guess the word");
      System.out.println("Enter play or quit: ");  
        //USER INPUT
      Scanner keyboardInput = new Scanner(System.in);
      String start = keyboardInput.nextLine();
        if(start.equals("play")){
      String hint1,hint2;
            System.out.print("Enter the secret word: ");
            String secretWord = keyboardInput.nextLine();

            System.out.print("Now, Enter some hints: ");
            System.out.print("Is it an object (true/false): ");
            boolean anObject = keyboardInput.nextBoolean();
              if(anObject == true){                                     //Assigning hint1 value
              hint1 = "Hint1 : It is an object.";
              }
              else{
              hint1 = "Hint1 : It is not an object.";
              }

            System.out.print("Is it small (true/false): ");
            boolean isSmall = keyboardInput.nextBoolean();
              if(isSmall == true){                                      //Assigning hint2 value
              hint2 = "Hint2 : It is small";
              }
              else{
              hint2 = "Hint2 : It is not small.";
              }

            System.out.print("how many guesses you want to give: ");
            int guessCount = keyboardInput.nextInt();
            
            System.out.print("\033[H\033[2J");                         //Clears the screen
            System.out.flush();
            
           gameEngine(hint1, hint2,secretWord, guessCount);
      
            
        }
        else{
            System.exit(0);
        }
        
    }
    
    
    public static void gameEngine(String hint1, String hint2, String word, int guessCount){
      Scanner playerInput = new Scanner(System.in);
      System.out.println(hint1);
      System.out.println(hint2);
      int tries= guessCount;
        for(int i=1; i<=guessCount; i++){
            
            System.out.println("Tries left: "+tries);
            System.out.println("Enter your guess: ");
            String guess = playerInput.nextLine();
            tries--;
            if (guess.equals(word) && i <= guessCount){
              System.out.println("You Guessed!");
            }else if(i >= guessCount){
              System.out.println("Sorry! You ran out of Guesses.");
              System.out.println("The Word was: "+word);
            }

          } 
          System.out.println("Replay?(y/n) : "); 
          String replay = playerInput.nextLine();
          if(replay.equals("y")){
            System.out.print("\033[H\033[2J");                         //Clears the screen
            System.out.flush();
            start();
          }  
          else{
            System.out.println("Thankyou for Playing!");
          }


            
    }


}