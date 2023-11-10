public class kleinerGauss {

	public static void main(String[] args) {
		
		kleinerGaussttt S = new kleinerGaussttt(4);				
		System.out.println(S.getn());
		
		mitSchleife S1 = new mitSchleife(3);
		System.out.println(S1.gete());
		
		rekursiv S2 = new rekursiv();
		System.out.println(S2.rekursiveSumme(2));

	}

}
