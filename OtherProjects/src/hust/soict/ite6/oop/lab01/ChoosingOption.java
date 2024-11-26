package hust.soict.ite6.oop.lab01;

import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
/*Yes/No option 
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticket?","Choosing Options",JOptionPane.YES_NO_OPTION);
		JOptionPane.showMessageDialog(null, "You've chosen: "+ (option==JOptionPane.YES_OPTION?"Yes":"No"));
*/

/*Customizable option*/
		String[] options = new String[] {"I do","I don't","I dont know"};
		
		int option = JOptionPane.showOptionDialog(
				null, 
				"Do you want to change the first class ticket?", 
				"Choosing Options",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE,
				null,
				options,
				options[0]
		);
		
		if (option==0) {
			JOptionPane.showMessageDialog(null, "You've chosen: I do");
		}
		else if (option==1){
			JOptionPane.showMessageDialog(null, "You've chosen: I don't");
		}
		else {
			JOptionPane.showMessageDialog(null, "You've chosen: I dont know");
		}
		
		System.exit(0);
	}
}

