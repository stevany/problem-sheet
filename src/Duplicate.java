
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Duplicate {

    public static Set<String> duplicateWords(String[] input) {
        if (input == null || input.length == 0) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<>();
        Set<String> set = new HashSet<>();

        for (String word : input) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        String[] test = {"two", "one", "two"};
        Set<String> duplicates = duplicateWords(test);
        System.out.println("output : " + duplicates);

    }

}
