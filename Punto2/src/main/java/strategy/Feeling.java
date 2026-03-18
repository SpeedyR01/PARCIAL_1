package strategy;

import java.util.List;

public class Feeling implements Strategy{
    private String feelName;
    
    public Feeling(String feelName){
        this.feelName = feelName;
    }
    
    @Override
    public List<String> recommended(List<String> catalog) {
        return List.of("Cuanto te sientes: " + feelName);
    }
    
}
