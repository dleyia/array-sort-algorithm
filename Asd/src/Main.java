import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girilen = new Scanner(System.in);
        int[] dizi = new int[10];
        int sayac = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". elemani giriniz");
            int x = girilen.nextInt();
            dizi[i] = x;
        }

        System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection,3-bubble sort,4-merge,5-hepsi,0-exit");
        int secim = girilen.nextInt();
        while (secim != 0) {
            if (secim == 1) {
                System.out.println(sayac + ". adimda 1. durum kullanildi.");
                sayac++;
                for (int i = 0; i < 10; i++) {
                    System.out.println((i+1)+". elemani giriniz");
                    int y = girilen.nextInt();
                    dizi[i] = y;
                    if (i == 9) {
                        System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection sort,3-bubble sort,4-merge sort,5-hepsi,0-exit");
                        secim = girilen.nextInt();
                    }
                }
            }
            if (secim == 2) {
                System.out.println(sayac + ". adimda 2. durum kullanildi.");
                sayac++;
                int newdizi[] = Siralama.Selection(dizi);
                for (int i = 0; i < 10; i++) System.out.println(newdizi[i]);
                System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection sort,3-bubble sort,4-merge sort,5-hepsi,0-exit");
                secim = girilen.nextInt();
            }
            if (secim == 3) {
                System.out.println(sayac + ". adimda 3. durum kullanildi.");
                sayac++;

                    Siralama bubble = new Siralama();
                    bubble.Kabarcik(dizi);

                System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection sort,3-bubble sort,4-merge sort,5-hepsi,0-exit");
                secim = girilen.nextInt();
            }
            if (secim == 4) {
                System.out.println(sayac + ". adimda 4. durum kullanildi.");
                sayac++;
                Siralama.Birlestirme(dizi);
                for (int i = 0; i < 10; i++) System.out.println(dizi[i]);
                System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection sort,3-bubble sort,4-merge sort,5-hepsi,0-exit");
                secim = girilen.nextInt();
            }
            if (secim == 5) {
                System.out.println(sayac + ". adimda 5. durum kullanildi.");
                sayac++;
                for (int i = 0; i < 10; i++) {
                    System.out.println((i+1)+". elemani giriniz"); //1. secim
                    int y = girilen.nextInt();
                    dizi[i] = y;
                }
                int newdizi[] = Siralama.Selection(dizi);//2. secim
                for (int i = 0; i < 10; i++) {
                    System.out.println(newdizi[i]);
                }
    
                Siralama bubble = new Siralama();//3. secim
                bubble.Kabarcik(dizi);
                Siralama.Birlestirme(dizi);//4. secim
                for (int i = 0; i < 10; i++) System.out.println(dizi[i]);
                System.out.println("yapmak istediğiniz işlemi seçiniz:1-yeni dizi oluşturmak,2-selection sort,3-bubble sort,4-merge sort,5-hepsi,0-exit");
                secim = girilen.nextInt();
            }

        }

    }
}