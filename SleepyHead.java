package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         */
        int word = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         
 if(word==0) {
  isWeekday = true;
 word = JOptionPane.showConfirmDialog(null,"are you on vacation?","Sleepy Head", JOptionPane.YES_NO_OPTION);
  }
else if(word==0) {
	isVacation = true;
	JOptionPane.showMessageDialog(null, "sleep in");
}
else {
	isVacation = false;
	JOptionPane.showMessageDialog(null, "Get up sleepy bones");
}
if(word==1) {
	isWeekday = true;
word =	JOptionPane.showConfirmDialog(null,"are you on vacation?","Sleepy Head",JOptionPane.YES_NO_OPTION);
}
else if(word==0) {
	isVacation = true;
	JOptionPane.showMessageDialog(null,"sleep in");
	}

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
