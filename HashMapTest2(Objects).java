import java.util.HashMap;

public class HashMapTest {
    public static void main(String[ ] args) {
        HashMap<String, gameStats> points = new HashMap<String, gameStats>();
        
        gameStats Amy = new gameStats(154,3);
        points.put("Amy", Amy);    
        points.put("Dave", new gameStats(174,7) );
        points.put("Rob", new gameStats(674,39) );
        System.out.println(points.get("Dave").score); 
    }
}

class gameStats{
   public int score = 0;
   public int gamesPlayed = 0;
   
   //Constructor here
   gameStats (int score, int games){
      this.score = score;
      this.gamesPlayed = games; 
   } 


}