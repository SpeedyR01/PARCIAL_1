package strategy;

import java.util.List;

public class GlobalPopularity implements Strategy{

    @Override
    public List<String> recommended(List<String> catalog) {
        return List.of("Top 10 global","Lo mas visto");
    }
}
