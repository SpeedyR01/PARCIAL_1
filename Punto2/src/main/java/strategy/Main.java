package strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> catalog = List.of("Pelicula 1", "Juebo B", "Cancion C", "Podcast D");
        
        User user1 = new User("Ana");
        user1.setStrategy(new HistoryStrategy());
        user1.showRecomendation(catalog);
        
        User user2 = new User("Pedro");
        user2.setStrategy(new GlobalPopularity());
        user2.showRecomendation(catalog);
        
        User user3 = new User("Sofia");
        user3.setStrategy(new Feeling("Feliz"));
        user3.showRecomendation(catalog);
        
        User user4 = new User("Camiilo");
        user4.setStrategy(new FreeTime(120));
        user4.showRecomendation(catalog);
    }
    
}
