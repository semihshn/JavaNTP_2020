
public interface LambdaIfadeleri {
	public void Goster();
	public void Goster2(int a);
	 
	//default guncel JDK larda gelen interface icerisinde
	//fonksiyonlar icin kod blogu tanimlama durumudur
	/*
	default void Goster3(){
		
	}
	*/


}

interface LabmdaStatic{
	//Static tanimli fonksiyonlar 
	//JDK 8 ile beraber kod blogu ile tanimlanabilir duruma gelmistir
	/*
	public static void Goster2(){
		
	}
	*/
}

interface LambdaReturn{
	public double KareAl();
	//public double KareAl2();
}

interface LambdaReturn2{
	public double KareAl(int a);
}

interface LambdaVoid{
	public void Merhaba(int a);
}

interface LambdaDeneme{
	public void Merhaba0();
	public void Merhaba1(int a);
}




