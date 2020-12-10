
public class KalitimUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hayvan a=new Hayvan();
	
		System.out.println("----------");
		Etcil b=new Etcil();
		b.CeneYapisi();
		b.Beslenme();
		System.out.println("Kilo="+b.kilo);
		System.out.println("----------");
		Otcul c=new Otcul();
		c.CeneYapisi();
		c.MideYapisi();
		System.out.println("----------");
		Kuslar d=new Kuslar();
		d.Solunum();
		System.out.println("----------");
		Hayvan e=new Hayvan(45);
		Etcil f=new Etcil();		
		System.out.println("Kilo="+f.kilo);
		
		
	}
}


