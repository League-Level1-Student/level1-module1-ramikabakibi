package _07_binary_converter;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JTextField answer = new JTextField(20);
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button = new JButton();

public BinaryConverter() {
		frame.add(panel);
		frame.pack();
		panel.add(answer);
		panel.add(label);
		panel.add(button);
		button.setText("convert");
		button.addActionListener(this);
		frame.show();
		frame.pack();
//need to add action listener to button
	}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}

                                       

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	String a=convert(answer.getText());
	label.setText(a);
}
}
