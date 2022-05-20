package torpedo;

import java.io.SyncFailedException;
import java.util.Scanner;

public class Torpedo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int talalatok = 0;
        int lovesek = 0;
        
        Hajo hajo = new Hajo();
        TorpedoTeszt t = new TorpedoTeszt();
        
        int talalat[] = new int[3];
        
        while(talalatok < 3){
            System.out.println("Kérem adja meg a lövés pozicióját: ");
            int tipp = sc.nextInt();

            for (int i = 0; i < pozicio.length; i++) {

                if (talalat[tipp] == pozicio[i]){

                    System.out.println("találat!");
                    talalatok ++;

                }else{

                    System.out.println("nem talált!");

                }
                lovesek ++;

            }

        }
        System.out.printf("Kilőtted az összes hajót %d lövésből!", lovesek);
        
    }

    
    
}
