/*
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
*/

package gui_practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class gui_practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vehicle Maintenance");
        JPanel panel = new JPanel();

        JButton button = new JButton("View Maintenance");

        panel.add(button);
        frame.add(panel);
        
        button.addActionListener(new ActionListener() {
            @Override
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(button, "Button was pressed");
        	}
        });

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


/*
Hi Dillon, I like your example and explanation that it's like working on a car.
The code provided gives a quick example on how to add elements to a the program's GUI.

To implement the Button you've already initialized, we could add the even handler by the updating the code to something like this.
I like to add a simple pop up window during testing to verify it's working correctly.

For your question about what is a method to organize the GUI layout,
I found that sketching the layout wither with a pen and paper or using lines in a text editor helps
keep it all straight.
I'm certain there are better ways, but I like the simplicity and how quickly I can adjust something.

Something like this:
Window:						gridY Pos
-------------------------	-------------
|	Title				|	|			|
|-----------------------|	|-----------|
|	Instructions		|	|	y =	1	|
|-----------------------|	|-----------|
|	Input Area			|	|	y = 2	|
|-----------------------|	|-----------|
|	Exit Button			|	|	y = 3	|
-------------------------	-------------

*/










