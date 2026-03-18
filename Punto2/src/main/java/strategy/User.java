package strategy;

import java.util.List;

public class User {
    private String name;
    private Strategy strategy;
    
    public User(String name){
        this.name = name;
    }
    
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    
    public void showRecomendation(List<String> catalog){
        if(strategy != null){
            System.out.println("Recomendaciones para" + name + ": ");
            strategy.recommended(catalog).forEach(System.out::println);
        } else {
            System.out.println("No hay estrategia");
        }
    }
}
