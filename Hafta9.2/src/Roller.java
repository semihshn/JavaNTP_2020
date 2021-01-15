abstract class DevamDurumu{
	public abstract boolean Devam();
	int devamsizlik;
}

class SosyalSorumluluk extends DevamDurumu{
	@Override
	public boolean Devam() {
		// TODO Auto-generated method stub
		//Kalmasi ve Kalmamasi
		if(devamsizlik>15)
			return true;
		else
			return false;
	}
	
	public void DevamsizliktanKalmaDurumu(){
		if(Devam()){
			System.out.println("SosyalSorumluluk ogrencisi Devamsizliktan kaldi");
		}
		else{
			System.out.println("SosyalSorumluluk ogrencisi Devamsizlik hakký var");
		}
	}
	
	
}


class Tamzamanli extends DevamDurumu{
	@Override
	public boolean Devam() {
		// TODO Auto-generated method stub
		//Kalmasi ve Kalmamasi
		if(devamsizlik>10)
			return true;
		else
			return false;
	}
	
	public void DevamsizliktanKalmaDurumu(){
		if(Devam()){
			System.out.println("TamZamanli ogrencisi Devamsizliktan kaldi");
		}
		else{
			System.out.println("TamZamanli ogrencisi Devamsizlik hakký var");
		}
	}
}


class NormalOgrenci extends DevamDurumu{
	@Override
	public boolean Devam() {
		// TODO Auto-generated method stub
		//Kalmasi ve Kalmamasi
		if(devamsizlik>8)
			return true;
		else
			return false;
	}
	
	public void DevamsizliktanKalmaDurumu(){
		if(Devam()){
			System.out.println("Normal ogrencisi Devamsizliktan kaldi");
		}
		else{
			System.out.println("Normal ogrencisi Devamsizlik hakký var");
		}
	}
}







abstract class Egitim{
	public abstract boolean mezuniyet(double AKTS_ortalama);
}

class Lisans extends Egitim{
	@Override
	public boolean mezuniyet(double AKTS_ortalama) {
		// TODO Auto-generated method stub
		if (AKTS_ortalama>2) {
			return true;
		} else {
			return false;
		}
		
	}	
}

class YLisans extends Egitim{
	@Override
	public boolean mezuniyet(double AKTS_ortalama) {
		// TODO Auto-generated method stub
		if (AKTS_ortalama>2.5) {
			return true;
		} else {
			return false;
		}
		
	}	
}

//Olusturulan rollerin bir temel sinifa aktarimi olmalidir

class Ogrenci{
	int ogrno;
	String isim;
	//...
	
	//Roller icin egitim classindan rollerden biri tanimlanacak
	Egitim egitimSeviyesiRolu;
	//Roller icin DevamDurumu classindan rollerin biri tanimlanacak
	DevamDurumu devamRolu;
}



public class Roller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ogrenci ogr1=new Ogrenci();
		ogr1.devamRolu=new SosyalSorumluluk();
		ogr1.devamRolu.devamsizlik=13;
		System.out.println("Ogrencinin devavsizliktan kaldi mi?"+ogr1.devamRolu.Devam());
		
		ogr1.devamRolu=new Tamzamanli();
		ogr1.devamRolu.devamsizlik=13;
		System.out.println("Ogrencinin devavsizliktan kaldi mi?"+ogr1.devamRolu.Devam());
		
		
		//ogr1.devamRolu.DevamsizliktanKalmaDurumu();
		//Rol tanimlamalarinda yalnizca abstract tanimli fonksiyonlar devsirilebilir
		//Rol tanimlamalarda yeni olusturulmus fonksiyonlara erisim saglanamaz
		
		Tamzamanli ogr2=new Tamzamanli();
		ogr2.devamsizlik=13;
		ogr2.DevamsizliktanKalmaDurumu();
		
		
		ogr1.egitimSeviyesiRolu=new Lisans();
		System.out.println("Ogrenci mezun mu?"+ogr1.egitimSeviyesiRolu.mezuniyet(2.25));
		
		ogr1.egitimSeviyesiRolu=new YLisans();
		System.out.println("Ogrenci mezun mu?"+ogr1.egitimSeviyesiRolu.mezuniyet(2.25));
		
		
	}

}
