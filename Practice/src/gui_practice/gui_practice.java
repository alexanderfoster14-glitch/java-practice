package gui_practice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui_practice {
	public static void main(String[] args) {
      
		JFrame jFrame = new JFrame();	//New JFrame object
		JPanel jPanel = new JPanel();	//New JPanel object
		JTextField jTextField = new JTextField();	//New JTextFieldObject
		
		jFrame.setSize(400, 300);		//Set the frame's width to 400 and height to 300 pixels
		jFrame.setTitle("An Example JFrame");	//Set the frame's title
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//Set program to exit when the frame is closed
		
		jTextField.setText("You can type here!");
		
		jPanel.add(jTextField);			//Add the JTextField to the JPanel
		jFrame.add(jPanel);				//Add the JPanel to the JFrame
		
		jFrame.setVisible(true);		//Make the frame visible	
	}
}