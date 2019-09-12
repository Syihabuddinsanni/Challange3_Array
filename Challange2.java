package ChallangeArray;

    public class Challange2 {
        public static void main(String[] args){
             int nilai [] = new int [5];
            nilai [0] = 78;
            nilai [1] = 89;
            nilai [2] = 90;
            nilai [3] = 100;
            nilai [4] = 95;
            
            double ratarata = 0.0;
            for(int i=0; i<nilai.length; i++)ratarata+= nilai [i];
            ratarata/=nilai.length;
            
            System.out.println("===== NILAI RATA RATA =====");
            System.out.println(" = "+ ratarata);
            
            if (ratarata > 90){
                System.out.println("Mantul Nice Skor gayn :v ");
                
            }
            if (ratarata < 90){
                System.out.println("Kembangkan bosque udah bagus :v ");
        
                }
            if (ratarata < 75){
                System.err.println("Wah parah ngegame teross!!!! Belajar gan semangat !!! ");
    
}
        }
    }