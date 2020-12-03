
public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			Uret b=new Uret(i);
		}
		
		System.out.println("-----------------");
		System.gc();
		//Garbage Collector calistirma
		for (int i = 10; i < 25; i++) {
			Uret b=new Uret(i);
		}
		System.gc();
		
		
		
	}

}

class Uret{
	int i=0;
	//Kurucu fonksiyon
	Uret(int i){
		this.i=i;
		System.out.println((i+1)+". Object oluþturuldu:");
	}
	//Yikici fonksiyon
	public void finalize(){
		System.out.println((i+1)+". Object silindi:");
	}
}
