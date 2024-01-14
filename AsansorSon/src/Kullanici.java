import java.util.Random;

public class Kullanici {
private int kisiSayisi;
private int agirlik;
private int cagrilanKat;
private int gidilecekkat;

public Kullanici(int kisiSayisi,int cagrilanKat, int gidilecekkat) {
	super();
	this.kisiSayisi = kisiSayisi;
	this.agirlik = kisiSayisi*80;
	this.cagrilanKat = cagrilanKat;
	this.gidilecekkat = gidilecekkat;
}
public int getKisiSayisi() {
	return kisiSayisi;
}
public void setKisiSayisi(Random rand) {
	this.kisiSayisi = rand.nextInt(4)+1;
}
public int getAgirlik() {
	return agirlik;
}
public void setAgirlik(int kisi) {
	this.agirlik = kisi*80;
}
public int getCagrilanKat() {
	return cagrilanKat;
}
public void setCagrilanKat(Random rand) {
	this.cagrilanKat = rand.nextInt(7);
}
public int getGidilecekkat() {
	return gidilecekkat;
}
public void setGidilecekkat(int i) {
	this.gidilecekkat = i;
}

}
