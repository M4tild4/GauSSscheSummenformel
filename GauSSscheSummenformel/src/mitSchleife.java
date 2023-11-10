public class mitSchleife {
	int n;
	int e;
	
	mitSchleife(int n){
		for (int i = 1; i <= n; i++) {
			e = e + i;}
		
	}
		
	int gete() {							//Methode
		return this.e;						
	}	
}