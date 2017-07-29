package candycrush;

import javax.swing.JOptionPane;

public class CandyCrush {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("who do you hate?");
		JOptionPane.showMessageDialog(null, "you totally have crush on " + name);

	}

}
