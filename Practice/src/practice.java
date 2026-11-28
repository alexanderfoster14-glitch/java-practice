import java.util.HashMap;

public class practice {
   public static void main (String[] args) {
      HashMap<String, Integer> stateCountyCount = new HashMap();

      stateCountyCount.put("CO", 63);	//Incorrect according to Google
      stateCountyCount.put("CO", 64);	//Corrected
      stateCountyCount.put("LA", 64);	//Key is different from Colorado
      stateCountyCount.put("MI", 83);
      stateCountyCount.put("NY", 62);

      System.out.print("The number of counties in Colorado is: ");
      System.out.print(stateCountyCount.get("CO"));
      System.out.println(".");
   }
}