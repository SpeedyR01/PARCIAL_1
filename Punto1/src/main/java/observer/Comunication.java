package observer;

public class Comunication implements Observer{
    private String name;
    
    public Comunication(String name){
        this.name = name;
    }
    
    @Override
    public void update(String event){
        System.out.println(name + "(Responsable de comunicaciones) envia boletin y actualizacion: " + event);
    }
    
}
