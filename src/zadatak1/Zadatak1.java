package zadatak1;
import java.util.Arrays;

public class Zadatak1 {
    private static int[] prviNiz;
    private static int[] drugiNiz;
    
    public static void main(String[] args) {
        prviNiz = new int[5];
        for(int i=0;i<prviNiz.length;i++) {
        prviNiz[i] = (int) (Math.random() * 100);
        }
        
        drugiNiz = new int[5];
        for(int i=0;i<drugiNiz.length;i++) {
        drugiNiz[i] = (int) (Math.random() * 100);
        }
        
        System.out.println("Prvi Niz" + "\t" + "Drugi niz");
        for (int i = 0; i < prviNiz.length; i++) {
            System.out.println(prviNiz[i] + "\t" + "\t" + drugiNiz[i]);
        }
        
        int duzina = prviNiz.length + drugiNiz.length;
        int[] spojeni = new int[duzina];
        int pos = 0;
        for (int element : prviNiz) {
            spojeni[pos] = element;
            pos++;
        }
        
        for (int element : drugiNiz) {
            spojeni[pos] = element;
            pos++;
        }
        
        System.out.println("\n" + "Spojeni Prvi i Drugi Niz");
        System.out.println(Arrays.toString(spojeni));
    }
}
