import java.util.Scanner;
import java.util.ArrayList; 

public class WebCrawler {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a URL: "); 
        String url = in.nextLine(); 
        System.out.print("Enter a word to search for: "); 
        String word = in.nextLine(); 
        crawler(url, word); 

    }

    public static void crawler(String startingURL, String word) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>(); 
        ArrayList<String> listOfTraversedURLs = new ArrayList<>(); 
        listOfPendingURLs.add(startingURL); 
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString); 
                System.out.println("Crawl " + urlString); 

                for (String s: getSubURLS(urlString, word)) {
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s); 
                }
            } 
        }
    }

    public static ArrayList<String> getSubURLS(String urlString, String word) {
        ArrayList<String> list = new ArrayList<>(); 

        try {
            java.net.URL url = new java.net.URL(urlString); 
            Scanner in = new Scanner(url.openStream()); 
            int current = 0; 
            while (in.hasNext()) {
                String line = in.nextLine(); 
                if (line.contains(word)) {
                    System.out.println("The word " + word + " was found in: " + urlString); 
                }
                current = line.indexOf("http:", current); 
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current); 
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex)); 
                        current = line.indexOf("http:", endIndex); 
                    }
                    else
                        current = -1; 
                }
            }
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage()); 
        }
        return list;
    }
    
}
