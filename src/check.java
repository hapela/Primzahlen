public class check {

	int zahl;
	
	public boolean isprim(int zahl) {
		this.zahl = zahl;
		if(this.zahl < 2) return false;
		for (int i=2; i<this.zahl;i++) {
			if(this.zahl %i == 0) {
				return false;
			} 
		}
		return true;
	}
	
	
	
}
