
public class LambdaIfadeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfaceden nesne turetme yollari
		
		
		//1.METOT
		LambdaIfadeleri obj1=new LambdaIfadeleri() {			
			@Override
			public void Goster2(int a) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Goster() {
				// TODO Auto-generated method stub
				System.out.println("Nesne olusturulmak icin uretilen local classa ait Goster fonksiyonu ");
			}
		};
		obj1.Goster();
		
		//2.METOT
		LambdaIfadeleri obj2=new Deneme();
		obj2.Goster();
		
		//3.METOT
		Deneme obj3=new Deneme();
		obj3.Goster();
		
		//4.METOT
		
		//LAMBDA IFADELERI
		LambdaReturn obj4=()->{return 5*5;};		
		LambdaReturn obj5=()-> 5*5;
		
		LambdaReturn2 obj6=(a)->{return a*a;};
		//Eger fonksiyon tek satir olacaksa { } kullanilmayabilir
		LambdaReturn2 obj7=(a)->a*a;
		//Eger lambda ile kullanilacak fonksiyon tek parametreli ise ( ) kullanilmayabilir
		LambdaReturn2 obj8=a->a*a;
		
		LambdaVoid obj9=a-> System.out.println("Merhaba" + a);
		//void turunden gerceklestirme
		
		
		
		
		
		
		
		
		
		
	}
	

}

class Deneme implements LambdaIfadeleri{
	//@Override
	public void Goster() {
		// TODO Auto-generated method stub
		System.out.println("(Deneme) Override edilen Goster fonksiyonu");
	}
	
	//@Override
	public void Goster2(int a) {
		// TODO Auto-generated method stub
		System.out.println("(Deneme) Override edilen parametreli Goster2 fonksiyonu"+a);
	}
}
