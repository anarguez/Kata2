package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"pepe", "juan", "ana", "ana", "juan", "rosa"};
        
        //Integer[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        for (String key : histogr.keySet()) {
            System.out.println(key + "-->" + histogr.get(key));
        }
        
        
    }
    
}
