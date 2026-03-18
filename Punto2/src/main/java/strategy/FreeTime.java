package strategy;

import java.util.List;

public class FreeTime implements Strategy{
    private int time;
    
    public FreeTime(int time){
        this.time = time;
    }
    
    
    @Override
    public List<String> recommended(List<String> catalog) {
        return List.of("Contenido que dura menos de " + time + "minutos");
    }
    
    
}
