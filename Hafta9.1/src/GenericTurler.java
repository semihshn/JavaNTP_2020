class Sifreler<T>{
	public T deger;
	String algoritma="";
	
	void Cagir(){
		System.out.println(deger.getClass().getName());
	}
	
	void Olustur(T parametre){
		if (deger.getClass().getName()=="java.lang.Integer") {
			System.out.println("Deger Integer");
		} 
		else if(deger.getClass().getName()=="java.lang.String") {
			System.out.println("Deger String");
		}
	}
}


class SifrelemeComplex<T, G>{
	public T deger;
	public G algoritma;
	
	void Olustur(T a){
		if (deger.getClass().getName()=="java.lang.Integer") {
			System.out.println("Deger Integer");
		} 
		else if(algoritma.getClass().getName()=="java.lang.String") {
			System.out.println("Deger String");
		}
	}
}

//Kendi tipim
class Kenditipim<M>{
	public M id;
}

class TipinTipi<Kenditipim>{
	public Kenditipim degiskenTipim;
}

class TipinTipininTipi<TipinTipi>{
	public TipinTipi degiskenTipTipi;
}




public class GenericTurler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sifreler<String> a=new Sifreler<String>();
		a.deger="deneme";
		a.Olustur("parametrem");
		
		Sifreler<Integer> b=new Sifreler<Integer>();
		b.deger=5;
		b.Olustur(55);
		
		SifrelemeComplex<Integer, String> c=new SifrelemeComplex<>();
		c.deger=51;
		c.algoritma="MD5";
		
		
		Sifreler<Kenditipim<String>> d=new Sifreler<>();
		TipinTipi<Kenditipim<Integer>> e=new TipinTipi<>();
		
		
		TipinTipininTipi<TipinTipi<Kenditipim<Integer>>> f=new TipinTipininTipi<>();
		
	}

}
