
public class AbstractSiniflar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generaller a=new Generaller();
		a.EnUstKomuta("Savas");
		
		//Abstract class dan nesne olusturulmak istenirse
		//Sinif icerisinde override edilecek fonksiyon getirilir
		Asker deneme=new Asker() {
			
			public void Yetki() {
				// TODO Auto-generated method stub
				
			}
		};
		
		}

}

abstract class Asker{
	int yas=18;
	//getter fonksiyonu
	public int getYas() {
		return yas;
	}
	//setter fonksiyonu
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	public abstract void Yetki();
	//Normal class yapilarinda abstract tanimalam yapilamaz
	//abstract tanimalam kod blogu icermeyecek sekilde 
	//fonksiyon adi, donus tipi ve erisim degeri olan fonksiyondur
	
	//finalize: deconstructure yikici
	//final : degistirielemeyen fonksiyonlardir
	//kalitim sonrasi turetilecek olan yeni class larda override edilemez
	
	public final void EnUstKomuta(String durum){
		if(durum=="Savas"){
			System.out.println("Askeriyeyi Cumhurbaskani yonetir");
		}
		else{
			System.out.println("Askeriyeyi genel kurmay baskani yonetir");
		}
	}
	
}

class Generaller extends Asker{
	//@Override
	//Abstract tanimalnmis olan fonksiyonlar kesinlikle override edilmelidir
	public void Yetki(){
		System.out.println("Komuta zincirinin en ustundedir.");
	}
	
	//Final oldugu icin override edilemedi
	// public final void EnUstKomuta(String durum){}
	
}

class Er extends Asker{
	//@Override
	//Abstract tanimalnmis olan fonksiyonlar kesinlikle override edilmelidir
	public void Yetki(){
		System.out.println("Komuta zincirinin en alt kademesindedir.");
	}

	
}
