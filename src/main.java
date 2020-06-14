
public class main {

	public static void main(String[] args) {
	// Berechnung der ersten 100 Priemzahlen
		int anz=1; // Anzahl der ausgegebenen Priemzahlen
		check check = new check();
		for (int i=0;i<1000000;i++) {
			if (check.isprim(i)) {
				System.out.println(i+" ist die "+anz+". Primzahl");
				anz++;
			}
			if (anz == 5000) break;
		}
//		System.out.println(check.isprim(4999));
	}

}
