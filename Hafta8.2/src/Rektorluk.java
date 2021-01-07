import java.util.ArrayList;


public class Rektorluk {
	public int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rektorluk r1=new Rektorluk();
		r1.x=55;
		
		
		
		//Static olmayan nested classslardan nesne turetmek icin
		//Ust classtan faydaanilir
		Rektorluk.Fakulteler fk=r1.new Fakulteler();
		fk.Goster();
		fk.xGoster(999);
		
		
		Rektorluk.DaireBaskanliklari db=r1.new DaireBaskanliklari();
		db.Goster();
		db.xGoster(555);
		
		RektorlukBirimi deneme=new RektorlukBirimi("deneme");
		//Static tanimli nested classlardan dogrudan nesne uretilebilir
		
		//x degerlerini fonksiyon olmadan alma
		System.out.println("---------------");
		System.out.println(r1.x);  //Rektorluk x degeri
		System.out.println(fk.x);  //Fakulteler icerisinde x degeri
		

	}
	
	
	public class Fakulteler{
		public int x=10;
		public ArrayList<String> fakulteler=new ArrayList<String>();
		public void Ekle(String f_ismi){
			fakulteler.add(f_ismi);
		}
		public void Goster(){
			for (String a : fakulteler) {
				System.out.println(a);
			}
		}
		
		public void xGoster(int x){
			System.out.println("Parametre olan x: "+x);
			System.out.println("this.x: "+this.x);
			System.out.println("Rektorluk x:"+ Rektorluk.this.x);
		}
		
		
		class Deneme{
			class Deneme2{
				class Deneme3{
					
				}
			}
		}
		
	}
	
	public class DaireBaskanliklari{
		public int x=7;
		public ArrayList<String> baskanliklar=new ArrayList<String>();
		public void Ekle(String b_ismi){
			baskanliklar.add(b_ismi);
		}
		public void Goster(){
			for (String a : baskanliklar) {
				System.out.println(a);
			}
		}
		
		public void xGoster(int x){
			System.out.println("Parametre olan x: "+x);
			System.out.println("this.x: "+this.x);
			System.out.println("Rektorluk x:"+ Rektorluk.this.x);
		}		
		
		class Deneme{
			class Deneme2{
				class Deneme3{
					
				}
			}
		}
		
	}
	
	public static class RektorlukBirimi{
		public String rektorAdi="Prof. Dr. Tolga DEPCI";
		//Setter Constructer
		RektorlukBirimi(String yeni_isim){
			this.rektorAdi=yeni_isim;
		}
		
		//Getter
		public String getRektor(){
			return rektorAdi;
		}
		
		
		
		
		
	}
	
	

}
