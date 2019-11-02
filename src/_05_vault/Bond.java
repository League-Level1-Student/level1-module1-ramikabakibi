package _05_vault;

public class Bond {
int findCode(Vault v) {
	for(int i=0;i<10000000;i++) {
		if(v.tryCode(i)==true) {
			return i;
		}
		
	}
	return -1;
}
}
