package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
		static int mood = 0;
	public static void main(String[] args) {
		String pet = JOptionPane.showInputDialog("What Kind of Pet do you want to buy?");
		JOptionPane.showMessageDialog(null,"You got a "+pet+"!!!!");
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i=0 ; i<5; i++) {			
		int task = JOptionPane.showOptionDialog(null, "What would you like to do with your "+pet+"?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "clean", "Play", "Feed" }, null);
if(task==0) {
	clean();
}
if(task==1) {
play();
}
if(task==2) {
 feed();
}

}
if(mood>0) {
	JOptionPane.showMessageDialog(null, "Your "+pet+" loves you and wants to stay with you!");
}
else {
	JOptionPane.showMessageDialog(null, "Your "+pet+" could stand your abuse and ran away.");
}
	// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	}
	static void clean() {
		JOptionPane.showMessageDialog(null,"Your pet hated the bath.");
		mood--;
		System.out.println(mood);
	}
	static void play() {
		JOptionPane.showMessageDialog(null, "Your pet enjoyed playing with you");
		mood++;
		System.out.println(mood);
	}
	static void feed() {
			JOptionPane.showMessageDialog(null, "Your pet ate the food happily");
	mood++;
	System.out.println(mood);
	}
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}