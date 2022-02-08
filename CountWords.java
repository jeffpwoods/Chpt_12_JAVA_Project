/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeffp
 */

import java.util.Scanner;
import java.net.URL;

public class CountWords {

    public static void main(String[] args) 
    throws java.io.IOException, java.net.MalformedURLException {
        
        URL url = new URL("https://liveexample.pearsoncmg.com/data/Lincoln.txt"); 
        int count;
        try (Scanner in = new Scanner(url.openStream())) {
            count = 0;
            while (in.hasNext()) {
                String nextWord = in.next();
                if (nextWord.trim().length() > 0) {
                    count += 1;
                } 
            }
        }
        
        System.out.println("The word count is: " + count);
        
    }

}
