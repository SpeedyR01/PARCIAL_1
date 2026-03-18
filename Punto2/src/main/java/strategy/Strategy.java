package strategy;

import java.util.List;

public interface Strategy {
    List<String> recommended(List<String> catalog);
}
