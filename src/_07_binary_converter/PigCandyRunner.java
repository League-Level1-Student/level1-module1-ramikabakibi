package _07_binary_converter;



public class PigCandyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy twix=new Candy("Daniel", true, .50);
		Pig Babe=new Pig("Babe", true);
		System.out.println("Babe will become bacon: " +Babe.willBecomeBacon());
		Pig Rasher=new Pig("Rasher", false);
		System.out.println("Rasher will become bacon: "+Rasher.willBecomeBacon());
		Pig Ziggy=new Pig("Ziggy", true);
		System.out.print("Ziggy will become ");
		Ziggy.baconDestiny();
	}

}
