package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
	
	String num = JOptionPane.showInputDialog("give me your first number");
	
	int nu = Integer.parseInt(num);
	
	String num2 = JOptionPane.showInputDialog("give me your second number");
	
	int nu2 = Integer.parseInt(num2);
	
	// 2. Customize pop-up to support add/subtract/multiply/divide operations.
	
	int operation = JOptionPane.showOptionDialog(null,nu+" _ "+nu2, "choose symbol", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "*", "/" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation==0) {
	add(nu,nu2);
}
if(operation==1){
	minus(nu,nu2);
}
if(operation==2) {
	multiply(nu,nu2);
}
if(operation==3) {
	divide(nu,nu2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int nu,int nu2) {
JOptionPane.showMessageDialog(null,""+nu+"+"+nu2+"="+(nu+nu2));
}
static void minus(int nu,int nu2) {
JOptionPane.showMessageDialog(null,""+nu+"-"+nu2+"="+(nu-nu2));
}
static void multiply(int nu,int nu2) {
JOptionPane.showMessageDialog(null,""+nu+"*"+nu2+"="+(nu*nu2));
}
static void divide(int nu,int nu2) {
	JOptionPane.showMessageDialog(null, ""+nu+"/"+nu2+"="+(nu/nu2));
}
}
	// 4. Create similar methods for subtraction, multiplication and division.
