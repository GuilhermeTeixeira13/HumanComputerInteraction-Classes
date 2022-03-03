package Nutrition;
import java.io.PrintStream;

public class Nutrition {
    public static void main(String[] args) {
        FileIN f = new FileIN("http://www.di.ubi.pt/~jpaulo/ensino/IHC/praticas/nutrition.txt");
        
        f.open();
        
        String[] content;
        content = f.readAll();
        
        // Column titles
        System.out.printf("%-35s%35s\t\t\t\t\t%-35s%35s%35s%35s%35s%35s\n", "Food", "Calcium [mg]", "Serving Size", "Weight[g]", "percent water", "Energy [kcal]", "kcal/100g","Protein [g]", "Carbohydrate [g]");
        
        double adderCalcium=0, adderWeight=0, adderWater=0, adderCalorias=0, adderCaloriasPor100=0, adderProtein=0; 
        int line;
        
        // Content is an array of Strings (lines)
        // A line is an array of Strings (words)
        for(line=1; line<content.length; line++){
            String[] palavrasDaLinha;
            palavrasDaLinha = content[line].split("[|]");
            
            String FoodName = palavrasDaLinha[0];
            double Calcium = Double.parseDouble(palavrasDaLinha[1]);
            String ServingSize = palavrasDaLinha[2];
            double weight = Double.parseDouble(palavrasDaLinha[3]); 
            double water = Double.parseDouble(palavrasDaLinha[4]);
            double energy = Double.parseDouble(palavrasDaLinha[5]);
            double protein = Double.parseDouble(palavrasDaLinha[6].replace(",","."));
            double energy100g = 100*energy/weight;
          
            adderCalcium += Calcium;
            adderWeight += weight;
            adderWater += water;
            adderCalorias += energy;
            adderCaloriasPor100 += energy100g;
            adderProtein += protein;
            
            // Added column with the value of energy/100g
            System.out.printf("%-35s%35.1f\t\t\t\t\t%-35s%35.1f%35.1f%35.1f%35.1f%35.1f\n", FoodName, Calcium, ServingSize, weight, water, energy, energy100g, protein);
        }
        
        // Final line with average values
        System.out.printf("\n%-35s%35.1f\t\t\t\t\t%-35.1s%35.1f%35.1f%35.1f%35.1f%35.1f\n", "Average:", adderCalcium/line, "", adderWeight/line, adderWater/line, adderCalorias/line, adderCaloriasPor100/line, adderProtein/line);
        
        f.close();
    }    
}
