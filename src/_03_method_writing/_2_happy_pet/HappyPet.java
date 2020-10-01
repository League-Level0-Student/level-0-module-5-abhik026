package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String petChoice;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		 petChoice =  JOptionPane.showInputDialog("What pet do you want? Ans :");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			
		
		//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for(int i =0; i<1;) {
		if(happinessLevel > 100) {
			JOptionPane.showMessageDialog(null, "Your "+petChoice+" loves you!");
			break;
		}
		else {		
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happier?"
					+ "", "Happiness Level", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Food", "Play", "Sleep", }, null);

			if(task == 0) {
				food();
			}
			else if(task ==1) {
				play();
			}
			else{
				sleep();
				// 5. Use user input to call the appropriate method created in step 4.
			}
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			}
	}
private static void food() {
	JOptionPane.showMessageDialog(null, "The "+petChoice+" liked the food");
	
	happinessLevel += 10;
}
private static void play() {
	JOptionPane.showMessageDialog(null, "The "+petChoice+" is healthy");
	happinessLevel += 20;
}
private static void sleep() {
	JOptionPane.showMessageDialog(null, "The "+petChoice+" is rested");
	happinessLevel += 5;
}// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}