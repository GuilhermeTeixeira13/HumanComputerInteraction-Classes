package Nutrition;
import java.io.PrintStream;

public class Nutrition {
    public static void main(String[] args) {
        FileIN f = new FileIN("http://www.di.ubi.pt/~jpaulo/ensino/IHC/praticas/nutrition.txt");
        
        f.open();
        
        String[] conteudo;
        conteudo = f.readAll();
        
        System.out.printf("%-35s%35s\t\t\t\t\t%-35s%35s%35s%35s%35s%35s\n", "Food", "Calcium [mg]", "Serving Size", "Weight[g]", "percent water", "Energy [kcal]", "kcal/100g","Protein [g]", "Carbohydrate [g]");
        
        // Cada linha é uma string
        for(int i=1; i<conteudo.length; i++){
            String[] partesDaLinha;
            partesDaLinha = conteudo[i].split("[|]");
            
            Integer peso = Integer.parseInt(partesDaLinha[3]); 
            Integer cal = Integer.parseInt(partesDaLinha[5]);
            Integer calPor100 = 100*cal/peso;
        
            
            System.out.printf("%-35s%35s\t\t\t\t\t%-35s%35s%35s%35s%35d%35s", partesDaLinha[0], partesDaLinha[1], partesDaLinha[2], partesDaLinha[3], partesDaLinha[4], partesDaLinha[5], calPor100, partesDaLinha[6]);
            System.out.print("\n");
        }
        
        f.close();
    }    
}
