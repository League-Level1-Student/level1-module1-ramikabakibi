package _07_binary_converter;

class Pig {
	private String name;
	private boolean isSheepHerder;

	public Pig(String name, boolean canHerdSheep) { // write code here
		this.name = name;
		this.isSheepHerder = canHerdSheep;

	}

	public boolean willBecomeBacon() {
		if (this.isSheepHerder) {
			return false;
		}
		else {
			return true;
		}
	}
	public void  baconDestiny() {
		if(willBecomeBacon()) {
			System.out.println("bacon for breakfast");
		}
		else {
		System.out.println("eggs for breakfast");	
		}
	}
}
