//Ian Repik
import java.util.Scanner;
public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		//welcome to the game
		System.out.println("welcome to the door game!\nYou are walking in the woods one day and you stumble across a door.\nDo you go in? ");
		String First_C= key.nextLine();
		if (First_C.equalsIgnoreCase("yes")) {
			System.out.println("You see two doors one on the left and the other on the right\n Witch door do you chose? ");
		} 
		else if(First_C.equalsIgnoreCase("no")) {
			System.out.println("Not only do you lose but you miss out on an epic adventure");
			System.exit(0);
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		String Second_C= key.nextLine();
		if (Second_C.equalsIgnoreCase("left")) {
			System.out.println("WOW! You see three new doors!\nOne is Green one is Red, and one is Blue\nWhich one are you picking?");
		}
		else if(Second_C.equalsIgnoreCase("right")) {
			System.out.println("Okay! You see two new doors they look difrent\nOne is made of wood and one is made of Stone\nWhat door do you pick?");
		}
		else {
			System.out.println("invalid input exiting the code!");
			System.exit(0);
		}
		String Third_C=key.nextLine();
		if (Third_C.equalsIgnoreCase("Green")) {
			System.out.println("You walk into a dark room...You ask whats that small but before you can compare it to somthing\nA Giant club from a ogre crushes you\nYou die...");
			System.exit(0);
		}
		else if (Third_C.equalsIgnoreCase("Blue")) {
			System.out.println("You walk in too what seems like the wild savana the door cloes behind you and you hear a farmiliar (ROWAR)...\n before the lion sinks his teeth in your neck\nYou die");
			System.exit(0);
		}
		else if (Third_C.equalsIgnoreCase("red")) {
			System.out.println("You see a small fariy come down shes says to you Congrats you have found the forests treasure how much are you going to take?(MAX:100");
			int Coin_amount=key.nextInt();
			if(Coin_amount>=1 && Coin_amount<=19) {
				System.out.println("You drop a coin and dont seem to know\n While walking out you trip on the coin and die\nYou lose");
			}
			else if(Coin_amount>=20 && Coin_amount<=49) {
				System.out.println("You make it out with "+Coin_amount+" and you Win Congrats!");

			}
			else if(Coin_amount>=50 && Coin_amount<=100) {
				System.out.println("You took too many.\n the pressure plate triggers and a maisve rock rools and crushes you\nYou lose");

			}
			else {
				System.out.println("We simply can not give you that amount sorry");
				System.exit(0);
			}
		}
		else if(Third_C.equalsIgnoreCase("wood")) {
			System.out.println("You walk into the Wood door you see a flower and mushroom which one do you investagate?");
			String Wood_C=key.nextLine();
			if (Wood_C.equalsIgnoreCase("Flower")){
				System.out.println("You go to smell the flower but it smells you taking your soul.\nYou lose");
				System.exit(0);
			}
			else if (Wood_C.equalsIgnoreCase("mushroom")){
				System.out.println("You lok at the mushroom and it puffs it spors at you.\n Yes fall asleep and wake up back at home\n Was it just a dream?\nYou lose");
				System.exit(0);
			}
			else {
			System.out.println("Not a valid option.");
			System.exit(0);
			};
		}
		else if(Third_C.equalsIgnoreCase("stone")) {
			System.out.println("The door opens like it knows you chose it do you go in or turn around?");
			String Stone_C =key.nextLine();
					if(Stone_C.equalsIgnoreCase("Yes")) {
						System.out.println("You go in and see a big pile of rocks then...\n It moves just a bit....\n A Gitant Stone monster rises up and crushes you with its stony hand\n You Lose");
						System.exit(0);
					}
					else if(Stone_C.equalsIgnoreCase("Turn around")){
						System.out.println("You turn and take one step, but no more then that one becasue\n a trap door opens below you. You fall to your death\n You Lose");
						System.exit(0); 
					}
					else {
						System.out.println("You did not imput a valid answer please try agin");
						System.exit(0);} 
}
		//goal is to get gold if you cant get it or die you lose 
		
		// left or right door?
		//if left then ask green red or blue
		//if right ask door made of wood or dorr made of rock
		/*
		 * if green you are fased by a orger and die
		 * 
		 * if red you find a plie of goold and are asked how much to take
		 * if you take 50-100 a masive rock crushies you and you die
		 * if you take 20-49 you caxn leave with your gold 
		 * if you take 1-19 you drop a coin and trip on it and die
		 * 
		 * if blue then a you are stuck in a room with lion and die
		 * 
		 * if wood then you are sent out side and cant find the fist two doors you lose 
		 * 
		 * if rock you open the door and look in go in or turn around 
		 * 
		 * if go in you see a big rock mound it  comes to life and kills you 
		 * 
		 * if you  turn around a trap door opens and you are now stuck in a hole and loes
		 */
	}
	
	
	
	}

