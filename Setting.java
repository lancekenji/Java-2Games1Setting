/*

 __  __     __  __     __    __     ______     ______   ______     ______     __  __    
/\ \/ /    /\ \/\ \   /\ "-./  \   /\  __ \   /\__  _\ /\  ___\   /\  ___\   /\ \_\ \   
\ \  _"-.  \ \ \_\ \  \ \ \-./\ \  \ \  __ \  \/_/\ \/ \ \  __\   \ \ \____  \ \  __ \  
 \ \_\ \_\  \ \_____\  \ \_\ \ \_\  \ \_\ \_\    \ \_\  \ \_____\  \ \_____\  \ \_\ \_\ 
  \/_/\/_/   \/_____/   \/_/  \/_/   \/_/\/_/     \/_/   \/_____/   \/_____/   \/_/\/_/ 
                                                                                        
                                                                                        
 _____     ______     __   __   ______     __         ______     ______   ______     ______     ______    
/\  __-.  /\  ___\   /\ \ / /  /\  ___\   /\ \       /\  __ \   /\  == \ /\  ___\   /\  == \   /\  ___\   
\ \ \/\ \ \ \  __\   \ \ \'/   \ \  __\   \ \ \____  \ \ \/\ \  \ \  _-/ \ \  __\   \ \  __<   \ \___  \  
 \ \____-  \ \_____\  \ \__|    \ \_____\  \ \_____\  \ \_____\  \ \_\    \ \_____\  \ \_\ \_\  \/\_____\ 
  \/____/   \/_____/   \/_/      \/_____/   \/_____/   \/_____/   \/_/     \/_____/   \/_/ /_/   \/_____/ 



				@author Janrell Quiaroro | Lance Kenji Parce
*/
package pkgfinal;
public class Setting {
	
  //TOTAL SCORE
  static int total_score = 0;
  
  /* [START] VERIFIER FOR GAME OVER [START] */
  static int verifier = 0;
  public static int doThis(int trigger) {
    int x = trigger;
    verifier = x;
    return x;
  }
  /* [END] VERIFIER FOR GAME OVER [END] */
  
  /* [START] MESSAGES [START] */
  
  //WELCOME MESSAGE FIRE WATER GRASS HERE!
  static void fwg() {
	  System.out.println("=========================================");
	  System.out.println("Welcome to Fire,Water,Grass Game!");
  }
  
  //WELCOME MESSAGE COLOR GUESS HERE!
  static void cg() {
	  System.out.println("=========================================");
	  System.out.println("Welcome to Color Guess Game");
  }
  
  //VICTORY MESSAGE HERE!
  static void victory(int a) {
    System.out.println("=========================================");
    System.out.print("Congratulations! You won the game!\n");
    System.out.print("Total Score: " + a + "\n");
    System.out.println("=========================================");
    System.exit(0);
  }

  //GAMEOVER MESSAGE HERE!
  static void gameOver(int b) {
    b -= 20;
    System.out.println("=========================================");
    System.out.print("Better Luck Next Time!\n");
    System.out.print("Total Score: " + b + "\n");
    System.out.println("=========================================");
    System.exit(0);
  }
  
  /* [END] MESSAGES [END] */

}
