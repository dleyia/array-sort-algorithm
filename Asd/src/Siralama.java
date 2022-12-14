public class Siralama {

  public static int [] Selection(int[]dizi){
      int gecici, n;
      for(int i=0;i<10;i++){
          n=i;
          for(int j=i;j<10;j++){
              if(dizi[j]<dizi[n]){
                  n=j;
              }
          }
          gecici=dizi[i];
          dizi[i]=dizi[n];
          dizi[n]=gecici;
      }
      return dizi;
  }
  public static void Kabarcik(int[]dizi){
      int lngth=dizi.length;
      int gecici;
      for (int i = 0; i < dizi.length - 1; i++)
            for (int j = 0; j < dizi.length - i - 1; j++)
                if (dizi[j] > dizi[j + 1]) {
                    gecici = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = gecici;
                }
      for(int i=0;i<lngth;i++){
          System.out.println(dizi[i]);
      }
  }
  public static void Birlestirme(int[]dizi){
      int lngth=dizi.length;

      if(lngth<2){
          return;
      }

      int ortaEleman=lngth/2;
      int[]solYari=new int[ortaEleman];
      int[]sagYari=new int[lngth-ortaEleman];

      for(int i=0;i<ortaEleman;i++){
          solYari[i]=dizi[i];
      }
      for(int i=ortaEleman;i<lngth;i++){
          sagYari[i-ortaEleman]=dizi[i];
      }
      Birlestirme(solYari);
      Birlestirme(sagYari);
      merge(dizi, solYari,sagYari);
  }
  public static void merge(int[]dizi, int[]solYari, int[]sagYari){
      int solBuyukluk=solYari.length;
      int sagBuyukluk=sagYari.length;
      int i=0, j=0, k=0;
      while(i<solBuyukluk&&j<sagBuyukluk){
          if(solYari[i]<=sagYari[i]){
              dizi[k]=solYari[i];
              i++;
          }
          else{
              dizi[k]=sagYari[j];
              j++;
          }
          k++;
      }
      while(i<solBuyukluk){
          dizi[k]=solYari[i];
          i++;
          k++;
      }
      while(j<sagBuyukluk){
          dizi[k]=sagYari[j];
          j++;
          k++;
      }
  }
}