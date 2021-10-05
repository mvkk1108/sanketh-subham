package oop;

public class DiceGame {

	public static void main(String[] args) {
		// two dice objects
		int a;  // primitives
		
		   a = 80;
		Dice diceOne;
		diceOne = new Dice(); // constructor call
		
		Dice diceTwo = new Dice();
		
		// player objects
		
		Player playerOne = new Player();
		
		playerOne.setName("Sanketh");
		playerOne.throwDice(diceOne, diceTwo); // method call or message passing
		//Player()
		Player playerTwo = new Player("Subham");
		playerTwo.throwDice(diceOne, diceTwo);
		
		if(playerOne.getValue()> playerTwo.getValue())
		{
			System.out.println("P1 wins the game");
		}
		else
		{
			System.out.println("p2 wins the game");
		}
		
		
		
	}

}
/*  constructor
 * :
 * is special method which is used to initialize instance variables
 * 
 *      a) the name of the constructor is always name of the class
 *      b) constructor does not return any thing including void
 *      c) only initialzation login need to be included in the constructor
 *      
 *       Types of Constructor:
 *       1) No arg or Default
 *       2) parameterized
 *       
 *       Constructor overloading :
 *       defining more then one constructor in class
 *       
 *       Encapsulation : 
 *       
 *        binding or wrapping of  data and methods into single unit 
 *        
 *        Advantage : 
 *        
 *         hiding data
 * 
 */
