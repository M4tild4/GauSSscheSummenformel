
public class rekursiv {
	int n;
	
	int rekursiveSumme(int n) {
		if (n <= 0) {
			return 0;}
		else {
		return rekursiveSumme(n - 1) + n;
		}
	}
	
}
