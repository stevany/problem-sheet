
import java.util.HashMap;
import java.util.function.BiConsumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Edge {

    public static void printOutput(HashMap<String, Double> hmap) {
        BiConsumer<String, Double> consumer = (h1, h2)
                -> System.out.println("'" + h1 + "' : " + h2);

        hmap.forEach(consumer);
    }
    public static HashMap<String, Double> listWrapper(){
        HashMap<String, Double> hmap = new HashMap<String, Double>();
        /*Adding elements to HashMap*/
        hmap.put("a", 1.0);
        hmap.put("b", 2.0);
        hmap.put("c", 3.0);
        return hmap;
              
    }
    public static void main(String[] args) {
        HashMap<String, Double> hmap = listWrapper();
        printOutput(hmap);

    }
}
