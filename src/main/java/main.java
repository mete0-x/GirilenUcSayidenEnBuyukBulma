
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
        // Kullanıcıdan Alınan 3 Sayıdan En Büyük Sayıyı Bulma
  
          
            Scanner scanner = new Scanner(System.in);

            System.out.println("Birinci Sayi Giriniz :");
            int birinci_sayi = scanner.nextInt();
            System.out.println("İkinci Sayi Giriniz :");
            int ikinci_sayi = scanner.nextInt();
            System.out.println("Üçüncü Sayi Giriniz :");
            int ucucncu_sayi = scanner.nextInt();

            int maks = -1;

            if(birinci_sayi >= ikinci_sayi && birinci_sayi >= ucucncu_sayi){

                  maks = birinci_sayi;
           }
            else if(ikinci_sayi >= birinci_sayi && ikinci_sayi >= ucucncu_sayi){

                  maks = ikinci_sayi;
           }
            else {
            
                  maks = ucucncu_sayi;
           }
         
           System.out.println("En Büyük Sayi :"+maks);
      }

}
