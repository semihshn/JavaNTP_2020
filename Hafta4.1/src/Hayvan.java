
public class Hayvan {
	public static double kilo=0, Boy=0;
	public static String yasananYer="";
	
	public int publicdegisken=0;
	protected int protecteddegisken=0;
	private int privatedegisken=0;
	//Parametresiz kurucu
	Hayvan(){
		System.out.println("Hayvan sinifinin parametresiz kurucu tetiklendi");
	}
	//Parametreli kurucu
	Hayvan(double kilo){
		this.kilo=kilo;
		System.out.println("Hayvan sinifinin kurucusu tetiklendi kilo="+kilo);
	}
	
	//Kurucu fonksiyon degil her ne kadar kurucu ile ayni ismi olsa da 
	// Bu normal bir void fonksiyondur
	public void Hayvan(){
		System.out.println("Hayvan isminde fonksiyon calistirildi (Kurucu degil)");
	}
	
	public void Beslenme(){
		System.out.println("Hayvan.Beslenme fonksiyonu. Her hayvan Beslenir...");
	}
	
	public static void YasadigiYer(){
		System.out.println("Hayvan.YasadigiYer tetiklendi..");
	}
	
	public void Solunum(){
		System.out.println("Hayvan.Solunum fonksiyonu tetiklendi.. Her hayvan solunum yapar.");
	}
	
	public void CeneYapisi(){
		System.out.println("Hayvan.CeneYapisi fonksiyonu tetiklendi. Her hayvan ceneye sahiptir");
	}
	
	public void Goster(){
		System.out.println("Kilosu:"+this.kilo + " Boyu="+this.Boy);
		privatedegisken=5;
		publicdegisken=5;
		protecteddegisken=5;
	}
	

}


class Etcil extends Hayvan{
	public Etcil(){
		System.out.println("Etcil sinifinin kurucusu tetiklendi.");
	}
	
	public Etcil(double boy, double kilo){
		this.Boy=boy;
		this.kilo=kilo;
		super.kilo=kilo;
		System.out.println("Etcil sinifinin kurucusu tetiklendi.");
	}
	
	
	//Kalitildigi sinifta Var olan fonksiyonu Uzerine bindirmek
	//Yeni ozellikler eklemek
	//@Override 
	public void Beslenme(){
		System.out.println("Etcil.Beslenme fonksiyonu. Etciller yalnizca etle Beslenir...");
	}
	
	//@Override
	public void CeneYapisi(){
		System.out.println("Etcil.CeneYapisi fonksiyonu tetiklendi. Kesici disler gelismistir");
	}
	/*
	 * static tanimli fonksiyonlar Override edilemezler.
	 * Sebebi RAM uzerinde bir defa olustulmasidir.
	 * Turetilen her nesnede oldugu gibi her yeni classta da ayni adres kullanýlýr
	@Override
	public static void YasadigiYer(){
		System.out.println("Hayvan.YasadigiYer tetiklendi..");
	}
	*/
	
	public void EtcilGoster(){
		super.Goster();
		//En ust sinifin isminin yerini tutan ozel tanimlamdir
		publicdegisken=10;
		//privatedegiskene erisemezsiniz
		protecteddegisken=10;
	}
	
	
}

class Otcul extends Hayvan{
	public Otcul(){
		System.out.println("Otcul sinifinin kurucusu tetiklendi.");
	}
	
	
	//Kalitildigi sinifta Var olan fonksiyonu Uzerine bindirmek
	//Yeni ozellikler eklemek
	//@Override 
	public void Beslenme(){
		System.out.println("Otcul.Beslenme fonksiyonu. Otcullar yalnizca otla Beslenir...");
	}
	
	//@Override
	public void CeneYapisi(){
		System.out.println("Otcul.CeneYapisi fonksiyonu tetiklendi. Ogutucu disler gelismistir");
	}
	
	public void MideYapisi(){
		System.out.println("Otcullarin mideleri 4 bolumden olusur.");
	}
	
}


class Kuslar extends Etcil{
	public Kuslar(){
		System.out.println("Etcilden tureyen Kuslar sinifinin kurucusu tetiklendi.");
	}
	
	//@Override 
	public void Beslenme(){
		System.out.println("Kuslar.Beslenme fonksiyonu. Etcil kuslar yalnizca etle Beslenir...");
	}
	
	//@Override
	public void CeneYapisi(){
		System.out.println("Kuslar.CeneYapisi fonksiyonu tetiklendi. Etcil kuslar sivri gagalidir");
	}
	
	public void KuslarGoster(){
		super.Goster();
		//En ust sinifin isminin yerini tutan ozel tanimlamdir
		//En ust sinifin isminin yerini tutan ozel tanimlamdir
		publicdegisken=10;
		//privatedegiskene erisemezsiniz
		protecteddegisken=10;
	}
	
}



