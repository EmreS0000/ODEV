class Asansor implements AsansorMove {
    private final int maxKapasite = 600;
    private int currentFloor;
    private final int Kat=7;
    int min=7;
    int minİndex;
    @Override
    public void up(int d) {
        for (int i = 0; i < d; i++) {
        	System.out.println("ŞUANKİ KAT" + currentFloor);
            currentFloor += 1;
           
        }
        System.out.println("ŞUANKİ KAT" + currentFloor);
    }

    @Override
    public void down(int d) {
        for (int i = 0; i < d; i++) {
            System.out.println("ŞUANKİ KAT" + currentFloor);
            currentFloor -= 1;
        }
        System.out.println("ŞUANKİ KAT" + currentFloor);
    }

    @Override
    public void doorOpen() {
        System.out.println("KAPI AÇILDI");
    }

    @Override
    public void doorClose() {
        System.out.println("KAPI KAPANIYOR");
    }

    public void Run(Kullanici[] kullanicilar) {

        for (int i = 0; i < kullanicilar.length; i++) {
        	if(kullanicilar[i].getAgirlik()>maxKapasite) {
        		System.out.println("OVERLOAD");
        		return;
        	}
            if (kullanicilar[i].getCagrilanKat() < currentFloor) {
                doorClose();
                down(currentFloor - kullanicilar[i].getCagrilanKat());
                doorOpen();
                System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi bindi" + kullanicilar[i].getGidilecekkat() + ".kata gidiyor");
                if (i < kullanicilar.length - 1 &&
                    kullanicilar[i].getCagrilanKat() < kullanicilar[i + 1].getCagrilanKat() &&
                    kullanicilar[i + 1].getCagrilanKat() < kullanicilar[i].getGidilecekkat()) {
                    doorClose();
                    up(kullanicilar[i + 1].getCagrilanKat() - currentFloor);
                    doorOpen();
                    System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i + 1].getKisiSayisi() + "kisi bindi" + kullanicilar[i + 1].getGidilecekkat() + ".kata gidiyor");
                    if (kullanicilar[i].getGidilecekkat() < kullanicilar[i + 1].getGidilecekkat()) {
                        doorClose();
                        up(kullanicilar[i].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi" + kullanicilar[i + 1].getGidilecekkat() + ".kata gidiyor");
                        doorClose();
                        up(kullanicilar[i + 1].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                        i++;
                    } else if (kullanicilar[i].getGidilecekkat() > kullanicilar[i + 1].getGidilecekkat()) {
                        doorClose();
                        up(kullanicilar[i + 1].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i + 1].getKisiSayisi() + "kisi indi" + kullanicilar[i].getGidilecekkat() + ".kata gidiyor");
                        doorClose();
                        up(kullanicilar[i].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                        i++;
                    }
                } else {
                    if (kullanicilar[i].getGidilecekkat() < currentFloor) {
                        doorClose();
                        down(currentFloor - kullanicilar[i].getGidilecekkat());
                        doorOpen();
                        System.out.println(i + ".kullanici grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                    } else {
                        doorClose();
                        up(kullanicilar[i].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + ".kullanici grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                    }
                }
            } else if (kullanicilar[i].getCagrilanKat() > currentFloor) {
                doorClose();
                up(kullanicilar[i].getCagrilanKat() - currentFloor);
                doorOpen();
                System.out.println(i + ".kullanici grubu " + kullanicilar[i].getKisiSayisi() + "kisi bindi" + kullanicilar[i].getGidilecekkat() + ".kata gidiyor");
                if (i < kullanicilar.length - 1 &&
                    kullanicilar[i].getCagrilanKat() > kullanicilar[i].getCagrilanKat() &&
                    kullanicilar[i + 1].getCagrilanKat() > kullanicilar[i].getGidilecekkat()) {
                    doorClose();
                    down(currentFloor - kullanicilar[i + 1].getCagrilanKat());
                    doorOpen();
                    System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i + 1].getKisiSayisi() + "kisi bindi");
                    if (kullanicilar[i].getGidilecekkat() > kullanicilar[i + 1].getGidilecekkat()) {
                        doorClose();
                        down(currentFloor - kullanicilar[i].getGidilecekkat());
                        doorOpen();
                        System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi" + kullanicilar[i + 1].getGidilecekkat() + ".kata gidiyor");
                        doorClose();
                        down(currentFloor - kullanicilar[i + 1].getGidilecekkat());
                        doorOpen();
                        System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i + 1].getKisiSayisi() + "kisi indi");
                        i++;
                    } else if (kullanicilar[i].getGidilecekkat() < kullanicilar[i + 1].getGidilecekkat()) {
                        doorClose();
                        down(currentFloor - kullanicilar[i + 1].getGidilecekkat());
                        doorOpen();
                        System.out.println(i + 1 + ".kullanci grubu " + kullanicilar[i + 1].getKisiSayisi() + "kisi indi" + kullanicilar[i].getGidilecekkat() + ".kata gidiyor");
                        doorClose();
                        down(currentFloor - kullanicilar[i].getGidilecekkat());
                        doorOpen();
                       System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                        i++;
                    }
                } else {
                    if (kullanicilar[i].getGidilecekkat() < currentFloor) {
                        doorClose();
                        down(currentFloor - kullanicilar[i].getGidilecekkat());
                        doorOpen();
                        System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                    } else {
                        doorClose();
                        up(kullanicilar[i].getGidilecekkat() - currentFloor);
                        doorOpen();
                        System.out.println(i + ".kullanci grubu " + kullanicilar[i].getKisiSayisi() + "kisi indi");
                    }
                }
            }
        }
        return;
    }
}
    
    