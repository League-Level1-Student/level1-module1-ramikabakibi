package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor=JOptionPane.showInputDialog("What flavour would you like your popcorn to be?");
Microwave wave= new Microwave();
Popcorn bob= new Popcorn(flavor);
wave.putInMicrowave(bob);
String time= JOptionPane.showInputDialog("How many minutes do you want to cook your popcorn?");
int a=Integer.parseInt(time);
wave.setTime(a);
wave.startMicrowave();
}

}
