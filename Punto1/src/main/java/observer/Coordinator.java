package observer;

public class Coordinator implements Observer{
    private String name;
    
    public Coordinator(String name){
        this.name = name;
    }
    
    @Override
    public void update(String event){
        System.out.println(name + "(Coordinadora de movilidad) realiza el informe: " + event);
    }   
}