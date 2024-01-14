import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		Kullanici[] kullanicilar=new Kullanici[10];
		Asansor asansorRun=new Asansor();
		int kisiSay;
		boolean devam=true;

		System.out.println("Asansör Örneği");	
		while(devam) {
			
			System.out.println("1: CALISTIR");
			System.out.println("2: BİTİR");
			int a=scan.nextInt();
		switch(a) {
		case 1:
			kisiSay=rand.nextInt(6)+1;
			kullanicilar =new Kullanici[kisiSay];
			for(int i=0;i<kisiSay;i++) {
				kullanicilar[i]=new Kullanici(rand.nextInt(5)+1, rand.nextInt(7), rand.nextInt(7));
				while(kullanicilar[i].getGidilecekkat()==kullanicilar[i].getCagrilanKat()) {
					kullanicilar[i].setGidilecekkat(rand.nextInt(7));
				}
			}
			asansorRun.Run(kullanicilar);
			break;
		case 2:
			devam=false;
			break;
		}

	}

}
}
