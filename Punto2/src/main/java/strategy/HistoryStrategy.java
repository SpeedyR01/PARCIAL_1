package strategy;

import java.util.List;

public class HistoryStrategy implements Strategy{
    @Override
    public List<String> recommended(List<String> catalog) {
        return List.of("Peliculas basadas en lo que ya consumio", "Musica basada en lo que ya consumio",
                "Videojuegos basados en lo que ya consumio", "Podcast basados en lo que ya consumio");
    }
}
