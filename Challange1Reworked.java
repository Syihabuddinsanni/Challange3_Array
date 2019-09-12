package ChallangeArray;

import java.util.Scanner;

    public class Challange1Reworked {
    public static void main(String[] args){
              Scanner hab = new Scanner(System.in);
        
        String[] nama = new String[11];
        int p;
       
        System.out.println("-----BIODATA ANGKATAN 28-----");
        System.out.println("===============================");
         nama[0] = "SYIHAB";
        nama[1] = "RENDY PRAYATA WIBAWA / Asli Tuban / 0858 041 46990 / Hobi : Main game / @Rendiwibawa";
        nama[2] = "RUQUL ADAM HIMAWAN / Asli Srengat / 0859 193 774 917 / Hobi : Main game / @Adamhim_";
        nama[3] = "SHEVANDRA QEYSA / Asli Jombang / 0821 2291 4244 / Hobi : Membaca / @Sqeysaa  ";
         nama[4] = "YUSRIL MUSTOFA / Asli Turen / 085 231 371 755 / Hobi : Main game / @Pramuda_Yusril  ";
        nama[5] = "NAUFAL GAJENDRA / Asli Malang / 081 233 333 112 / Hobi : Main game / @Noe_ewew";
        nama[6] = "MEMOREZA SABANA / Asli Bojonegoro / 085 736 041 408 / Hobi : Main game / @Ozaz_  ";
        nama[7] = "MUHAMMAD DAMAR WIDYANSYAH / asli Tulungagung / 081 455 028 343 / Hobi : Main game / @Damawdsyh  ";
        nama[8] = "VIKO ATHMAT VERNANDA / Asli Probolingo / 081 217 507779 / Hobi : Main game / @Captainhimer_  ";
        nama[9] = "FAKHAR REZA ALAMSYACKH / Asli P / 081 217 507779 / Hobi : Main game / @Captainhimer_  ";
        nama[10] = "LUKMAN HIDAYATULLAH / Asli Panjen / 0822 1009 2669 / Hobi : Main Game / @L_ahha_";
    
    

    
    
         System.out.println("0. SYIHAB");
        System.out.println("1. RENDY PRAYATA WIBAWA ");
        System.out.println("2. ADAM HIMAWAN ");
        System.out.println("3. SHEVANDRA QEYSA ");
        System.out.println("4. YUSRIL MUSTOFA ");
        System.out.println("5. NAUFAL GAJENDRA ");
        System.out.println("6. MEMOREZA SABANA ");
        System.out.println("7. MUHAMMAD DAMAR WIDYANSYAH "); 
        System.out.println("8. VIKO ATHMAT VENANDA ");
        System.out.println("9. FAKHAR REZA ALAMSYACH ");
        System.out.println("10. LUKMAN HIDAYATULLAH ");
        
        System.err.print("Pilih Data yang ingin anda lihat 0 - 10 : ");
        
        p = hab.nextInt();
    if (p == 0){
         System.out.println(nama[0]);
    }
     if (p == 1){
        System.out.println(nama[1]);
    }
      if (p == 2){
        System.out.println(nama[2]);
    }
       if (p == 3){
         System.out.println(nama[3]);
    }
        if (p == 4){
        System.out.println(nama[4]);
    }
         if (p == 5){
        System.out.println(nama[5]);
    }
          if (p == 6){
        System.out.println(nama[6]);
    }
           if (p == 7){
        System.out.println(nama[7]);
    }
            if (p == 8){
        System.out.println(nama[8]);
    }
             if (p == 9){
        System.out.println(nama[9]);
        }
              if (p == 10){
         System.out.println(nama[10]);
        }
    
    
    
    
        }
        }
    

