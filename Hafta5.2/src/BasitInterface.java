
public interface BasitInterface {
	final int a=10;
	
	//Abstract fonksiyon
	void Goruntule();
	int DegerGetir(int a, double b);
	double Degerler();
	
	//Interface de final tanimalama yapilamaz
	//final double Deneme();
	//Interface de static tanimli fonksiyon kullanilamaz
	//static double Deneme2();
	
	//Interface de abstract tanimalam disinda fonksiyon tanimi yapilamaz
	/*
	public String Deneme3(){
		System.out.println("Deneme");
		return "";
	}
	*/	
}

interface BasitInterface2{
	int Durum1();
	double Durum2(double a);
}


//Interface den dogrudan nesne uretilemez dolayisiyla class turetilerek gercklestirilir

class TestInterface2 implements BasitInterface,BasitInterface2{
	//@Override
	public void Goruntule() {
		System.out.println("Goruntule fonksiyonu tetiklendi");		
	}
	
	//@Override
	public double Degerler() {
		return 0;
	}
	
	//@Override
	public int DegerGetir(int a, double b) {
		return 0;
	}
	//@Override
	public int Durum1() {
		return 0;
	}
	//@Override
	public double Durum2(double a) {
		return 0;
	}
	//Yenþi classa kalitimdaki sekilde yeni fonksiyon eklemeleri yapilabilir
	public void Deneme3(){
		
	}
	
}



class TestInterface1 implements BasitInterface{
	//@Override
	public void Goruntule() {
		System.out.println("Goruntule fonksiyonu tetiklendi");		
	}
	
	//@Override
	public double Degerler() {
		return 0;
	}
	
	//@Override
	public int DegerGetir(int a, double b) {
		return 0;
	}
	
	//Yeni classa kalitimdaki sekilde yeni fonksiyon eklemeleri yapilabilir
	public void Deneme(){
		
	}
	
	
	
}

/*
class DenemeClass extends Class1, Class2{
	
}
*/








